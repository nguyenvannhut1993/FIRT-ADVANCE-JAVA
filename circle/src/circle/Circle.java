/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

/**
 *
 * @author Nguyen Van Nhut
 * Circle function
 * Distribution: To construct this class for calculate Area and Circumference
 * input: Point A, Point B
 * Output: Area and Circumference
 */
public class Circle {
    Points A;
    Points B;
    public Circle() {
    }

    public Circle(Points A, Points B) {
        this.A = A;
        this.B = B;
    }

    public Points getA() {
        return A;
    }

    public void setA(Points A) {
        this.A = A;
    }

    public Points getB() {
        return B;
    }

    public void setB(Points B) {
        this.B = B;
    }
    
    
    public double caculateCircumference()
    {
        Distance D = new Distance();
        final double PI = 3.14;
        double C = 0;
        C = PI*2*(D.calculateDistance(A,B));
        return C;
    }
     public double caculateArea()
    {
        Distance D = new Distance();
        final double PI = 3.14;
        double S = 0;
        S = PI*(D.calculateDistance(A,B)*D.calculateDistance(A,B));
        return S;
    }
}
