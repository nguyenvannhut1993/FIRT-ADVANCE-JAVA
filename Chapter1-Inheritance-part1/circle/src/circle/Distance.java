/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

/**
 *
 * @author Nguyen Van Nhut
 * Distance function
 * Version 1
 * Distribution:construct this class to calculate Distance of two point
 * Input: Point A, Point B
 * Output: Distance 
 */
public class Distance {

    Points A;
    Points B;

    public Distance(Points A, Points B) {
        this.A = A;
        this.B = B;
    }

    public Distance() {
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

    public double calculateDistance(Points B, Points A) {
        double dis = 0;
        dis = Math.sqrt(((A.x - B.x) * (A.x - B.x)) + ((A.y - B.y) * (A.y - B.y)));
        return dis;
    }
}
