/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdmanager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Nguyen Van Nhut Day 19/08/2016 Main class
 */
public class CDMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        CD[] arCD = new CD[30];
        CDManagers CD1 = new CDManagers(arCD);
        CD cd;
        String c;
        do {
            cd = CD1.inputCD();
            CD1.addCD(cd);
            CD1.printCD();
            System.out.println("Do you want add CD [y/n]");
            c = input.readLine();
        } while (c.equalsIgnoreCase("y"));
        System.out.println("Sum Price:"+CD1.excutePrice());
    }
}
