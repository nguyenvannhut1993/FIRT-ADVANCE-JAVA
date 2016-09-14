package task6.pkg2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Nguyen Van Nhut 
 * Day 08/09/2016 
 * Version 1 class for creating main
 * class
 */
public class ContainDocument {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        try (FileInputStream in = new FileInputStream("src/task6/document.txt")) {
            int c;

            while ((c = in.read()) != -1) {
                result += (char) c;
            }
            System.out.println(result);
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error:" + e.getMessage());
        }
        String[] s = result.split(" ");
        Map<String, Integer> map = new TreeMap<>();
        int i = 0;
        while (i < s.length) {
            if (map.containsKey(s[i]) == false) {
                map.put(s[i], 1);
            } else {
                map.put(s[i], map.get(s[i]) + 1);
            }
            i++;
        }
        // show result
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());

        }
        // search an word
        System.out.println("Enter a word to search: ");
        String search = input.readLine();
        if (map.containsKey(search) == true) {
            System.out.println("search successfully:");
        } else {
            System.out.println("Not found");
        }

    }

}
