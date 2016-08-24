/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task13_part1;

/**
 *
 * @author hv
 */
public class Staff {

    Names names;
    int numberName;
    double coefficientsSalary;

    public Staff(Names names, int numberName, double coefficientsSalary) {
        this.names = names;
        this.numberName = numberName;
        this.coefficientsSalary = coefficientsSalary;
    }

    public Staff() {
    }

    public Names getName() {
        return names;
    }

    public void setName(Names names) {
        this.names = names;
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

}
