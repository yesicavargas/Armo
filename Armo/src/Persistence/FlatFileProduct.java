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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logic.Product;

/**
 *
 * @author Yesica Daniela Vargas Espitia
 * @author Andres Mauricio Perez Escobar
 */
public class FlatFileProduct {
  private File file =null;
  private FileReader fr = null;
  private BufferedReader br = null;
  private FileWriter fw = null;
  private PrintWriter pw = null; 

    public FlatFileProduct() {
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
    
    
    
    public List<Product> readFile(String filename,String separator){
       List<Product> ProductList = new ArrayList<>();
    try {
          this.setFile(new File(filename));
          this.setFr(new FileReader(this.getFile()));
          this.setBr(new BufferedReader(this.getFr()));
          String record;
          while((record = this.getBr().readLine())!=null){
             String fields[] = record.split(separator);
             Product prod = new Product();
             prod.setIdProduct(Integer.parseInt(fields[0]));
             prod.setNameP(fields[1]);
             
             ProductList.add(prod);
             
          }
          this.getBr().close();
          this.getFr().close();
      } catch (FileNotFoundException fnfex){
         
      }
       catch (IOException  ex) {
          Logger.getLogger(FlatFileProduct.class.getName()).log(Level.SEVERE, null, ex);
      }
       return ProductList;
    }
    
    public void writeFile(List<Product> cityList,String filename, String separator){
        try {
          this.setFw(new FileWriter(filename)); //El true sirve para adicionar información 
          this.setPw(new PrintWriter(this.getFw()));
          
          for (Product prod : cityList) //Con esto se recorre la lista
          {
            this.getPw().print(prod.getIdProduct()+ separator);
            this.getPw().print(prod.getNameP() + separator);
           
          }
          this.getPw().close();
          this.getFw().close();
      } catch (IOException ex) {
          Logger.getLogger(FlatFileProduct.class.getName()).log(Level.SEVERE, null, ex);
      }
    }

  
}
