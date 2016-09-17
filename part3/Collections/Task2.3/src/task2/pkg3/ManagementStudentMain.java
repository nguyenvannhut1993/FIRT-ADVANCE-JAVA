package task2.pkg3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.jar.Attributes;

/**
 *
 * @author Nguyen Van Nhut
 * Day 7/09/2016
 * Version 1
 * Class for creating Main class
 */
public class ManagementStudentMain {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        TreeMap t = new TreeMap();
        Student s = new Student("nhut", 18, "binh dinh");
        Student s1 = new Student("nhan", 17, "binh dinh");
        Student s2 = new Student("le", 20, "binh dinh");
        Student s3 = new Student("thu", 27, "binh dinh");

        t.put("1", s);
        t.put("2", s1);
        t.put("3", s2);
        t.put("4", s3);
        String yn = "";
        do {
            System.out.println("1:watching full list student \n2:Add student \n3:Search student \n4:Delete student");
            int choice = Integer.parseInt(input.readLine());
            switch (choice) {
                case 1: {
                    printList(t);
                    break;
                }
                case 2: {
                    addStudent(t);
                    break;
                }
                case 3: {
                    searchStudent(t);
                    break;
                }
                case 4: {
                    removeStudent(t);
                    break;
                }
            }
            System.out.println("Do you continue?[y/n]:");
            yn = input.readLine();
        } while (yn.equalsIgnoreCase("y"));
    }

    public static void printList(TreeMap t) {
        Set set = t.entrySet();
        Iterator i = set.iterator();
        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
    }

    public static void addStudent(TreeMap t) throws IOException {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter ID student:");
            String ID = input.readLine();
            System.out.println("Enter student name:");
            String name = input.readLine();
            System.out.println("Enter age:");
            int age = Integer.parseInt(input.readLine());
            System.out.println("Enter place of birth:");
            String pOfBirth = input.readLine();
            Student s = new Student(name, age, pOfBirth);
            t.put(ID, s);
            System.out.println("successful");
        } catch (NumberFormatException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }

    public static void searchStudent(TreeMap t) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter ID student:");
        String ID = input.readLine();
        boolean a = t.containsKey(ID);
        if (a == true) {
            System.out.println("Was find");
        } else {
            System.out.println("not find");
        }
    }

    public static void removeStudent(TreeMap t) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Id which you want remove:");
        String ID = input.readLine();
        t.remove(ID);
        System.out.println("Remove sucessfully");
    }

}
