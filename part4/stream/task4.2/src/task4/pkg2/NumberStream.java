package task4.pkg2;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author nguyenvannhut 
 * Day 12/09/2016 
 * Version 1
 */
public class NumberStream {

    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1, 2, 3, 8, 6, 9, 11, 7, 5, 4, 14, 19, 18, 12, 15, 17);
        List<Integer> list1 = number.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println("List1:" + list1);
        IntSummaryStatistics stats = list1.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("High number in list:" + stats.getMax());
        System.out.println("Minimum number in list:" + stats.getMin());
        System.out.println("Sum number in list:" + stats.getSum());
        System.out.println("Average number in list:" + stats.getAverage());
        // List3: print all element in list1 are prime number 
        List<Integer> list2 = list1.stream().filter(x -> searchNumber(x) == true).collect(Collectors.toList());
        System.out.println("List2:" + list2);
        // List3: print all element in list1 are number power
        List<Integer> list3 = list1.stream().filter(x -> searchPow(x) == true).collect(Collectors.toList());
        System.out.println("List3:" + list3);
    }

    // search number is number Nto
    public static boolean searchNumber(Integer x) {
        if (x == 1 || x == 0) {
            return false;
        }
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    // function search power of number
    public static boolean searchPow(Integer x) {
        int n = (int) Math.sqrt(x);
        if (n * n == x) {
            return true;
        }
        return false;
    }

}
