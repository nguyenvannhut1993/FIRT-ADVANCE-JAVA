package task3.pkg1;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Nguyen Van Nhut 
 * Day 9/09/2016 
 * Version 1 class for creating Main class to show content array
 */
public class Arrayss {

    public static void main(String[] args) {
        //code normal writing
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        for (Integer n : list) {
            System.out.print(n + " ");
        }
        System.out.print("\n");
        System.out.println("======================= Lambada");
        // code using Lambda
        List<Integer> lists = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        lists.forEach(n -> System.out.print(n + " "));
    }

}
