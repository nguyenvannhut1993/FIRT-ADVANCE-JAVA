package task7.pkg1;

import javax.xml.parsers.*;
import org.xml.sax.SAXException;
import org.w3c.dom.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

/**
 *
 * @author Nguyen Van Nhut
 */
public class ContactMain {

    public static void main(String[] args) throws IOException, ParserConfigurationException, TransformerException, SAXException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1: Add a contact in list contact\n2: Read all contact\n3:Search a contact\n4: Remove Contact");
        System.out.println("Choose 1 , 2, 3 , 4");
        int choose = Integer.parseInt(input.readLine());
        switch (choose) {
            case 1: {
                getInfoContact();
                break;
            }
            case 2: {
                printList();
                break;
            }
            case 3: {
                searchContact();
                break;
            }
            case 4: {
                removeContact();
                break;
            }
        }

    }

    public static void getInfoContact() throws IOException, ParserConfigurationException, TransformerException, SAXException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String names;
        String phones;
        System.out.println("Enter name:");
        names = input.readLine();
        System.out.println("Enter phone:");
        phones = input.readLine();
        contacts c = new contacts(names, phones);
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.newDocument();
            Element rootElement;
            String filePath = "src/task7/pkg1/contacts.xml";
            File xmlFile = new File(filePath);
            //root elements
            if (xmlFile.isFile()) {
                doc = docBuilder.parse(new FileInputStream(xmlFile));
                doc.getDocumentElement().normalize();
                rootElement = doc.getDocumentElement();
            } else {
                rootElement = doc.createElement("contacts");
                doc.appendChild(rootElement);
            }
            // contact
            Element contact = doc.createElement("contact");
            rootElement.appendChild(contact);
            //hoten element
            Element name = doc.createElement("name");
            name.appendChild(doc.createTextNode(c.name));
            contact.appendChild(name);
            // phone element
            Element phone = doc.createElement("phoneNumber");
            phone.appendChild(doc.createTextNode(c.phomeNumber));
            contact.appendChild(phone);
            //write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("src/task7/pkg1/contacts.xml"));
            transformer.transform(source, result);
            System.out.println("was add successfuly");
        } catch (ParserConfigurationException | TransformerException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }

    public static contacts getContact(Node node) {
        contacts ct = new contacts();
        if (node.getNodeType() == Node.ELEMENT_NODE);
        Element a = (Element) node;
        ct.setName(a.getElementsByTagName("name").item(0).getChildNodes().item(0).getNodeValue());
        ct.setPhomeNumber(a.getElementsByTagName("phoneNumber").item(0).getChildNodes().item(0).getNodeValue());
        return ct;
    }

    public static void printList() throws ParserConfigurationException, SAXException {
        List<contacts> listCt = getListContact();
        for (contacts ct : listCt) {
            System.out.println(ct.toString());
        }
    }

    public static List<contacts> getListContact() throws ParserConfigurationException {
        String filePath = "src/task7/pkg1/contacts.xml";
        File xmlFile = new File(filePath);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            //System.out.println("Root element:" + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("contact");
            List<contacts> listCt = new ArrayList();
            for (int i = 0; i < nodeList.getLength(); i++) {
                listCt.add(getContact(nodeList.item(i)));
            }
            return listCt;
        } catch (SAXException | IOException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return null;
    }

    public static void searchContact() throws ParserConfigurationException, IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        List<contacts> list = getListContact();
        System.out.println("Nhap name");
        String name = input.readLine();
        boolean flag = true;
        int a = 0;
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).name.equals(name)) {
                System.out.println(list.get(i).toString());
                a = 1;
            }
            if (a == 1) {
                flag = true;
            } else {
                flag = false;
            }
        }
        if (flag == false) {
            System.out.println("not found");
        }
    }
    // remove 
    public static void removeContact() throws ParserConfigurationException, IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Nhap name:");
        String name = input.readLine();
        String filePath = "src/task7/pkg1/contacts.xml";
        File xmlFile = new File(filePath);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("contact");
            Node dNode = null;
            if (nodeList != null) {
                for (int i = 0; i < nodeList.getLength(); i++) {
                    Node node = nodeList.item(i);
                    Element element = (Element) node;
                    String names = element.getElementsByTagName("name").item(0).getTextContent();
                    if (names.equalsIgnoreCase(name)) {
                        dNode = nodeList.item(i);
                    }
                }
            }
            dNode.getParentNode().removeChild(dNode);
            System.out.println("Remove successfully");

           TransformerFactory transformerFactory = TransformerFactory.newInstance();
           Transformer transformer = transformerFactory.newTransformer();
           DOMSource source = new DOMSource(doc);
           StreamResult result = new StreamResult(new File(filePath));
           transformer.transform(source, result);
           System.out.println("List contact after removing");
           printList();
        } catch (Exception e) {
        }

    }

}
