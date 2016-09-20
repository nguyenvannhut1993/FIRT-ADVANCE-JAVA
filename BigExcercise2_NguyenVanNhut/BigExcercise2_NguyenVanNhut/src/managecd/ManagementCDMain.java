package managecd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;
import javax.xml.crypto.dsig.TransformException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author Nguyen Van Nhut
 * Date 19/09/2016
 * Version : BigExcercise 2
 * class for building Main class
 * 
 */
public class ManagementCDMain {

    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException, SAXException, ParserConfigurationException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String yn = "";
        do {
            System.out.println("1: View all Cd store\n2: Add Cd\n3: Search Cd\n4: Update Cd\n5: Remove Cd\n6: Working file txt\n7: Wroking xml");
            System.out.println("=======================");
            System.out.println("Please choose");
            int choice = Integer.parseInt(input.readLine());
            switch (choice) {
                // show all cd in lists
                case 1: {
                    System.out.println("All category");
                    CdController p = new CdController();
                    List<Cd> list = p.viewCd(); 
                    showCd(list);
                    break;
                }
                // add cd
                case 2: {
                    try {
                        System.out.println("Enter name:");
                        String name = input.readLine();
                        System.out.println("Enter singer:");
                        String singer = input.readLine();
                        System.out.println("Enter number song:");
                        int number = Integer.parseInt(input.readLine());
                        System.out.println("Enter price:");
                        double price = Double.parseDouble(input.readLine());
                        Cd a = new Cd(name, singer, number, price);
                        CdController p = new CdController();
                        p.addCd(a);
                        System.out.println("Add successfully");
                    } catch (NumberFormatException e) {
                        System.out.println("Error:" + e.getMessage());
                    }
                    break;
                }
                // search cd 
                case 3: {
                    System.out.println("Enter name that's wanted search:");
                    String name = input.readLine();
                    CdController p = new CdController();
                    List<Cd> list = p.searchCd(name);
                    if (list != null) {
                        showCd(list);
                    } else {
                        System.out.println("not found");
                    }
                    break;
                }
                // update cd
                case 4: {
                    CdController p = new CdController();
                    List<Cd> list = p.viewCd();
                    showCd(list);
                    System.out.println("=======================");
                    System.out.println("Enter id:");
                    int id = Integer.parseInt(input.readLine());
                    System.out.println("Enter Numbersong");
                    int quanlity = Integer.parseInt(input.readLine());
                    System.out.println("Enter price");
                    double price = Double.parseDouble(input.readLine());
                    p.updateCd(price, quanlity, id);
                    break;
                }
                // remove cd
                case 5: {
                    String y = "";
                    CdController p = new CdController();
                    System.out.println("Enter id");
                    int id = Integer.parseInt(input.readLine());
                    System.out.println("Do you want remove this id of Cd?[y/n]");
                    y = input.readLine();
                    if (y.equalsIgnoreCase("y")) {
                        p.deleteCd(id);
                        System.out.println("Delete successfully:");
                    } else {
                        break;
                    }
                    break;
                }
                // wroking file txt
                case 6:
                {
                    System.out.println("1: Write to file\n2: Read from file");
                    int choose = Integer.parseInt(input.readLine());
                    switch(choose)
                    { 
                        case 1: // write cd to file txt
                        {
                            CdController p = new CdController();
                            List <Cd> list = p.viewCd();
                            p.writeCdToFileTxt(list);
                            break;
                        }
                        case 2: // read from to file
                        {
                             CdController p = new CdController();
                             List <Cd> list = p.readFromFile();
                             showCd(list);
                             break;
                        }
                        default:System.out.println("Please choice correctly");
                    }
                   
                    break;
                }
                // wroking xml
                case 7:
                {
                    System.out.println("1: Write to file cd.xml:\n2: Read from file cd.xml");
                    int cho = Integer.parseInt(input.readLine());
                    switch (cho) {
                        case 1: {
                            CdController p = new CdController();
                            List<Cd> list = p.viewCd();
                            p.writeCdxml(list);
                            System.out.println("was add successfuly");
                            break;
                        }
                        case 2:
                        {
                            CdController p = new CdController();
                            List <Cd> list = p.readFromCdxml();
                            showCd(list);
                            break;
                        }
                        default: System.out.println("Please choice correctly");
                            
                    }
                    break;
                }
            }
            System.out.println("Do you want to continue processing?[y/n]");
            yn = input.readLine();
        } while (yn.equalsIgnoreCase("y"));
    }
    // show Cd function 
    public static void showCd(List<Cd> list) {
        for (Cd a : list) {
            System.out.println(a.toString());
        }
    }
}
