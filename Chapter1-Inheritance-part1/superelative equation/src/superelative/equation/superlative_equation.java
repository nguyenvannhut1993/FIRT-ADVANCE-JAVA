/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superelative.equation;

/**
 *
 * @author hv
 */
public class superlative_equation {

    int a, b;

    public void setA(int value_A) {
        a = value_A;
    }

    public void setB(int value_B) {
        b = value_B;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public double executeEquation() {
        double root = 0;
        if (a == 0 && b != 0) {
            root = Double.MIN_VALUE;
        } else if (a == 0 && b == 0) {
            root = Double.MAX_VALUE;
        } else {
            root = -b / a;
        }
        return root;
    }

}
