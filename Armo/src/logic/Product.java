package logic;

    /**
    *
    * @author Yesica Daniela Vargas Espitia
    * @author Andres Mauricio Perez Escobar
    */
public class Product {
    private int idProduct;
    private String nameP;

    /**
     * default constructor 
     */
    
    public Product() {
        this.idProduct=0;
        this.nameP="";
    }
    /**
    * constructor with parameters 
    * @param idProduct
    * @param nameP 
    */
    public Product(int idProduct, String nameP) {
        this.idProduct = idProduct;
        this.nameP = nameP;
    }
    /**
    * get the IdProduct of the Product
    * @return 
    */
    public int getIdProduct() {
        return idProduct;
    }
       /**
     * set the IdProduct oh the product
     * @param idProduct 
     */
    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }
    /**
     * get Namep of the product
     * @return 
     */

    public String getNameP() {
        return nameP;
    }
    /**
     * set namep of the product
     * @param nameP 
     */
    public void setNameP(String nameP) {
        this.nameP = nameP;
    }
    
}
