
package StreamObject;

/**
 *
 * @author Nguyen Van Nhut
 * Day 19/09/2016
 * Version 1
 * Class for creating Employment class
 */
public class Employment {
    String name;
    int age;
    double salary;

    public Employment(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Employment() {
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    // show information
    @Override
    public String toString() {
        return "Name: "+ name +" - "+ age + " - "+String.format("%.2f",salary);
    }
    
}
