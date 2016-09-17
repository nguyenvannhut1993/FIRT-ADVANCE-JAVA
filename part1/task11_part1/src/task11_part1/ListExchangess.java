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
 * class for creating list class
 * input list Gold, ForeignExchange
 * output add list and calculate price, fee
 */
public class ListExchangess {

    ExGold[] A;
    ForeignExchange[] B;

    public ListExchangess(ExGold[] A, ForeignExchange[] B) {
        this.A = A;
        this.B = B;
    }

    public ListExchangess() {
    }

    public ExGold[] getA() {
        return A;
    }

    public void setA(ExGold[] A) {
        this.A = A;
    }

    public ForeignExchange[] getB() {
        return B;
    }

    public void setB(ForeignExchange[] B) {
        this.B = B;
    }
    // input Gold
    public ExGold inGold(Exchange C) throws IOException {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter Type gold:");
            String Tye = input.readLine();
            ExGold T = new ExGold(Tye, C.getNoExchage(), C.getDateEx(), C.getUnPrice(), C.getNumber());
            return T;
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return null;
    }
    // input exchange Money
    public ForeignExchange inExMoney(Exchange C) throws IOException {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter Type Exchange < buy or sell> :");
            String Tye = input.readLine();
            System.out.println("Enter Type Money :");
            String tyMoney = input.readLine();
            ForeignExchange T = new ForeignExchange(tyMoney, Tye, C.getNoExchage(), C.getDateEx(), C.getUnPrice(), C.getNumber());
            return T;
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return null;
    }
    // add Gold in list
    public boolean addGold(ExGold G) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == null) {
                A[i] = G;
                return true;
            }
        }
        return false;
    }
    // add dola in list
    public boolean addFogin(ForeignExchange F) {
        for (int i = 0; i < B.length; i++) {
            if (B[i] == null) {
                B[i] = F;
                return true;
            }
        }
        return false;
    }
    // calculate dola
    public double calFogins() {
        double Av = 0;
        for (int i = 0; i < B.length; i++) {
            if (B[i] != null) {
                Av = Av + (B[i].calMoneyFogin());
            }

        }
        return Av;
    }
    // sum 
    public void sumFogin() {
        System.out.println("Avange exchange money:" + (calFogins()));
    }
    // calculate Gold Price
    public void calGold() {
        double Avc = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != null) {
                Avc = Avc + (A[i].calMoneyGold());
            }
        }
        System.out.println("Avange exchange gold :" + Avc);
    }
    // show information
    public void printInfExchangeGold() {
        for (ExGold L : A) {
            if (L != null) {
                System.out.println(L.showInforGoid());
            }
        }
    }
    // show information
    public void printInfFoginMoney() {
        for (ForeignExchange L : B) {
            if (L != null) {
                System.out.println(L.showInforFogin());
            }
        }
    }
}
