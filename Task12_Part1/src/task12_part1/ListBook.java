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
 * Class for creating list book class
 * 
 */
public class ListBook {

    TexBook[] A;
    RefenrenceBook[] B;

    public ListBook(TexBook[] A, RefenrenceBook[] B) {
        this.A = A;
        this.B = B;
    }

    public ListBook() {
    }

    public TexBook[] getA() {
        return A;
    }

    public void setA(TexBook[] A) {
        this.A = A;
    }

    public RefenrenceBook[] getB() {
        return B;
    }

    public void setB(RefenrenceBook[] B) {
        this.B = B;
    }

    public TexBook inTexBook(Book C) throws IOException {
       
        try
        {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter status book <new or old>");
        String st = input.readLine();
        TexBook T = new TexBook(st, C.getCodeBook(), C.getNameBook(), C.getDayIn(), C.getUnPrice(), C.getQuantity(), C.getPubHouse());
        return T;
        }
        catch(NumberFormatException | NullPointerException e)
        {
            System.out.println("Error:" +e.getMessage());
        }
         return null;
    }

    public RefenrenceBook inReference(Book C) throws IOException {
        try
        {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Tax");
        int ta = Integer.parseInt(input.readLine());
        RefenrenceBook R = new RefenrenceBook(ta, C.getCodeBook(), C.getNameBook(), C.getDayIn(), C.getUnPrice(), C.getQuantity(), C.getPubHouse());
        return R;
        }
        catch(NumberFormatException | NullPointerException e)
        {
            System.out.println("Error:"+e.getMessage());
        }
        return null;
    }
    // add Texbook in list
    public boolean addTexBook(TexBook T) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == null) {
                A[i] = T;
                return true;
            }
        }
        return false;
    }
    // add Reference in list
    public boolean addReferenceBook(RefenrenceBook R) {
        for (int i = 0; i < B.length; i++) {
            if (B[i] == null) {
                B[i] = R;
                return true;
            }
        }
        return false;
    }
    // caculate money for text book
    public void calTexBook(TexBook C) {
        double Avc = 0, Avc1 = 0, Avc2 = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != null) {
                if (C.statusBook.equalsIgnoreCase("new")) {
                    Avc1 = Avc1 + (A[i].unPrice * A[i].quantity);
                } else {
                    Avc2 = Avc2 + ((A[i].unPrice * A[i].quantity) * 0.5);
                }
            }

        }
        Avc = Avc1 + Avc2;
        System.out.println("sum money texbook :" + Avc);
    }
    // calculate money for Reference Book
    public void calReferenceBook() {
        double Av = 0;
        for (int i = 0; i < B.length; i++) {
            if (B[i] != null) {
                Av = Av + (((B[i].quantity * B[i].unPrice) + (B[i].quantity * B[i].unPrice)) * B[i].tax);
            }
        }
        System.out.println("Sum money Reference Book" + Av);
    }

    public void printInfTextBook() {
        for (TexBook T : A) {
            if (T != null) {
                System.out.println((T.showInTextBook()));
            }
        }
    }

    public void printInfFoginMoney() {
        for (RefenrenceBook R : B) {
            if (R != null) {
                System.out.println(R.showInReferenCeBook());
            }
        }
    }

    public void calAvPlusPriceTexBook() {
        double Av = 0;
        double Av1 = 0;
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != null) {
                Av = Av + A[i].unPrice;
                count++;
            }
            Av1 = Av / count;
        }
        System.out.println("average sum of unit price TextBook:" + Av1);
    }

    public void calAvPlusPriceReferenceBook() {
        double Av = 0;
        double Av1 = 0;
        int count = 0;
        for (int i = 0; i < B.length; i++) {
            if (B[i] != null) {
                Av = Av + B[i].unPrice;
                count++;
            }
            Av1 = Av / count;
        }
        System.out.println("average sum of unit price Reference Book:" + Av1);
    }
}
