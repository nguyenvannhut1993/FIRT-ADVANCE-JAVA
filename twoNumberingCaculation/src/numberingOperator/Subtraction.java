/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberingOperator;

/**
 *
 * @author Nguyen Van Nhut
 * Class for Subtraction
 * input: two Number
 * Output: result of operation 
 */
public class Subtraction {

    TwoNumber A;
    TwoNumber B;

    public Subtraction() {
    }

    public Subtraction(TwoNumber A, TwoNumber B) {
        this.A = A;
        this.B = B;
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

    public double subtractTwoNumber() {
        double sub = 0;
        sub = A.firstNumber - B.secondNumber;
        return sub;
    }
}
