
package task4_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author nguyenvannhut
 * Day 12/09/2016
 * Version 1
 * Class for building string
 */
public class processionString {

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Nhut","Nhan","happy","aKhanh","aien","","Khang","Tung",
                "Tuan","Bao","Anh","","ep","","Vinh");
        list1.stream().forEach(System.out::println);
        int count1 = (int)list1.stream().filter(string -> string.contentEquals("")).count();
        System.out.println("Count of string '':"+count1);
        int count2 = (int)list1.stream().filter(string -> string.length()>=5).count();
        System.out.println("Count of string >=5:"+count2);
        int count3 = (int)list1.stream().filter(string -> string.startsWith("a")).count();
        System.out.println("Count of string started 'a':"+count3);
        int count4 = (int)list1.stream().filter(string -> string.equals("happy")).count();
        System.out.println("Count of content string is happy:"+count4);
        System.out.println("List2:===========");
        List<String> list2 = list1.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println(list2);
        System.out.println("List3:===========");
        String list3 = list1.stream().filter(string -> (string.length() >=3 && string.length() <=6)).collect(Collectors.joining(", "));
        System.out.println(list3);
        System.out.println("List4:===========");
        List<String> list4 = list1.stream().map(string -> string.concat(" happy")).collect(Collectors.toList());
        System.out.println(list4);
    }
    
}
