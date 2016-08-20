/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salary;

/**
 *
 * @author Nguyen Van Nhut
 * Salary class
 * version 1
 * Day : 19/08/2016
 * input : Staff
 * output: return Staff object
 */
public class Salary {

    Staff staff;

    public Salary(Staff staff) {
        this.staff = staff;
    }

    public Salary() {
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public double inCome() {
        final double basicSalary = 1260000;
        double inC = staff.coefficientsSalary * basicSalary + staff.benefit;
        return inC;
    }

    public double taxSalary() {
        double taxSa = inCome() - 9000000 - (staff.numberName * 3600000);
        return taxSa;
    }

    public double taxperson() {
        double taxSa = 0d;
        final double value1 = 5000000;
        final double value2 = 10000000;
        final double value3 = 18000000;
        final double value4 = 32000000;
        final double value5 = 52000000;
        final double value6 = 80000000;
        if (taxSalary() < value1) {
            taxSa = taxSalary() * 0.05;
        } else if (taxSalary() >= value1 && taxSalary() < value2) {
            taxSa = ((taxSalary() - value1) * 0.1) + (value1 * 0.05);
        } else if (taxSalary() >= value2 && taxSalary() < value3) {
            taxSa = ((taxSalary() - value2) * 0.15) + (value2 * 0.1) + (value1 * 0.05);
        } else if (taxSalary() >= value3 && taxSalary() < value4) {
            taxSa = ((taxSalary() - value3) * 0.2) + (value3 * 0.15) + (value2 * 0.1) + (value1 * 0.05);
        } else if (taxSalary() >= value4 && taxSalary() < value5) {
            taxSa = ((taxSalary() - value4) * 0.25) + (value4 * 0.2) + (value3 * 0.15) + (value2 * 0.1) + (value1 * 0.05);
        } else if (taxSalary() >= value5 && taxSalary() < value6) {
            taxSa = ((taxSalary() - value5) * 0.3) + (value5 * 0.25) + (value4 * 0.2) + (value3 * 0.15) + (value2 * 0.1) + (value1 * 0.05);
        } else if (taxSalary() >= value6) {
            taxSa = ((taxSalary() - value6) * 0.35) + (value6 * 0.3) + (value5 * 0.25) + (value4 * 0.2) + (value3 * 0.15) + (value2 * 0.1) + (value1 * 0.05);
        }
        return taxSa;
    }

    public double naturalSalaty() {
        double natural = (inCome() - taxperson());
        return natural;
    }
}
