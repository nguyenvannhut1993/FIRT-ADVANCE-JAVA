package StreamObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author Nguyen Van Nhut
 * Day 19/09/2016
 * Version 1
 * Class for processing all tasks
 */
public class processingStream {
    // create list default
    public void EmployeeDefault(List<Employment> list) {
        list.add(new Employment("Nguyen Van nhut", 23, 1000000));
        list.add(new Employment("Vo Loc", 23, 2000000));
        list.add(new Employment("Vo Van Nhan", 19, 200000));
        list.add(new Employment(" Nguyen Vu Luan", 17, 300000));
        list.add(new Employment("Nguyen Dinh khang", 30, 10000000));
        list.add(new Employment("Le Thi Ha", 26, 8000000));
        list.add(new Employment("Nguyen Ngoc Khanh", 24, 200000));
        list.add(new Employment("Dang Vu Tien", 21, 3000000));
        list.add(new Employment("Ngo Phuong Tung", 32, 20000000));
        list.add(new Employment("Tran Minh Dinh", 25, 4000000));
        list.add(new Employment("Nguyen Tuan Anh", 32, 20000000));
        list.add(new Employment("Dang Xuan Vuong", 26, 5000000));
        list.add(new Employment("Nguyen Thanh Bao", 28, 90000000));
        list.add(new Employment("Nguyen Hoang Huy", 24, 5100000));
        list.add(new Employment("Nguyen Thi Diep", 19, 80000000));
        list.forEach((Employment e) -> System.out.println(e));
    }
    // count amount employee have salary > 3 milion
    public int countEmployee(List<Employment> list) {
        int count = (int) list.stream().filter(e -> (e.getSalary() > 3000000)).count();
        return count;
    }
    // filter name that's contain = 'Anh'
    public int filterName(List<Employment> list) {
        int count = (int) list.stream().filter(e -> e.name.contains("Anh")).count();
        if (count > 0) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).name.contains("Anh")) {
                    System.out.println(list.get(i).toString());
                }
            }
        }
        else
            System.out.println("not found name 'Anh'");
        return count;
    }
    // calculate Average age
    public double calAvaAge(List<Employment> list) {
        DoubleSummaryStatistics avage = list.stream().mapToDouble((e) -> e.getAge()).summaryStatistics();
        return avage.getAverage();
    }
    // search hinhest salary
    public double searchHighSalary(List<Employment> list) {
        DoubleSummaryStatistics high = list.stream().mapToDouble((e) -> e.getSalary()).summaryStatistics();
        return high.getMax();
    }
    // search lowest salary
    public double searchLowSalary(List<Employment> list) {
        DoubleSummaryStatistics low = list.stream().mapToDouble((e) -> e.getSalary()).summaryStatistics();
        return low.getMin();
    }
    // calculate average salary
    public double calAvaSalary(List<Employment> list) {
        DoubleSummaryStatistics avage = list.stream().mapToDouble((e) -> e.getSalary()).summaryStatistics();
        return avage.getAverage();
    }
}
