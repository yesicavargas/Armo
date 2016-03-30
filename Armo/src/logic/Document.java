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
public class Document {
    private int idDocument;               /**document id*/
    private int idSupply;              /**document name*/ 
    private String path;                  /**document of link*/
/**
 * default constructor
 */
    public Document() {
        this.idDocument=0;
        this.idSupply=0;
        this.path="";
    }
/**
 * contructor with parameter
 * @param idDocument
 * @param idSupply
 * @param path 
 */
    public Document(int idDocument, int idSupply, String path) {
        this.idDocument = idDocument;
        this.idSupply = idSupply;
        this.path = path;
    }

    /**
     * get the idSupply of the document
     * @return 
     */
    public int getIdSupply() {
        return idSupply;
    }

    /**
     * set the idsupply of the document
     * @param idSupply 
     */
    public void setIdSupply(int idSupply) {
        this.idSupply = idSupply;
    }

/**
 * get the document number
 * @return get the document number
 */
    public int getIdDocument() {
        return idDocument;
    }
/**
 * change the document number
 * @param number 
 */
    public void setidDocumentr(int idDocument) {
        this.idDocument = idDocument;
    }
/**
 * get the document of link
 * @return get the document of link
 */
    public String getPath() {
        return path;
    }
/**
 * change the document of link
 * @param document 
 */
    public void setPath(String document) {
        this.path = document;
    }

    
}
