package task2.pkg3;

/**
 *
 * @author Nguyen Van Nhut
 * Day 07/09/2016
 * Version 1
 * Class for creating student class
 */
public class Student implements Comparable<Student> {

    String name;
    int age;
    String placeOfBirth;

    public Student(String name, int age, String placeOfBirth) {
        this.name = name;
        this.age = age;
        this.placeOfBirth = placeOfBirth;
    }

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + " -- " + this.age + " -- " + this.placeOfBirth;
    }

    @Override
    public int compareTo(Student t) {
        return (this.name).compareTo(name);
    }

}
