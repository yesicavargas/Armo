/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author Yesica Daniela Vargas Espitia
 * @author Andres Mauricio Perez Escobar
 */
public class Principal {
    private String login;       /** user login*/
    private String password;    /** user password*/

    /**
     * default constructor
     */
    public Principal() {
        this.login="";
        this.password="";
    }

    /**
     * constructor with parameters
     * @param login
     * @param password 
     */
    public Principal(String login, String password) {
        this.login = login;
        this.password = password;
    }
    
    /**
     * get the login of the principal 
     * @return 
     */

    public String getLogin() {
        return login;
    }

    /**
     * setthe login of the principal
     * @param login 
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * get the password of the principal
     * @return 
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * set the password of the principal
     * @param password 
     */

    public void setPassword(String password) {
        this.password = password;
    }
 
    
    
}
