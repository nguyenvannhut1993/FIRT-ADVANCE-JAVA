/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberingOperator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Nguyen Van Nhut 
 * Method Main of Number
 */
public class NumberingOperatorMain {

    public static void main(String[] args) throws IOException {
        try {
            // buffer input
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter first Number");
            int a = Integer.parseInt(input.readLine()); // read out of keyboard
            System.out.println("Enter two Number");
            int b = Integer.parseInt(input.readLine()); // read out of keyboard
            // create new Object
            TwoNumber Number1 = new TwoNumber();
            TwoNumber Number2 = new TwoNumber();
            Addition Ad = new Addition();
            Multiplication Mu = new Multiplication();
            Division Di = new Division();
            Subtraction Su = new Subtraction();
            Number1.setFirstNumber(a);
            Number2.setSecondNumber(b);
            // call method
            Ad.setA(Number1);
            Ad.setB(Number2);
            Su.setA(Number1);
            Su.setB(Number2);
            Mu.setA(Number1);
            Mu.setB(Number2);
            Di.setA(Number1);
            Di.setB(Number2);
            double add = Ad.addTwoNumber();
            System.out.println("Sum of two numbers are:" + String.format("%.0f", add));
            double sub = Su.subtractTwoNumber();
            System.out.println("Subtraction of two numbers are:" + String.format("%.0f", sub));
            double mul = Mu.multiplyTwoNumber();
            System.out.println("Multiplication of two numbers are:" + String.format("%.0f", mul));
            double div = Di.divideTwoNumber();
            System.out.println("Division of two numbers are:" + String.format("%.2f", div));
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("error:" + e.getMessage());
        }
    }
}
