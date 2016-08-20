/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

/**
 *
 * @author Nguyen Van Nhut
 *  Point class
 * Version 1
 * Distribution:construct this class to return Point 
 * Input: x,y
 * Output: Point A, Point B 
 */
public class Points {

    /**
     * Distance from point 1 to point 2
     */
    
    int x;
    int y;
    // contructor function
    public Points(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // contructed defult 
    public Points() {
    }
    // get value x point.
    public int getX() {
        return x;
    }
    // set value x point.
    public void setX(int x) {
        this.x = x;
    }
    // get value y point.
    public int getY() {
        return y;
    }
    // set value y point.
    public void setY(int y) {
        this.y = y;
    }
}
