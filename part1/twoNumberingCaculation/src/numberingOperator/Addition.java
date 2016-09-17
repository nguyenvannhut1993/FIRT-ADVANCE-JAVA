/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberingOperator;
/**
 *
 * @author Nguyen Van Nhut
 * Class for Addition
 * input: two Number
 * Output: result of operation 
 */
public class Addition {
    TwoNumber A;
    TwoNumber B;

    public Addition(TwoNumber A, TwoNumber B) {
        this.A = A;
        this.B = B;
    }

    public Addition() {
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
     public double addTwoNumber() {
        double sum = 0;
        sum = A.firstNumber + B.secondNumber;
        return sum;
    }
}
