package Persistence;


import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import logic.User;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author Yesica Daniela Vargas Espitia
 * @author Andres Mauricio Perez Escobar
 */
public class XMLFileUser {
    private DocumentBuilderFactory docFactory;
    private DocumentBuilder docBuilder;

    /**
     * Default constructor
     */
    public XMLFileUser() {
    }

    /**
     * Get Document Builder Factory
     * @return Document Builder Factory
     */
    public DocumentBuilderFactory getDocFactory() {
        return docFactory;
    }

    /**
     * Set Document Builder Factory
     * @param docFactory Document Builder Factory
     */
    public void setDocFactory(DocumentBuilderFactory docFactory) {
        this.docFactory = docFactory;
    }

    /**
     * Get Document Builder
     * @return Document Builder
     */
    public DocumentBuilder getDocBuilder() {
        return docBuilder;
    }

    /**
     * Set Document Builder
     * @param docBuilder Document Builder
     */
    public void setDocBuilder(DocumentBuilder docBuilder) {
        this.docBuilder = docBuilder;
    }

    /**
     * Read a xml file of employees and create a employee list
     * @param filename XML filename
     * @return Employee list
     */
    public List<User> readFile(String filename) {
        List<User> userList = new ArrayList<>();
        
        try {
            this.setDocFactory(DocumentBuilderFactory.newInstance());
            this.setDocBuilder(this.getDocFactory().newDocumentBuilder());
            Document doc = this.getDocBuilder().newDocument();
            
            Element rootElement = doc.getDocumentElement();
            NodeList xmlList = rootElement.getElementsByTagName("User");
            
            if (xmlList != null && xmlList.getLength() > 0) {
                for (int i = 0; i < xmlList.getLength(); i++) {
                    Element xmlElement = (Element)xmlList.item(i);
                    User user = getUser(xmlElement);
                    userList.add(user);
                }
            }
        } catch (ParserConfigurationException | NullPointerException ex) {
            Logger.getLogger(XMLFileUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userList;
    }

    /**
     * Write file (XML format)
     * @param filename XML filename
     * @param userList Employee list to save
     */
    public void writeFile(String filename, List<User> userList) {
        try {
            this.setDocFactory(DocumentBuilderFactory.newInstance());
            this.setDocBuilder(this.getDocFactory().newDocumentBuilder());
            
            Document doc = this.getDocBuilder().newDocument();
            Element rootElement = doc.createElement("users");
            doc.appendChild(rootElement);
            
            for (User user : userList) {
                rootElement.appendChild(getUser(doc, user));
            }
            
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(filename));
            transformer.transform(source, result);
        } catch (ParserConfigurationException | TransformerConfigurationException ex) {
            Logger.getLogger(XMLFileUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(XMLFileUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Build employee xml record
     * @param doc Document
     * @param user Employee 
     * @return Employee element node
     */
    private Node getUser(Document doc, User user) {
        
        Element xmlUser = doc.createElement("User");
        
        xmlUser.setAttribute("id", "" + user.getID());
        
        xmlUser.appendChild(getUserElements(
                doc, xmlUser, "firstname", user.getName()));
        xmlUser.appendChild(getUserElements(
                doc, xmlUser, "lastname", user.getLastName()));
        xmlUser.appendChild(getUserElements(
                doc, xmlUser, "User", user.getLogin()));
        xmlUser.appendChild(getUserElements(
                doc, xmlUser, "password", user.getPassword()));
        xmlUser.appendChild(getUserElements(
                doc, xmlUser, "photo", user.getPhoto()));
        xmlUser.appendChild(getUserElements(
                doc, xmlUser, "type", "" + user.getType()));
       

        return xmlUser;
    }

    /**
     * Build employee xml field
     * @param doc Document
     * @param xmlEmployee Employee xml element
     * @param tagName Tag name
     * @param tagValue Tag value
     * @return Employee file node
     */
    private Node getUserElements(Document doc, Element xmlUser, String tagName, String tagValue) {
        Element node = doc.createElement(tagName);
        node.appendChild(doc.createTextNode(tagValue));
        return node;
    }

    private User getUser(Element xmlElement) {
      
        User user = new User();
        
        user.setID(Integer.parseInt(xmlElement.getAttribute("id")));
        user.setName(getTagValue(xmlElement, "firstname"));
        user.setLastName(getTagValue(xmlElement, "lastname"));
        user.setLogin(getTagValue(xmlElement, "user"));
        user.setPassword(getTagValue(xmlElement, "password"));
        user.setPhoto(getTagValue(xmlElement, "photo"));
        user.setType(Integer.parseInt(getTagValue(xmlElement, "type")));
        return user;
    }

    private String getTagValue(Element xmlElement, String tagname) {
        String txtValue = null;
        NodeList nl = xmlElement.getElementsByTagName(tagname);
        if (nl != null && nl.getLength() > 0) {
            Element element = (Element)nl.item(0);
            txtValue = element.getFirstChild().getNodeValue();
        }
        return txtValue;
    }
}
