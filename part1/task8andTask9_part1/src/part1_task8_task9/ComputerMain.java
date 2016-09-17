/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part1_task8_task9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Nguyen Van Nhut
 * Day 22/08/2016
 * Version 1
 * Class for Main class
 */
public class ComputerMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String yn;
        Desktop[] Des = new Desktop[100];
        Laptop[] L = new Laptop[100];
        Laptop La;
        Desktop Desk;
        MannagerComputer MA = new MannagerComputer(L, Des);
        do {
            System.out.println("General Computer ");
            System.out.println("Enter No.Number:");
            String s = input.readLine();
            System.out.println("Enter Price:");
            double fee = Double.parseDouble(input.readLine());
            System.out.println("Enter manfacturer:");
            String fact = input.readLine();
            System.out.println("Number Computer:");
            int count = Integer.parseInt(input.readLine());
            Computer C = new Computer(s, fee, fact, count);
            System.out.println("Please choise (1)Laptop or (2)Desktop");
            int choise = Integer.parseInt(input.readLine());
            switch (choise) {
                case 1: {
                    La = MA.inLap(C);
                    MA.addLap(La);
                    MA.printInfLap();
                    MA.printInfDesk();
                    break;
                }
                case 2: {
                    Desk = MA.inDesk(C);
                    MA.addDesk(Desk);
                    MA.printInfLap();
                    MA.printInfDesk();
                    break;
                }
                default:
                    System.out.println("Please choise 1 or 2");

            }
            System.out.println("do you want add Conputer [y/n]:");
            yn = input.readLine();
        } while (yn.equalsIgnoreCase("y"));
        MA.SumFree();
    }

}
