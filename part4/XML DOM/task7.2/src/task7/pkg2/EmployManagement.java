
package task7.pkg2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
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
 * Day 15/09/2016
 * Version 1
 * class for creating main class
 */
public class EmployManagement {

    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1: Add unit\n2: Add employment\n3: show list Employment\n4: choice unit to show Employment:");
        System.out.println("Choose 1 , 2 , 3");
        int choose = Integer.parseInt(input.readLine());
        switch (choose) {
            case 1: {
                getUnit();
                break;
            }
            case 2: {
                getEmployment();
                break;
            }
            case 3:
            {
                showEmploy();
                showDepartment();
                break;
            }
            case 4:
            {
                showChoicingUnit();
                break;
            }
        }
    }
    // get unit
    public static void getUnit() throws IOException, SAXException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name unit:");
        String nUnit = input.readLine();
        System.out.println("Enter id unit:");
        String idUnit = input.readLine();
        Department de = new Department(idUnit, nUnit);
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.newDocument();
            Element rootElement;
            String filePath = "src/task7/pkg2/units.xml";
            File xmlFile = new File(filePath);
            //root elements
            if (xmlFile.isFile()) {
                doc = docBuilder.parse(new FileInputStream(xmlFile));
                doc.getDocumentElement().normalize();
                rootElement = doc.getDocumentElement();
            } else {
                rootElement = doc.createElement("units");
                doc.appendChild(rootElement);
            }
            // units
            Element unit = doc.createElement("unit");
            rootElement.appendChild(unit);
            // Id unit element
            Element phone = doc.createElement("id");
            phone.appendChild(doc.createTextNode(de.idLap));
            unit.appendChild(phone);
            //name element
            Element name = doc.createElement("name");
            name.appendChild(doc.createTextNode(de.nameLap));
            unit.appendChild(name);

            //write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("src/task7/pkg2/units.xml"));
            transformer.transform(source, result);
            System.out.println("was add successfuly");
        } catch (ParserConfigurationException | TransformerException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
    // get employee
    public static void getEmployment() throws IOException, SAXException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name employment:");
        String nameEm = input.readLine();
        System.out.println("Enter id employment:");
        String idEm = input.readLine();
        System.out.println("Enter sex:");
        String se = input.readLine();
        System.out.println("Enter day of birth:");
        String dayOfB = input.readLine();
        System.out.println("Enter salary:");
        double salary = Double.parseDouble(input.readLine());
        System.out.println("Enter address");
        String address = input.readLine();
        System.out.println("Enter id unit:");
        String iduit = input.readLine();
        Employment de = new Employment(idEm, nameEm, se, dayOfB, salary, address, iduit);
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.newDocument();
            Element rootElement;
            String filePath = "src/task7/pkg2/Employments.xml";
            File xmlFile = new File(filePath);
            //root elements
            if (xmlFile.isFile()) {
                doc = docBuilder.parse(new FileInputStream(xmlFile));
                doc.getDocumentElement().normalize();
                rootElement = doc.getDocumentElement();
            } else {
                rootElement = doc.createElement("Employments");
                doc.appendChild(rootElement);
            }
            // contact
            Element em = doc.createElement("Employment");
            rootElement.appendChild(em);
            // Id unit element
            Element id = doc.createElement("idEm");
            id.appendChild(doc.createTextNode(de.idStaff));
            em.appendChild(id);
            //name element
            Element name = doc.createElement("nameEm");
            name.appendChild(doc.createTextNode(de.name));
            em.appendChild(name);
            //sex person element
            Element sex = doc.createElement("sex");
            sex.appendChild(doc.createTextNode(de.sex));
            em.appendChild(sex);
            // day of birth element
            Element dayOfBirh = doc.createElement("dayBirth");
            dayOfBirh.appendChild(doc.createTextNode(de.dayOfBirth));
            em.appendChild(dayOfBirh);
            // salary element
            Element sala = doc.createElement("salary");
            sala.appendChild(doc.createTextNode((Double.toString(de.salary))));
            em.appendChild(sala);
            // salary element
            Element addres = doc.createElement("address");
            addres.appendChild(doc.createTextNode(de.address));
            em.appendChild(addres);
            // salary element
            Element iduint = doc.createElement("idunit");
            iduint.appendChild(doc.createTextNode(de.idUint));
            em.appendChild(iduint);
            //write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("src/task7/pkg2/Employments.xml"));
            transformer.transform(source, result);
            System.out.println("was add successfuly");
        } catch (ParserConfigurationException | TransformerException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
    // get emlement unit
    public static Department getEmlementDepart(Node node) {
        Department d = new Department();
        if (node.getNodeType() == Node.ELEMENT_NODE);
        Element a = (Element) node;
        d.setNameLap(a.getElementsByTagName("name").item(0).getChildNodes().item(0).getNodeValue());
        d.setIdLap(a.getElementsByTagName("id").item(0).getChildNodes().item(0).getNodeValue());
        return d;
    }
    // get Element
    public static Employment getEmlement(Node node) {
        Employment em = new Employment();
        if (node.getNodeType() == Node.ELEMENT_NODE);
        Element a = (Element) node;
        em.setName(a.getElementsByTagName("nameEm").item(0).getChildNodes().item(0).getNodeValue());
        em.setIdStaff(a.getElementsByTagName("idEm").item(0).getChildNodes().item(0).getNodeValue());
        em.setSex(a.getElementsByTagName("sex").item(0).getChildNodes().item(0).getNodeValue());
        em.setDayOfBirth(a.getElementsByTagName("dayBirth").item(0).getChildNodes().item(0).getNodeValue());
        em.setSalary(Double.parseDouble(a.getElementsByTagName("salary").item(0).getChildNodes().item(0).getNodeValue()));
        em.setAddress(a.getElementsByTagName("address").item(0).getChildNodes().item(0).getNodeValue());
        em.setIdUint(a.getElementsByTagName("idunit").item(0).getChildNodes().item(0).getNodeValue());
        return em;
    }
    // get list unit
    public static List <Department> getListUnit() throws ParserConfigurationException
    {
        String filePath = "src/task7/pkg2/units.xml";
        File xmlFile = new File(filePath);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            //System.out.println("Root element:" + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("unit");
            List<Department> listCt = new ArrayList();
            for (int i = 0; i < nodeList.getLength(); i++) {
                listCt.add(getEmlementDepart(nodeList.item(i)));
            }
            return listCt;
        } catch (SAXException | IOException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return null;
    }
    // show unit
     public static void showDepartment() throws ParserConfigurationException
    {
        List<Department> list = getListUnit();
        for(Department e : list)
        {
            System.out.println(e.toString());
        }
    }
     // get list employee
    public static List<Employment> getListEmploy() throws ParserConfigurationException {
        String filePath = "src/task7/pkg2/Employments.xml";
        File xmlFile = new File(filePath);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            //System.out.println("Root element:" + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("Employment");
            List<Employment> listCt = new ArrayList();
            for (int i = 0; i < nodeList.getLength(); i++) {
                listCt.add(getEmlement(nodeList.item(i)));
            }
            return listCt;
        } catch (SAXException | IOException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return null;
    }
    // show Employee
    public static void showEmploy() throws ParserConfigurationException
    {
        List<Employment> list = getListEmploy();
        for(Employment e : list)
        {
            System.out.println(e.toString());
        }
    }
    // print employee based on unit
    public static void showChoicingUnit() throws IOException, ParserConfigurationException, SAXException
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Id unit:");
        String name = input.readLine();
        List <Employment> list = getListEmploy();
        String a="";
        for(int i = 0; i <list.size();i++)
        {
                    if(list.get(i).idUint.equals(name))
                    {
                        System.out.println(list.get(i).toString());
                    }
        }
        System.out.println(a);
       
        
    }
}
