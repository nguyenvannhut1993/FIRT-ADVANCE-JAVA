package task4.pkg3;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author nguyenvannhut 
 * Day 12/09/2016 
 * Version 1 class for object with stream
 */
public class MainObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create student
        List<Student> list = Arrays.asList(new Student("Hoang", 16, 6, 7),
                new Student("nhan", 16, 7, 8), new Student("LHc", 19, 8, 9));
        Stream<Student> stream = list.stream();
        // show infor
        System.out.println("List student:");
        stream.forEach(System.out::println);
        // count student >=18
        System.out.print("Number student have old >=18: ");
        int count = (int) list.stream().filter(x -> (x.getAge() >= 18)).count();
        System.out.println(count);
        // count student have first name :'H'
        System.out.print("Number student have first name are 'H': ");
        int count1 = (int) list.stream().filter(x -> x.getName().startsWith("H")).count();
        System.out.println(count1);
        Optional<Student> result = list.stream().filter(x -> x.getName().startsWith("H")).findFirst();
        System.out.println("First Stduent has FirstName start at 'H': " + result.get());
        // process avarage mark
        DoubleSummaryStatistics stats = list.stream().mapToDouble((x) -> x.avarageMark()).summaryStatistics();
        System.out.println("High Avg in list student:" + stats.getMax());
        System.out.println("Lowest Avg in list:" + stats.getMin());
        System.out.println("Sum of Avg Mark:" + stats.getSum());
        System.out.println("Average of all Avg Mark :" + stats.getAverage());
        List<Student> goodStudent = list.stream().filter(x -> x.avarageMark() >= 8.0).collect(Collectors.toList());
        System.out.println("List good student:" + goodStudent);
    }

}
