/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task13_part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hv
 */
public class StaffMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String yn = "";
        String names = "";
        double coeff;
        int numName;
        StaffProduct[] A = new StaffProduct[100];
        StaffSale[] B = new StaffSale[100];
        ManagementStaff M = new ManagementStaff(A, B);
        do {
            System.out.println("Enter name");
            names = input.readLine();
            System.out.println("Enter coefficientsSalary");
            coeff = Double.parseDouble(input.readLine());
            System.out.println("Enter numerName who is based on");
            numName = Integer.parseInt(input.readLine());
            System.out.println("Please choice (1)StaffSell or (2)StaffProduct");
            int choice = Integer.parseInt(input.readLine());
            switch (choice) {
                case 1: {
                    System.out.println("Enter salary sale:");
                    double soS = Double.parseDouble(input.readLine());
                    System.out.println("Enter ratio sale :");
                    double pesent = Double.parseDouble(input.readLine());
                    Names nams = new Names();
                    nams.setNames(names);;
                    StaffSale sa = new StaffSale(soS, pesent, nams, numName, coeff);
                    Staff sta = new Staff(nams, numName, coeff);
                    Salary sala = new Salary(sta, null, sa);
                    M.addSale(sa);
                    M.showStaffSale(sala);
                    break;
                }
                case 2: {
                    System.out.println("Enter number products is created:");
                    double pro = Double.parseDouble(input.readLine());
                    Names nams = new Names(names);
                    StaffProduct sa = new StaffProduct(pro, nams, numName, coeff);
                    Staff sta = new Staff(nams, numName, coeff);
                    Salary sala = new Salary(sta, sa, null);
                    M.addProduct(sa);
                    M.showStaffProduct(sala);
                    break;
                }
            }
            System.out.println("do you want add staff? [y/n]");
            yn = input.readLine();
        } while (yn.equalsIgnoreCase("y"));
    }
}
