package task2.pkg5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.exit;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Nguyen Van Nhut 
 * Day 08/09/2016 
 * Version 1 
 * class for creating main class and build some function
 */
public class ManagementStaff {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String yn = "";
        TreeSet<Staff> set = new TreeSet();
        staffDefault(set);
        do {
            System.out.println("1: Watching full staff list\n2: Add staff in list\n3: Search staff\n4: Remove Staff\n5: Arrange list\n6: Exit");
            int choice = Integer.parseInt(input.readLine());

            switch (choice) {
                case 1: {
                    printfList(set);
                    break;
                }
                case 2: {
                    addStaff(set);
                    break;
                }
                case 3: {
                    searchStaff(set);
                    break;
                }
                case 4: {
                    removeStaff(set);
                    break;
                }
                case 5: {
                    arrageStaff(set);
                    break;
                }
                case 6:
                    exit(1);
            }
            System.out.println("Do you want continue[y/n]?");
            yn = input.readLine();
        } while (yn.equalsIgnoreCase("y"));
    }
    // set list default
    public static void staffDefault(TreeSet<Staff> set) {
        Staff staff = new Staff("Nhut", 18, 600000);
        Staff staff1 = new Staff("Hoa", 21, 500000);
        Staff staff2 = new Staff("Khang", 25, 7000000);
        Staff staff3 = new Staff("Loc", 19, 800000);
        set.add(staff);
        set.add(staff1);
        set.add(staff2);
        set.add(staff3);
    }
    // print list
    public static void printfList(TreeSet<Staff> set) {
        for (Object s : set) {
            Staff element = (Staff) s;
            System.out.println(element.toString());
        }
    }
    // input information
    public static Staff inputStaff() throws IOException {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter name staff:");
            String name = input.readLine();
            System.out.println("Enter age:");
            int age = Integer.parseInt(input.readLine());
            System.out.println("Enter salary:");
            double salary = Double.parseDouble(input.readLine());
            Staff staff = new Staff(name, age, salary);
            return staff;
        } catch (NumberFormatException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return null;
    }
    // add a staff
    public static void addStaff(TreeSet<Staff> set) throws IOException {
        System.out.println("please enter staff");
        Staff staff = inputStaff();
        set.add(staff);
    }
    // search Staff
    public static void searchStaff(TreeSet<Staff> set) throws IOException {
        System.out.println("please enter staff to search");
        Staff staff = inputStaff();
        boolean a = set.contains(staff);
        if (a == true) {
            System.out.println("Search successfully");
        } else {
            System.out.println("not found");
        }
    }
    // remove staff
    public static void removeStaff(TreeSet<Staff> set) throws IOException {
        System.out.println("please enter staff to remove");
        Staff staff = inputStaff();
        boolean element = set.remove(staff);
        if (element == true) {
            System.out.println("remove successfully");
        } else {
            System.out.println("still not remove");
        }
    }
    // arrage staff
    public static void arrageStaff(TreeSet<Staff> set) {
        TreeSet s = new TreeSet();
        s = (TreeSet) set.descendingSet();
        for (Object obj : s) {
            Staff st = (Staff) obj;
            System.out.println(st.toString());
        }
    }
}
