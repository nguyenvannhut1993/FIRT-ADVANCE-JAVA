/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task14_part2;

/**
 *
 * @author Nguyen Van Nhut
 * version 1
 * Day 23/08/2016
 * class for building circle class
 * input radius 
 * output show  circle area and  perimeter
 */
public class Circle extends Shape{
    public double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    // calculate perimeter
    @Override
    public double perimeter()
    {
        return 2*Math.PI*r;
    }
    // calculate area
    @Override
    public double area()
    {
        return Math.pow(r, 2);
    }
}
