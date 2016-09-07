package task2.pkg1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Nguyen Van Nhut
 * Day: 7/09/2016
 * Version:1
 * Class for manage CD
 */
public class MainCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            String yn = "";
            List list = new ArrayList();
            do {
                System.out.println("Enter ID:");
                String id = input.readLine();
                System.out.println("Enter CD name:");
                String name = input.readLine();
                System.out.println("Enter Singer:");
                String singer = input.readLine();
                System.out.println("Enter Number's song:");
                double number = Double.parseDouble(input.readLine());
                System.out.println("Enter Price of CD:");
                double price = Double.parseDouble(input.readLine());
                CD cd = new CD(id, name, singer, number, price);
                list.add(cd);
                System.out.println("do you want add cd?[y/n]");
                yn = input.readLine();
            } while (yn.equalsIgnoreCase("y"));
            System.out.println(calSumPrice(list));
            printList(list);
            Collections.sort(list);
        } catch (NumberFormatException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }

    public static void printList(List list) {
        for (Object a : list) {
            CD element = (CD) a;
            System.out.println(element.toString());
        }
    }

    public static double calSumPrice(List list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            CD element = (CD) list.get(i);
            sum = sum + element.price;
        }
        return sum;
    }
}
