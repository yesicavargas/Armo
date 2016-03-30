package logic;

/**
 *
 * @author Yesica Daniela Vargas Espitia 
 * @author Andres Mauricio Perez Escobar
 */
public class User {
    
    private String name;        /** user name´s*/    
    private String lastName;    /** user last name´s*/
    private long ID;             /** user ID*/ 
    private String login;       /** user login*/
    private String password;    /** user password*/
    private String photo;       /** user photo*/  
    private int type;


 /**
 * default constructor
 */
    public User() {
        this.name= "";
        this.lastName= "";
        this.ID= 0;
        this.login= "";
        this.password= "";
        this.photo= "";
        this.type=0;
    }
/**
 * parameterized constructor
 * @param name      user name´s
 * @param lastName  user last name´s
 * @param ID        user ID
 * @param login     user login
 * @param password  user password
 * @param photo     user photo
 */
    public User(String name, String lastName, int ID, String login, String password, String photo, int type) {
        this.name = name;
        this.lastName = lastName;
        this.ID = ID;
        this.login = login;
        this.password = password;
        this.photo = photo;
        this.type= type;
    }
    
/**
 * get the user name
 * @return get the user name
 */
    public String getName() {
        return name;
    }
/**
 * get the type of the user
 * @return 
 */
    public int getType() {
        return type;
    }
/**
 * set the type of the user
 * @param type 
 */
    public void setType(int type) {
        this.type = type;
    }
/**
 * rename the user
 * @param name 
 */
    public void setName(String name) {
        this.name = name;
    }
/**
 * get the user last name
 * @return get the user name
 */
    public String getLastName() {
        return lastName;
    }
/**
 * change the last name of the user
 * @param lastName 
 */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
 * get the ID user
 * @return get the ID user
 */
    public long getID() {
        return ID;
    }
/**
 * change the user ID
 * @param ID 
 */
    public void setID(long ID) {
        this.ID = ID;
    }
/**
 * get the user login
 * @return get the user login
 */
    public String getLogin() {
        return login;
    }
/**
 * change the user login
 * @param login 
 */
    public void setLogin(String login) {
        this.login = login;
    }
/**
 * get the user password
 * @return get the administrator password
 */
    public String getPassword() {
        return password;
    }
/**
 *  change the user password
 * @param password 
 */
    public void setPassword(String password) {
        this.password = password;
    }
 /**
  *  get the user photo
  * @return get the useror photo
  */
    public String getPhoto() {
        return photo;
    }
/**
 * change the userr photo
 * @param photo 
 */
    public void setPhoto(String photo) {
        this.photo = photo;
    }

}

