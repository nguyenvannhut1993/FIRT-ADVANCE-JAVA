/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task15_part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Nguyen Van Nhut
 * Day 23/08/2016
 * version 1
 * class for excuting programming 
 */
public class InstrumentMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Name Instrument:");
            String nIn = input.readLine();
            System.out.println("pubisher:");
            String pub = input.readLine();
            System.out.println("Choise (1)Instrument or (2)NonStringedInstrument");
            int choise = Integer.parseInt(input.readLine());
            int w = 0;
            String u = "";

            switch (choise) {
                case 1: {
                    System.out.println("Enter number wire:");
                    w = Integer.parseInt(input.readLine());
                    StringedInstrument str = new StringedInstrument(w);
                    str.setNameInstru(nIn);
                    str.setPublisher(pub);
                    str.showInfo();
                    break;
                }
                case 2: {
                    System.out.println("Enter uage:");
                    u = input.readLine();
                    NonStringedInstrument nonS = new NonStringedInstrument(u);
                    nonS.setNameInstru(nIn);
                    nonS.setPublisher(pub);
                    nonS.showInfor();
                    break;
                }
                default:
                    System.out.println("Please choise 1 or 2");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error:" + e.getMessage());
        }

    }

}
