/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

/**
 *
 * @author Nguyen Van Nhut
 * Rectangles Class
 * Input: Point A, Point B
 * Output: Area and Circumference of Rectangle
 */
public class Regtangless {
    Points A;
    Points B;

    public Regtangless(Points A, Points B) {
        this.A = A;
        this.B = B;
    }

    public Regtangless() {
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
    public double excuteCircumference(){
        double C = ((B.x - A.x)+(B.y - A.y))*2;
        return C;
    }
    public double excuteArea(){
        double S = ((B.x - A.x)*(B.y - A.y));
        return S;
    }
}

