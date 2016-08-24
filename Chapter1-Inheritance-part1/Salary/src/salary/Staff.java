/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salary;

/**
 *
 * @author Nguyen Van Nhut
 * Staff class
 * version 1
 * Day : 19/08/2016
 * input : name, numberName, coefficientsSalary, benefit
 * output: return name,numberName, coefficientsSalary, benefit was set
 */
public class Staff {

    Names name;
    int numberName;
    double coefficientsSalary;
    double benefit;

    public Staff(Names name, int numberName, double coefficientsSalary, double benefit) {
        this.name = name;
        this.numberName = numberName;
        this.coefficientsSalary = coefficientsSalary;
        this.benefit = benefit;
    }

    public Staff() {
    }

    public Names getName() {
        return name;
    }

    public void setName(Names name) {
        this.name = name;
    }

    public int getNumberName() {
        return numberName;
    }

    public void setNumberName(int numberName) {
        this.numberName = numberName;
    }

    public double getCoefficientsSalary() {
        return coefficientsSalary;
    }

    public void setCoefficientsSalary(double coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }

    public double getBenefit() {
        return benefit;
    }

    public void setBenefit(double benefit) {
        this.benefit = benefit;
    }
}
