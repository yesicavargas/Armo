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
public class Client_City {
    private long idClient;
    private long idCity;

    /**
     * default constructor
     */
    public Client_City() {
    }
    
    /**
     * constructor with parameters
     * @param idClient
     * @param idCity 
     */

    public Client_City(long idClient, long idCity) {
        this.idClient = idClient;
        this.idCity = idCity;
    }
    
    /**
     * get the idclient of the client city
     * @return 
     */

    public long getIdClient() {
        return idClient;
    }
    
    /**
     * set the idclient of the client city
     * @param idClient 
     */

    public void setIdClient(long idClient) {
        this.idClient = idClient;
    }

    /**
     * get the idcity of the client city
     *
     * @return 
     */
    public long getIdCity() {
        return idCity;
    }

    /**
     * set the idcity of the client city
     * @param idCity 
     */
    public void setIdCity(long idCity) {
        this.idCity = idCity;
    }
    
}
