/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task13_part1;

/**
 *
 * @author Nguyen Van Nhut Salary class version 1 Day : 19/08/2016 input : Staff
 * output: return Staff object
 */
public class Salary {
    
    Staff staff;
    StaffProduct staffProduct;
    StaffSale staffSale;
    
    public Salary(Staff staff, StaffProduct staffProduct, StaffSale staffSale) {
        this.staff = staff;
        this.staffProduct = staffProduct;
        this.staffSale = staffSale;
    }
    
    public Salary() {
    }
    
    public Staff getStaff() {
        return staff;
    }
    
    public void setStaff(Staff staff) {
        this.staff = staff;
    }
    
    public StaffProduct getStaffProduct() {
        return staffProduct;
    }
    
    public void setStaffProduct(StaffProduct staffProduct) {
        this.staffProduct = staffProduct;
    }
    
    public StaffSale getStaffSale() {
        return staffSale;
    }
    
    public void setStaffSale(StaffSale staffSale) {
        this.staffSale = staffSale;
    }
    
    public double inComeProduct(StaffProduct T) {
        final double basicSalary = 1260000;
        double inC = staff.coefficientsSalary * basicSalary + T.calSalaryProduct();
        return inC;
    }

    public double inComeSale(StaffSale T) {
        final double basicSalary = 1260000;
        double inC = staff.coefficientsSalary * basicSalary + T.calSalarySale();
        return inC;
    }

    public double taxSalaryProduct(StaffProduct T) {
        double taxSa = inComeProduct(T) - 9000000 - (staff.numberName * 3600000);
        return taxSa;
    }
    
    public double taxpersonProduct(StaffProduct T) {
        double taxSa = 0d;
        final double value1 = 5000000;
        final double value2 = 10000000;
        final double value3 = 18000000;
        final double value4 = 32000000;
        final double value5 = 52000000;
        final double value6 = 80000000;
        if (taxSalaryProduct(T) < value1) {
            taxSa = taxSalaryProduct(T) * 0.05;
        } else if (taxSalaryProduct(T) >= value1 && taxSalaryProduct(T) < value2) {
            taxSa = ((taxSalaryProduct(T) - value1) * 0.1) + (value1 * 0.05);
        } else if (taxSalaryProduct(T) >= value2 && taxSalaryProduct(T) < value3) {
            taxSa = ((taxSalaryProduct(T) - value2) * 0.15) + (value2 * 0.1) + (value1 * 0.05);
        } else if (taxSalaryProduct(T) >= value3 && taxSalaryProduct(T) < value4) {
            taxSa = ((taxSalaryProduct(T) - value3) * 0.2) + (value3 * 0.15) + (value2 * 0.1) + (value1 * 0.05);
        } else if (taxSalaryProduct(T) >= value4 && taxSalaryProduct(T) < value5) {
            taxSa = ((taxSalaryProduct(T) - value4) * 0.25) + (value4 * 0.2) + (value3 * 0.15) + (value2 * 0.1) + (value1 * 0.05);
        } else if (taxSalaryProduct(T) >= value5 && taxSalaryProduct(T) < value6) {
            taxSa = ((taxSalaryProduct(T) - value5) * 0.3) + (value5 * 0.25) + (value4 * 0.2) + (value3 * 0.15) + (value2 * 0.1) + (value1 * 0.05);
        } else if (taxSalaryProduct(T) >= value6) {
            taxSa = ((taxSalaryProduct(T) - value6) * 0.35) + (value6 * 0.3) + (value5 * 0.25) + (value4 * 0.2) + (value3 * 0.15) + (value2 * 0.1) + (value1 * 0.05);
        }
        return taxSa;
    }
    
    public double naturalSalaty(StaffProduct T) {
        double natural = (taxSalaryProduct(T) - taxpersonProduct(T));
        return natural;
    }

    public double taxSalarySale(StaffSale T) {
        double taxSa = inComeSale(T) - 9000000 - (staff.numberName * 3600000);
        return taxSa;
    }
    
    public double taxpersonSale(StaffSale T) {
        double taxSa = 0d;
        final double value1 = 5000000;
        final double value2 = 10000000;
        final double value3 = 18000000;
        final double value4 = 32000000;
        final double value5 = 52000000;
        final double value6 = 80000000;
        if (taxSalarySale(T) < value1) {
            taxSa = taxSalarySale(T) * 0.05;
        } else if (taxSalarySale(T) >= value1 && taxSalarySale(T) < value2) {
            taxSa = ((taxSalarySale(T) - value1) * 0.1) + (value1 * 0.05);
        } else if (taxSalarySale(T) >= value2 && taxSalarySale(T) < value3) {
            taxSa = ((taxSalarySale(T) - value2) * 0.15) + (value2 * 0.1) + (value1 * 0.05);
        } else if (taxSalarySale(T) >= value3 && taxSalarySale(T) < value4) {
            taxSa = ((taxSalarySale(T) - value3) * 0.2) + (value3 * 0.15) + (value2 * 0.1) + (value1 * 0.05);
        } else if (taxSalarySale(T) >= value4 && taxSalarySale(T) < value5) {
            taxSa = ((taxSalarySale(T) - value4) * 0.25) + (value4 * 0.2) + (value3 * 0.15) + (value2 * 0.1) + (value1 * 0.05);
        } else if (taxSalarySale(T) >= value5 && taxSalarySale(T) < value6) {
            taxSa = ((taxSalarySale(T) - value5) * 0.3) + (value5 * 0.25) + (value4 * 0.2) + (value3 * 0.15) + (value2 * 0.1) + (value1 * 0.05);
        } else if (taxSalarySale(T) >= value6) {
            taxSa = ((taxSalarySale(T) - value6) * 0.35) + (value6 * 0.3) + (value5 * 0.25) + (value4 * 0.2) + (value3 * 0.15) + (value2 * 0.1) + (value1 * 0.05);
        }
        return taxSa;
    }
    
    public double naturalSalatySale(StaffSale T) {
        double natural = (taxSalarySale(T) - taxpersonSale(T));
        return natural;
    }
}
