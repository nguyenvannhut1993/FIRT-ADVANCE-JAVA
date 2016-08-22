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
 * class for Creating Student class
 */
public class Student extends Human {

    String Classs;
    double corePart1;
    double corePart2;

    public Student(String Classs, double corePart1, double corePart2, String Name, String Birthday, String Address, String phoneNumber) {
        super(Name, Birthday, Address, phoneNumber);
        this.Classs = Classs;
        this.corePart1 = corePart1;
        this.corePart2 = corePart2;
    }

    public Student(String Classs, double corePart1, double corePart2) {
        this.Classs = Classs;
        this.corePart1 = corePart1;
        this.corePart2 = corePart2;
    }

    public Student() {
    }

    public String getClasss() {
        return Classs;
    }

    public void setClass(String Class) {
        this.Classs = Class;
    }

    public double getCorePart1() {
        return corePart1;
    }

    public void setCorePart1(double corePart1) {
        this.corePart1 = corePart1;
    }

    public double getCorePart2() {
        return corePart2;
    }

    public void setCorePart2(double corePart2) {
        this.corePart2 = corePart2;
    }

    public double calAverage(double corePart1, double corePart2) {
        double Av = (corePart1 + corePart2) / 2;
        return Av;
    }
    // show information student
    public String showStudent() {
        String s = super.ShowHunman() + "Class:" + Classs + " -- " + "ScorePart1:" + corePart1 + " -- "
                + "ScorePart2:" + corePart2;
        return s;
    }
}
