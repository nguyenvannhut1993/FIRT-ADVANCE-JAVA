package ProcessingString;

import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Nguyen Van Nhut
 * Day 19/09/2016
 * Version 1
 * Class for Arrangement
 */
public class ArrangementString {
    // list default
    public void StringDefault(List<String> list) {
        list.add("Cuoc doi co gi vui");
        list.add("Ai cung se gia va chet");
        list.add("Su that bai doi khi khong phai la dieu dang so nhat");
        list.add("Su tin tuong phai co trong moi quan he");
        list.add("Su khac nhau giua phat va bo tac");
        list.forEach((String e) -> System.out.println(e));
    }
    // arrange String shorter to long
    public void arrageStringShortToLongest(List<String> list) {
        List<String> sublist = list.subList(0, list.size());
        Comparator<String> longest = (String o1, String o2) -> Integer.valueOf(o1.length()).compareTo(Integer.valueOf(o2.length()));
        sublist.sort(longest);
        sublist.forEach((String e) -> System.out.println(e));
    }
    // arrange String long to short
    public void arrageStringLongestToShortter(List<String> list) {
        List<String> sublist = list.subList(0, list.size());
        Comparator<String> longest = (String o1, String o2) -> Integer.valueOf(o2.length()).compareTo(Integer.valueOf(o1.length()));
        sublist.sort(longest);
        sublist.forEach((String e) -> System.out.println(e));
    }
    // arrange alphabet
    public void arrageStringAlphabet(List<String> list) {
        list.sort((o1,o2) -> o1.compareTo(o2));
        list.forEach((String e) -> System.out.println(e));
    }
}
