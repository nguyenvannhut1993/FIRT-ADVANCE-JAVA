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
 * Class for creating Main class to excute programming  
 * 
 */
public class SodierMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter infantryman Soldier name:");
            String name = input.readLine();
            System.out.println("Enter powerful Soldier :");
            int p = Integer.parseInt(input.readLine());
            System.out.println("Enter type of infantryman weapon:");
            String w = input.readLine();
            System.out.println("Enter trooper Soldier name:");
            String name1 = input.readLine();
            System.out.println("Enter powerful Soldier :");
            int p1 = Integer.parseInt(input.readLine());
            System.out.println("Enter type of trooper weapon:");
            String w1 = input.readLine();
            Infantryman in = new Infantryman(name, p, w);
            Trooper tro = new Trooper(name1, p1, w1);
            in.Shows(name, p, w);
            tro.Shows(name1, p1, w1);
            int pw = in.power;
            int pw1 = tro.power;
            while (pw > 0 && pw1 > 0) {
                System.out.println("Enter select (1)infantryman or (2)trooper to fight");
                int select = Integer.parseInt(input.readLine());
                if (select == 1) {
                    pw1 = tro.Fight(pw1);
                    tro.Shows(name1, pw1, w1);
                } else if (select == 2) {
                    pw = in.Fight(pw);
                    in.Shows(name, pw, w);
                } else {
                    System.out.println("Please select 1 or 2");
                }
            }
            in.Shows(name, pw, w);
            tro.Shows(name1, pw1, w1);
        } catch (NumberFormatException e) {
            System.out.println("Error:" + e.getMessage());
        }

    }

}
