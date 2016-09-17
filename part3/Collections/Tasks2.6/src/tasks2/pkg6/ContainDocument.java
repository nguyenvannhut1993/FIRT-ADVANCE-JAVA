package tasks2.pkg6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Nguyen Van Nhut
 * Day 08/09/2016
 * Version 1
 * class for creating main class
 */
public class ContainDocument {

    public static void main(String[] args) throws IOException {
        try{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a sentense:");
        String senten = input.readLine();
        System.out.println("Enter a word to search: ");
        String search = input.readLine();
        String[] s = senten.split(" ");
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
        if (map.containsKey(search) == true) {
            System.out.println("search successfully:");
        } else {
            System.out.println("Not found");
        }
        }catch(NullPointerException e){
            System.out.println("Error:"+e.getMessage());
        }
            
    }

}
