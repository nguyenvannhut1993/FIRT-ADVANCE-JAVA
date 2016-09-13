package task9_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author Nguyen Van Nhut
 * Day 13/09/2016
 * Version 1
 * Class for writing Muti language
 */
public class MutiLanguageMain {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please choose type of Language: 1(TiengViet) or 2(TiengAnh)");
        int chooise = Integer.parseInt(input.readLine());
        switch (chooise) {
            case 1: {
                //tiếng việt
                ResourceBundle messages;
                Locale bLocale;
                bLocale = new Locale("vi", "VN");
                messages = ResourceBundle.getBundle("task9_1/resource_vi_VN", bLocale);
                List<String> list = new ArrayList<>();
                Enumeration<String> keys = messages.getKeys();
                while (keys.hasMoreElements()) {
                    String key = keys.nextElement();
                    String value = messages.getString(key);
                    list.add(value);
                }

                System.out.println("--------------------------");
                for (String a : list) {
                    if (a != null) {
                        System.out.println(a);
                    }
                }
                System.out.println("Choice vietnamese");
                System.out.println("--------------------------");
                break;
            }
            case 2: {
                // tiếng anh
                ResourceBundle messages;
                Locale aLocale;
                aLocale = new Locale("en", "US");
                messages = ResourceBundle.getBundle("task9_1/resource_en_US", aLocale);
                List<String> list = new ArrayList<>();
                Enumeration<String> keys = messages.getKeys();
                while (keys.hasMoreElements()) {
                    String key = keys.nextElement();
                    String value = messages.getString(key);
                    list.add(value);
                }
                System.out.println("--------------------------");
                for (String a : list) {
                    if (a != null) {
                        System.out.println(a);
                    }
                }
                System.out.println("Choice English");
                System.out.println("--------------------------");
                break;
            }

        }
    }

}
