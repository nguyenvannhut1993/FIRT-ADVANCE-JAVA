/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberingOperator;

/**
 *
 * @author Nguyen Van Nhut
 * Class for Division
 * input: two Number
 * Output: result of operation 
 */
public class Division {
    TwoNumber A;
    TwoNumber B;

    public Division() {
    }

    public Division(TwoNumber A, TwoNumber B) {
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
    public double divideTwoNumber() {
        double div = 0;
            div =  (double)A.firstNumber / B.secondNumber;
         return div; 
    }
}

