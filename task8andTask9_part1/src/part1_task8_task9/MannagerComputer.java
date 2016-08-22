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
 * Class for Excuting computer
 */
public class MannagerComputer extends Computer {

    Laptop[] A;
    Desktop[] B;

    public MannagerComputer(Laptop[] A, Desktop[] B) {
        this.A = A;
        this.B = B;
    }

    public MannagerComputer() {
    }

    public Laptop[] getA() {
        return A;
    }

    public void setA(Laptop[] A) {
        this.A = A;
    }

    public Desktop[] getB() {
        return B;
    }

    public void setB(Desktop[] B) {
        this.B = B;
    }
   // enter laptop
    public Laptop inLap(Computer C) throws IOException {
        try
        {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        double W = 0, T = 0, R = 0;
        System.out.println("Enter Wight ");
        W = Double.parseDouble(input.readLine());
        System.out.println("Enter timming Pin:");
        T = Double.parseDouble(input.readLine());
        System.out.println("Enter Resolusion Graphic:");
        R = Double.parseDouble(input.readLine());
        Laptop Lap = new Laptop(W, T, R, C.getNo(), C.getPrice(), C.getManufacturer(), C.getQuantity());
        return Lap;
        }
        catch(NumberFormatException e)
        {
            System.out.println("Error:" +e.getMessage());       
         }
        return null;
    }
    // enter Desktop computer
    public Desktop inDesk(Computer C) throws IOException {
        try
        {
        Computer Co = new Computer();
        String CA, RA;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter type CPU:");
        CA = input.readLine();
        System.out.println("Enter type RAM");
        RA = input.readLine();
        Desktop Des = new Desktop(CA, RA, C.getNo(), C.getPrice(), C.getManufacturer(), C.getQuantity());
        return Des;
        }
        catch(NumberFormatException e)
        {
            System.out.println("Error:" +e.getMessage());       
         }
        return null;
    }
    // add array Desktop Computer
    public boolean addDesk(Desktop Des) {
        for (int i = 0; i < B.length; i++) {
            if (B[i] == null) {
                B[i] = Des;
                return true;
            }
        }
        return false;
    }
    //add array laptop
    public boolean addLap(Laptop Des) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == null) {
                A[i] = Des;
                return true;
            }
        }
        return false;
    }
    // print information lap
    public void printInfLap() {
        for (Laptop L : A) {
            if (L != null) {
                System.out.println(L.showStringInfo());
            }
        }
    }
    // print information Desktop
    public void printInfDesk() {
        for (Desktop L : B) {
            if (L != null) {
                System.out.println(L.showStringInfo());
            }
        }
    }
    // calculate Price 
    public void SumFree() {
        double sum = 1d, sum2 = 0d, sum1 = 0d;
        for (int i = 0; i < A.length; i++) {
            if(A[i] != null)
                sum1 += calFee(A[i].price, A[i].quantity);
        }
        for (int i = 0; i < B.length; i++) {
            if(B[i] != null)
                sum2 +=calFee(B[i].price, B[i].quantity);
        }

        sum = sum1 + sum2;
        System.out.println("Sum price:" + sum);
    }
}
