
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
import logic.Client;

/**
 *
 * @author Yesica Daniela Vargas Espitia
 * @author Andres Mauricio Perez Escobar
 */
public class FlatFileClient {
  private File file =null;
  private FileReader fr = null;
  private BufferedReader br = null;
  private FileWriter fw = null;
  private PrintWriter pw = null; 

    public FlatFileClient() {
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
    
    
    
    public List<Client> readFile(String filename,String separator){
       List<Client> cliList = new ArrayList<>();
    try {
          this.setFile(new File(filename));
          this.setFr(new FileReader(this.getFile()));
          this.setBr(new BufferedReader(this.getFr()));
          String record;
          while((record = this.getBr().readLine())!=null){
             String fields[] = record.split(separator);
             Client cli = new Client();
             cli.setNIT(Integer.parseInt(fields[0]));
             cli.setNameClient(fields[1]);
             cli.setPhone(Integer.parseInt(fields[2]));
             cli.setAdrress(fields[3]);
             
             cliList.add(cli);
             
          }
          this.getBr().close();
          this.getFr().close();
      } catch (FileNotFoundException fnfex){
         
      }
       catch (IOException  ex) {
          Logger.getLogger(FlatFileClient.class.getName()).log(Level.SEVERE, null, ex);
      }
       return cliList;
    }
    
    public void writeFile(List<Client> cliList,String filename, String separator){
        try {
          this.setFw(new FileWriter(filename)); //El true sirve para adicionar información 
          this.setPw(new PrintWriter(this.getFw()));
          
          for (Client cli : cliList) //Con esto se recorre la lista
          {
            this.getPw().print(cli.getNIT() + separator);
            this.getPw().print(cli.getNameClient() + separator);
            this.getPw().print(cli.getPhone()+ separator);
            this.getPw().print(cli.getAdrress()+ separator);
           
          }
          this.getPw().close();
          this.getFw().close();
      } catch (IOException ex) {
          Logger.getLogger(FlatFileClient.class.getName()).log(Level.SEVERE, null, ex);
      }
    }

  
}
