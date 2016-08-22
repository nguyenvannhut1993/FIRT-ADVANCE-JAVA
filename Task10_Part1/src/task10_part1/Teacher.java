/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task10_part1;

/**
 *
 * @author Nguyen Van Nhut
 * Day 22/08/2016
 * Version 1
 * class for Creating Teacher class
 */
public class Teacher extends Human {

    String classLeader;
    double coeffSalary;
    double grant;

    public Teacher(String classLeader, double coeffSalary, double grant, String Name, String Birthday, String Address, String phoneNumber) {
        super(Name, Birthday, Address, phoneNumber);
        this.classLeader = classLeader;
        this.coeffSalary = coeffSalary;
        this.grant = grant;
    }

    public Teacher(String classLeader, double coeffSalary, double grant) {
        this.classLeader = classLeader;
        this.coeffSalary = coeffSalary;
        this.grant = grant;
    }

    public Teacher() {
    }

    public String getClassLeader() {
        return classLeader;
    }

    public void setClassLeader(String classLeader) {
        this.classLeader = classLeader;
    }

    public double getGrant() {
        return grant;
    }

    public void setGrant(double grant) {
        this.grant = grant;
    }

    public double salaryTeacher(double coeffSalary, double Grant) {
        double Salary = Grant * 1260000 + coeffSalary;
        return Salary;
    }
    // show information teacher
    public String showTeacher() {
        String s = super.ShowHunman() + "Class Leader:" + classLeader + " -- " + "coeffSalary:" + coeffSalary + " -- "
                + "Grant:" + grant;
        return s;
    }
}
