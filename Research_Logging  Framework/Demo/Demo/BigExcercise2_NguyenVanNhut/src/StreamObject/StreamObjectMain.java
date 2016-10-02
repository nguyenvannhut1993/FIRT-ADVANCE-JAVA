package StreamObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author Nguyen Van Nhut
 * Day 19/09/2016
 * Version 1
 * Class for processing Main
 * 
 */
public class StreamObjectMain {

    public static void main(String[] args) throws IOException {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            processingStream p = new processingStream();
            List<Employment> list = new ArrayList<Employment>();
            System.out.println("List Employment----");
            System.out.println("==========================");
            p.EmployeeDefault(list);
            System.out.println("==========================");
            System.out.println("Number employees have salary > 3 milion are:");
            int count = p.countEmployee(list);
            System.out.println(count);
            System.out.println("==========================");
            System.out.println("List contain name 'Anh' are:");
            int count1 = p.filterName(list);
            System.out.println("Amount: " + count1);
            System.out.println("==========================");
            System.out.println("Age average");
            System.out.println(p.calAvaAge(list));
            System.out.println("Highest salary");
            System.out.println(String.format("%.2f", p.searchHighSalary(list)));
            System.out.println("Lowest salary");
            System.out.println(p.searchLowSalary(list));
            System.out.println("Salary average");
            System.out.println(String.format("%.2f", p.calAvaSalary(list)));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }

}
