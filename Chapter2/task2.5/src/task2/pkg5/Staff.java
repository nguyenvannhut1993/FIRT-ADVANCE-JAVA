package task2.pkg5;

/**
 *
 * @author Nguyen Van Nhut 
 * Day 08/09/2016 
 * Version 1 
 * class for creating staff class
 */
public class Staff implements Comparable<Staff> {

    String name;
    int age;
    double salary;

    public Staff(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Staff() {
    }

    @Override
    public String toString() {
        return this.name + " -- " + this.age + " -- " + this.salary;
    }

    @Override
    public int compareTo(Staff o) {
        return Double.compare(this.salary, o.salary);
    }
}
