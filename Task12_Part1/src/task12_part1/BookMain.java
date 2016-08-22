/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task12_part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Nguyen Van Nhut
 * Day 22/08/2016
 * Version 1
 * Class for creating Main class
 */
public class BookMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
      
     BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String ysn = "";
        TexBook T[] = new TexBook[100];
        RefenrenceBook Rf[] = new RefenrenceBook[100];
        ListBook Lists = new ListBook(T,Rf);
        do {
            System.out.println("Enter code book");
            String c = input.readLine();
            System.out.println("Enter name book:");
            String n = input.readLine();
            System.out.println("Enter getted day:");
            String d = input.readLine();
            System.out.println("Enter publishing house:");
            String p = input.readLine();
            System.out.println("Enter unit price");
            double u = Double.parseDouble(input.readLine());
            System.out.println("Enter quanlity");
            int q = Integer.parseInt(input.readLine());
            System.out.println("Please choice (1)Texbook or (2)RefereceBook [y/n]:");
            int choice = Integer.parseInt(input.readLine());
            Book B = new Book(c, n, d, u, q,p);
            switch (choice) {
                case 1: {
                   TexBook Text = Lists.inTexBook(B);
                    Lists.addTexBook(Text);
                    Lists.printInfTextBook();
                    Lists.calTexBook(Text);
                    Lists.calAvPlusPriceTexBook();
                    break;
                }
                case 2: {
                    RefenrenceBook Refe = Lists.inReference(B);
                    Lists.addReferenceBook(Refe);
                    Lists.printInfFoginMoney();
                    Lists.calReferenceBook();
                    Lists.calAvPlusPriceReferenceBook();
                    Lists.calReferenceBook();
                    break;
                }
            }
            System.out.println("do you want add Textbook or add Reference Book [y/n] ");
            ysn = input.readLine();
        } while (ysn.equalsIgnoreCase("y"));
        
    }
    
}
