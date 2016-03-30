package Persistence;

import logic.User;
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
import logic.User;

/**
 *
 * @author Yesica Daniela Vargas Espitia
 * @author Andres Mauricio Perez Escobar
 */
public class FlatFileUser {
  private File file =null;
  private FileReader fr = null;
  private BufferedReader br = null;
  private FileWriter fw = null;
  private PrintWriter pw = null; 

    public FlatFileUser() {
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
    
    
    
    public List<User> readFile(String filename,String separator){
        List<User> userList = new ArrayList<>();
        
        try {
          this.setFile(new File(filename));
          this.setFr(new FileReader(this.getFile()));
          this.setBr(new BufferedReader(this.getFr()));
          String record;
          while ((record = this.getBr().readLine())!=null){
            String fields[] = record.split(separator);
            User user = new User();
            user.setName(fields[0]);
            user.setLastName(fields[1]);
            user.setID(Long.parseLong(fields[2]));
            user.setLogin(fields[3]);
            user.setPassword(fields[4]);
            user.setPhoto(fields[5]);
            user.setType(Integer.parseInt(fields[6]));

            userList.add(user);
          }
          this.getBr().close();
          this.getFr().close();
      } catch (FileNotFoundException fnfex){
      }
       catch (IOException  ex) {
          Logger.getLogger(FlatFileUser.class.getName()).log(Level.SEVERE, null, ex);
      }
       return userList;
    }
    
    public void writeFile(List<User> userList,String filename, String separator){
        try {
          this.setFw(new FileWriter(filename)); //El true sirve para adicionar información 
          this.setPw(new PrintWriter(this.getFw()));
          
          for (User user : userList) //Con esto se recorre la lista
          {
            this.getPw().print(user.getName() + separator);
            this.getPw().print(user.getLastName() + separator);
            this.getPw().print(user.getID()+ separator);
            this.getPw().print(user.getLogin()+ separator);
            this.getPw().print(user.getPassword() + separator);
            this.getPw().print(user.getPhoto()+ separator);
            this.getPw().print(user.getType() + separator);
           
          }
          this.getPw().close();
          this.getFw().close();
      } catch (IOException ex) {
          Logger.getLogger(FlatFileUser.class.getName()).log(Level.SEVERE, null, ex);
      }
    }

  
}
