package logic;

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yesica Daniela Vargas Espitia 
 * @author Andres Mauricio Perez Escobar
 */
public class Supply {
    private int id;                /** supply code*/
    private String name;             /** supply name*/ 
    private int idCity;
    private Date date;               /** supply date*/ 
    private int price;                /** supply cost*/ 
    private int idProduct;          /** supply id product*/ 
    private int idClient;
//  private Supply next;             /** supply next*/ 
    
/**
 * default constructor
 */
    public Supply() {
        this.id = 0;
        this.name= "";
        this.idCity = 0;
        this.date= new Date();
        this.price = 0;
        this.idProduct = 0;
        this.idClient = 0;
    }
    
/**
 * constructor with parameters
 * @param id
 * @param name
 * @param idCity
 * @param date
 * @param price
 * @param idProduct
 * @param idClient 
 */
    public Supply(int id, String name, int idCity, Date date, int price, int idProduct, int idClient) {
        this.id = id;
        this.name = name;
        this.idCity = idCity;
        this.date = date;
        this.price = price;
        this.idProduct = idProduct;
        this.idClient = idClient;
    }
/**
 * get the Id of the supply
 * @return 
 */
    public int getId() {
        return id;
    }
/**
 * Set the id of the Supply
 * @param id 
 */
    public void setId(int id) {
        this.id = id;
    }
/**
 * Get the Name of the Supply
 * @return 
 */
    public String getName() {
        return name;
    }
/**
 * Set the Name of the Supply
 * @param name 
 */
    public void setName(String name) {
        this.name = name;
    }
/**
 * Get the Id of the citySupply
 * @return 
 */
    public int getIdCity() {
        return idCity;
    }
/**
 * setthe Idcity of the supply
 * @param idCity 
 */
    public void setIdCity(int idCity) {
        this.idCity = idCity;
    }
/**
 * get the Date of the supply
 * @return 
 */
    public Date getDate() {
        return date;
    }
/**
 * set the date of the supply
 * @param date 
 */
    public void setDate(Date date) {
        this.date = date;
    }
/**
 * get the ´price of the supply
 * @return 
 */
    public int getPrice() {
        return price;
    }
/**
 * set the price of the supply
 * @param price 
 */
    public void setPrice(int price) {
        this.price = price;
    }
/**
 * get de IdProduct of the supply
 * @return 
 */
    public int getIdProduct() {
        return idProduct;
    }
/**
 * set the IdProduct of the supply
 * @param idProduct 
 */
    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }
/**
 * get the IdClient of the supply
 * @return 
 */
    public int getIdClient() {
        return idClient;
    }
/**
 * set the IdClient of the supply
 * @param idClient 
 */
    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }


}
