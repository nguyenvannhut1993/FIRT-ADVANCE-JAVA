
package task3.pkg2;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Nguyen Van Nhut 
 * Day 9/09/2016 
 * Version 1 class for creating Main class to calculate money
 */
public class CalculationMoney {

    public static void main(String[] args) {
        List <Integer> amounts = Arrays.asList(new Integer[]{2, 3, 5, 7});
        int price = 5200;
        amounts.forEach(element -> {
            System.out.println("SumOfMoney: "+ price * element + " vnd");
        });
    }
    
}
