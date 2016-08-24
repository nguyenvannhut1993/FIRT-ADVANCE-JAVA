/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberingOperator;

import java.awt.Point;

/**
 *
 *@author Nguyen Van Nhut
 * Class for Multiplication
 * input: two Number
 * Output: result of operation 
 */
public class Multiplication {
    TwoNumber A;
    TwoNumber B;

    public Multiplication(TwoNumber A, TwoNumber B) {
        this.A = A;
        this.B = B;
    }

    public Multiplication() {
    }

    public TwoNumber getA() {
        return A;
    }

    public void setA(TwoNumber A) {
        this.A = A;
    }

    public TwoNumber getB() {
        return B;
    }

    public void setB(TwoNumber B) {
        this.B = B;
    }
    public double multiplyTwoNumber() {
        double mul = 0;
        mul = A.firstNumber * B.secondNumber;
        return mul;
    }
}
