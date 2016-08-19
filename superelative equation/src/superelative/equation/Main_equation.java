/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superelative.equation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hv
 */
public class Main_equation {

    public static void main(String[] args) throws IOException {
        try {
        superlative_equation ex = new superlative_equation(); // create new class 
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter value A:");
        int a = Integer.parseInt(input.readLine());
        System.out.println("Enter value B:");
        int b = Integer.parseInt(input.readLine());
        ex.setA(a); // call function setA
        ex.setB(b); // call function setB
        double value_Ex;
        if (ex.executeEquation() == Double.MAX_VALUE) {
            System.out.println(" amost root");
        } else if (ex.executeEquation() == Double.MIN_VALUE) {
            System.out.println(" no root");
        } else {
            value_Ex = ex.executeEquation();
            System.out.println(" the root of superlative equation:" + value_Ex);
        }
        }
        catch(NumberFormatException | ArithmeticException e){
            System.out.println("Error:"+e.getMessage());
        }
        
    }

}
