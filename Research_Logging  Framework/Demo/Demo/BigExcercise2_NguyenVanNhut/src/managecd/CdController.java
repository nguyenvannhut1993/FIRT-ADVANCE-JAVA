package managecd;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
/**
 *
 * @author Nguyen Van Nhut
 * Date 19/09/2016
 * Version : BigExcercise 2
 * class for building class process all tasks
 */
public class CdController {
    Logger logger = Logger.getLogger(CdController.class);
    // add a Cd in list
    public void addCd(Cd cd) throws ClassNotFoundException, SQLException {
        Database db = new Database();
        try (Connection conn = db.connect()) {
            String sql = "INSERT INTO cd VALUES(NULL,'" + cd.getName() + "','" + cd.getSinger() + "','" + cd.getAmount() + "','" + cd.getPrice() + "')";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.execute();
        }

    }
    // view all cd in a list
    public List<Cd> viewCd() throws ClassNotFoundException {
        List<Cd> list = new ArrayList<>();
        Database db = new Database();
        Cd cd = null;
        try (Connection conn = db.connect()) {
            java.sql.Statement statement = conn.createStatement();
            String sql = "SELECT * FROM cd";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                cd = new Cd();
                cd.setId(resultSet.getInt("id"));
                cd.setName(resultSet.getString("name"));
                cd.setSinger(resultSet.getString("singer"));
                cd.setAmount(resultSet.getInt("numbersongs"));
                cd.setPrice(resultSet.getDouble("price"));
                list.add(cd);
            }
            conn.close();
        } catch (SQLException e) {
            logger.error(e);
        }
        return list;
    }
    // search a Cd
    public List<Cd> searchCd(String name) throws ClassNotFoundException, SQLException {
       
        Database db = new Database();
        List<Cd> cd;
        try (Connection conn = db.connect()) {
            cd = new ArrayList<>();
            java.sql.Statement statement = conn.createStatement();
            String sql = "SELECT * FROM cd WHERE Name like '%" + name + "%'";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Cd p = new Cd();
                p.setId(resultSet.getInt("id"));
                p.setName(resultSet.getString("name"));
                p.setSinger(resultSet.getString("singer"));
                p.setAmount(resultSet.getInt("numbersongs"));
                p.setPrice(resultSet.getDouble("price"));
                cd.add(p);
            }
            return cd;
        }
        catch (SQLException e) {
            logger.error(e);
        }
        return null;
    }
    // update Cd base on id
    public void updateCd(double price, int amount, int id) throws ClassNotFoundException, SQLException {
        Database db = new Database();
        try (Connection conn = db.connect()) {
            String sql = "UPDATE Cd SET numbersongs = " + amount + ",price = " + price
                    + "WHERE id =" + id;
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.executeUpdate();
            logger.info("info update:"+sql);
        } catch (SQLException | ClassNotFoundException e) {
            logger.error(e);
        }
    }
    // delete a Cd
    public void deleteCd(int id) throws ClassNotFoundException, SQLException {
        Database db = new Database();
        try (Connection conn = db.connect()) {
            String sql = "DELETE FROM Cd WHERE id = '" + id + "'";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.execute();
            logger.info("infor:Delete cd"+sql);
        } catch (SQLException | ClassNotFoundException e) {
            logger.error(e);
        }
    }
    //write to file cd.txt
    public void writeCdToFileTxt(List<Cd> list) throws IOException {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/managecd/cd.txt"));
            out.writeInt(list.size());
            for (Cd e : list) {
                out.writeObject(e);
                out.flush();
                logger.info("info write cd to file:"+e);
            }
            System.out.println("write successfully");
            out.reset();
            out.close();
        } catch (IOException e) {
            logger.error(e);
        }

    }
    // read file from cd.txt
    public List<Cd> readFromFile() throws FileNotFoundException, IOException, ClassNotFoundException {
        List<Cd> list = new ArrayList<>();
        FileInputStream file = new FileInputStream("src/managecd/cd.txt");
        if (file.available() != 0) {
            ObjectInputStream input = new ObjectInputStream(file);
            int size = input.readInt();
            for (int i = 0; i < size; i++) {
                list.add((Cd) input.readObject());
            }
            input.close();
        }
        return list;
    }
    // write data to file
    public void writeCdxml(List<Cd> list) throws SAXException, IOException
    {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.newDocument();
            Element rootElement;
            String filePath = "src/managecd/cd.xml";
            File xmlFile = new File(filePath);
            //root elements
            if (xmlFile.isFile()) {
                doc = docBuilder.parse(new FileInputStream(xmlFile));
                doc.getDocumentElement().normalize();
                rootElement = doc.getDocumentElement();
            } else {
                rootElement = doc.createElement("CDs");
                doc.appendChild(rootElement);
            }
            // cd
            while (rootElement.hasChildNodes()) {
                rootElement.removeChild(rootElement.getFirstChild());
            }
            for (int i = 0; i < list.size(); i++) {
                Element em = doc.createElement("CD");
                rootElement.appendChild(em);
                // id cd
                Element id = doc.createElement("id");
                id.appendChild(doc.createTextNode(Integer.toString(list.get(i).id)));
                em.appendChild(id);
                //name element
                Element name = doc.createElement("name");
                name.appendChild(doc.createTextNode(list.get(i).name));
                em.appendChild(name);
                Element sex = doc.createElement("singer");
                sex.appendChild(doc.createTextNode(list.get(i).singer));
                em.appendChild(sex);
                // mount cd
                Element dayOfBirh = doc.createElement("amount");
                dayOfBirh.appendChild(doc.createTextNode(Integer.toString(list.get(i).amount)));
                em.appendChild(dayOfBirh);
                // price cd
                Element sala = doc.createElement("price");
                sala.appendChild(doc.createTextNode((Double.toString(list.get(i).price))));
                em.appendChild(sala);
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                DOMSource source = new DOMSource(doc);
                StreamResult result = new StreamResult(new File("src/managecd/cd.xml"));
                transformer.transform(source, result);
            }
        } catch (ParserConfigurationException | TransformerException e) {
            logger.error(e);
        }
    }
    // read data from file 
    public List <Cd> readFromCdxml() throws ParserConfigurationException
    {
         String filePath = "src/managecd/cd.xml";
        File xmlFile = new File(filePath);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getElementsByTagName("CD");
            List<Cd> listCt = new ArrayList();
            for (int i = 0; i < nodeList.getLength(); i++) {
                listCt.add(getEmlement(nodeList.item(i)));
            }
            return listCt;
        } catch (SAXException | IOException e) {
           logger.error(e);
        }
        return null;
    }
    // get a node 
    public Cd getEmlement(Node node) {
        Cd cd = new Cd();
        if (node.getNodeType() == Node.ELEMENT_NODE);
        Element a = (Element) node;
        cd.setId(Integer.parseInt(a.getElementsByTagName("id").item(0).getChildNodes().item(0).getNodeValue()));
        cd.setName(a.getElementsByTagName("name").item(0).getChildNodes().item(0).getNodeValue());
        cd.setSinger(a.getElementsByTagName("singer").item(0).getChildNodes().item(0).getNodeValue());
        cd.setAmount(Integer.parseInt(a.getElementsByTagName("amount").item(0).getChildNodes().item(0).getNodeValue()));
        cd.setPrice(Double.parseDouble(a.getElementsByTagName("price").item(0).getChildNodes().item(0).getNodeValue()));
        return cd;
    }
}
