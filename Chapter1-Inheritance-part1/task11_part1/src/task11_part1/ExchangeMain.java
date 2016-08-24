/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task11_part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Nguyen Van Nhut
 * Day 22/08/2016
 * Version 1
 * class for creating Main class
 */
public class ExchangeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            String ysn = "";
            ExGold[] A = new ExGold[100];
            ForeignExchange[] B = new ForeignExchange[100];
            ListExchangess Lists = new ListExchangess(A, B);
            do {
                System.out.println("Enter No Exhange:");
                String n = input.readLine();
                System.out.println("Enter Day Exchange:");
                String b = input.readLine();
                System.out.println("Enter unPrice:");
                double un = Double.parseDouble(input.readLine());
                System.out.println("Enter Number :");
                int nu = Integer.parseInt(input.readLine());
                System.out.println("Please choice (1)Exgold or (2)ExFoginMoney");
                int choice = Integer.parseInt(input.readLine());
                Exchange ex = new Exchange(n, b, un, nu);
                switch (choice) {
                    case 1: {
                        ExGold exGold = Lists.inGold(ex);
                        Lists.addGold(exGold);
                        Lists.printInfExchangeGold();
                        Lists.calGold();
                        break;
                    }
                    case 2: {
                        ForeignExchange exFogin = Lists.inExMoney(ex);
                        Lists.addFogin(exFogin);
                        double moneys = Lists.calFogins();
                        Lists.printInfFoginMoney();
                        System.out.println("money was exchamge:" + moneys);
                    }
                }
                System.out.println("do you want add gold or add money [y/n] ");
                ysn = input.readLine();
            } while (ysn.equalsIgnoreCase("y"));
            Lists.printInfExchangeGold();
            Lists.printInfFoginMoney();
            Lists.calGold();
            Lists.sumFogin();
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
}
