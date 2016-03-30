/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logic.Supply;

/**
 *
 * @author Andres Mauricio Perez Escobar
 * @author Yesica Daniela Vargas Espitia
 * @date 
 */
public class FlatFileSupply {
  private File file =null;
  private FileReader fr = null;
  private BufferedReader br = null;
  private FileWriter fw = null;
  private PrintWriter pw = null; 

    public FlatFileSupply() {
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public FileReader getFr() {
        return fr;
    }

    public void setFr(FileReader fr) {
        this.fr = fr;
    }

    public BufferedReader getBr() {
        return br;
    }

    public void setBr(BufferedReader br) {
        this.br = br;
    }

    public FileWriter getFw() {
        return fw;
    }

    public void setFw(FileWriter fw) {
        this.fw = fw;
    }

    public PrintWriter getPw() {
        return pw;
    }

    public void setPw(PrintWriter pw) {
        this.pw = pw;
    }
    
    
    
    public List<Supply> readFile(String filename,String separator){
       List<Supply> supplyList = new ArrayList<>();
    try {
          this.setFile(new File(filename));
          this.setFr(new FileReader(this.getFile()));
          this.setBr(new BufferedReader(this.getFr()));
          String record;
          SimpleDateFormat dateFormat= new SimpleDateFormat("dd/MM/yyyy");
          while((record = this.getBr().readLine())!=null){
             String fields[] = record.split(separator);
             Supply supply = new Supply();
             supply.setId(Integer.parseInt(fields[0]));
             supply.setName(fields[1]);
             supply.setIdCity(Integer.parseInt(fields[2]));
             supply.setDate(dateFormat.parse(fields[3]));
             supply.setPrice(Integer.parseInt(fields[4]));
             supply.setIdProduct(Integer.parseInt(fields[5]));
             supply.setIdClient(Integer.parseInt(fields[6]));
             supplyList.add(supply);
          }
          this.getBr().close();
          this.getFr().close();
      } catch (FileNotFoundException fnfex){
         
      }
       catch (IOException | ParseException  ex) {
          Logger.getLogger(FlatFileSupply.class.getName()).log(Level.SEVERE, null, ex);
      }
       return supplyList;
    }
    
    public void writeFile(List<Supply> supplyList,String filename, String separator){
      SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
          this.setFw(new FileWriter(filename)); //El true sirve para adicionar información 
          this.setPw(new PrintWriter(this.getFw()));
          
          for (Supply supply : supplyList) //Con esto se recorre la lista
          {
            this.getPw().print(supply.getId() + separator);
            this.getPw().print(supply.getName() + separator);
            this.getPw().print(supply.getIdCity()+ separator);
            this.getPw().print(dateFormat.format(supply.getDate())+ separator);
            this.getPw().print(supply.getPrice()+ separator);
            this.getPw().print(supply.getIdProduct()+ separator);
            this.getPw().print(supply.getIdClient()+ separator);
            
          }
          this.getPw().close();
          this.getFw().close();
      } catch (IOException ex) {
          Logger.getLogger(FlatFileSupply.class.getName()).log(Level.SEVERE, null, ex);
      }
    }

  
}
