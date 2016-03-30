package logic;

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
public class City {
    private int idCity;
    private String nameCity;
    private int idDepertament;
/**
 * default constructor
 */
    public City() {
        this.idCity=0;
        this.nameCity= "";
        this.idDepertament=0;
    }
/**
 * 
 * @param idCity
 * @param nameCity
 * @param idDepertament 
 */
    public City(int idCity, String nameCity, int idDepertament) {
        this.idCity = idCity;
        this.nameCity = nameCity;
        this.idDepertament = idDepertament;
    }

   
/**
 * get the municipality name
 * @return get the minucipality name
 */
    public String getNameCity() {
        return nameCity;
    }
/**
 * rename the municipality
 * @param name 
 */
    public void setNameCity(String name) {
        this.nameCity = nameCity;                
    }

    public int getIdCity() {
        return idCity;
    }

    public void setIdCity(int idCity) {
        this.idCity = idCity;
    }

    public int getIdDepertament() {
        return idDepertament;
    }

    public void setIdDepertament(int idDepertament) {
        this.idDepertament = idDepertament;
    }
    
}
