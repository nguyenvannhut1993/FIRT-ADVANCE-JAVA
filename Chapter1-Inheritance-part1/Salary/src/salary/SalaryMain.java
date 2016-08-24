/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Nguyen Van Nhut
 * Main class
 * version 1
 * to implement
 * 
 */
public class SalaryMain {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter name");
            String name = input.readLine();
            System.out.println("Enter coefficientsSalary");
            double coeff = Double.parseDouble(input.readLine());
            System.out.println("Enter numerName who is based on");
            int numName = Integer.parseInt(input.readLine());
            System.out.println("Enter benefit");
            double bef = Double.parseDouble(input.readLine());
            Staff staff = new Staff();
            Names myName = new Names();
            Salary salary = new Salary();
            myName.setName(name);
            staff.setName(myName);
            staff.setCoefficientsSalary(coeff);
            staff.setNumberName(numName);
            staff.setBenefit(bef);
            salary.setStaff(staff);
            System.out.println("Salary:" + String.format("%.2f",salary.inCome()));
            System.out.println("tax salary:" +  String.format("%.2f",salary.taxSalary()));
            System.out.println("tax preson is:" + salary.taxperson());
            System.out.println("natural salary is recieved:" +  String.format("%.2f",salary.naturalSalaty()));
        } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }

}
