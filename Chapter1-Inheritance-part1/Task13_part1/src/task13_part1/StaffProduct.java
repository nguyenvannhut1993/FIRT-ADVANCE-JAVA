/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task13_part1;

/**
 *
 * @author Nguyen Van Nhut
 * Day 24/08/2016
 * Version 1
 * class for creating a staff product  
 */
public class StaffProduct extends Staff {

    double numberProduct;

    public StaffProduct(double numberProduct, Names name, int numberName, double coefficientsSalary) {
        super(name, numberName, coefficientsSalary);
        this.numberProduct = numberProduct;
    }

    public StaffProduct(double numberProduct) {
        this.numberProduct = numberProduct;
    }

    public StaffProduct() {
    }

    public double getNumberProduct() {
        return numberProduct;
    }

    public void setNumberProduct(double numberProduct) {
        this.numberProduct = numberProduct;
    }

    public double calSalaryProduct() {
        double L = numberProduct * 0.05;
        return L;
    }

    public String showInfoProduct(Salary T) {
        String s = "Name: " + names + " -- " + "Number person based on: " + numberName + " \n"
                + "coefficientsSalary: " + coefficientsSalary + " -- " + "NumberProduct: " + numberProduct + "\n" + "Salary: " + T.inComeProduct(this) + " -- "
                + "tax salary: " + T.taxSalaryProduct(this) + " \n"
                + "Tax person: " + T.taxpersonProduct(this) + " \n"
                + "Natural salary is got: " + T.naturalSalaty(this);
        return s;
    }
}
