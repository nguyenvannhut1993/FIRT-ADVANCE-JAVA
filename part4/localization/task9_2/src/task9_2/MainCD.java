package task9_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author Nguyen Van Nhut 
 * Day: 7/09/2016 
 * Version:1 
 * Class for manage CD
 */
public class MainCD {

    public static void main(String[] args) throws IOException {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            String yn = "";
            System.out.println("Please you choice Language 1(TiengViet) or 1(TiengAnh)[1/2]");
            int choose = Integer.parseInt(input.readLine());
            ResourceBundle messages = null;
            Locale bLocale = null;
            ResourceBundle messagess = null;
            Locale aLocale = null;
            List list = new ArrayList();
            switch (choose) {
                case 1: {
                    // tiếng việt
                    bLocale = new Locale("vi", "VN");
                    messages = ResourceBundle.getBundle("task9_2/resource_vi_VN", bLocale);
                    inputVietNamese(list, yn, messages);
                    break;
                }
                case 2: {
                    // tiếng anh
                    aLocale = new Locale("en", "US");
                    messagess = ResourceBundle.getBundle("task9_2/resource_en_US", aLocale);
                    inputVietNamese(list, yn, messagess);
                    break;
                }
                default: break;
            }

        } catch (NumberFormatException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
    // input information
    public static void inputVietNamese(List list, String yn, ResourceBundle messages) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println(messages.getString("idCD"));
            String id = input.readLine();
            System.out.println(messages.getString("name"));
            String name = input.readLine();
            System.out.println(messages.getString("singer"));
            String singer = input.readLine();
            System.out.println(messages.getString("number"));
            double number = Double.parseDouble(input.readLine());
            System.out.println(messages.getString("price"));
            double price = Double.parseDouble(input.readLine());
            CD cd = new CD(id, name, singer, number, price);
            list.add(cd);
            System.out.println(messages.getString("continue"));
            yn = input.readLine();
        } while (yn.equalsIgnoreCase(messages.getString("yes")));
        System.out.println(messages.getString("sumPrice"));
        System.out.println(calSumPrice(list));
        System.out.println(messages.getString("list"));
        printList(list);
        //Collections.sort(list);
    }
    // show infomation
    public static void printList(List list) {
        for (Object a : list) {
            CD element = (CD) a;
            System.out.println(element.toString());
        }
    }
    // cal Sum Price
    public static double calSumPrice(List list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            CD element = (CD) list.get(i);
            sum = sum + element.price;
        }
        return sum;
    }
}
