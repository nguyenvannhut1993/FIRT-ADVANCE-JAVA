/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task14_part2;

/**
 *
 * @author Nguyen Van Nhut
 */
public class Circle extends Shape{
    public double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    @Override
    public double perimeter()
    {
        return 2*Math.PI*r;
    }
    @Override
    public double area()
    {
        return Math.pow(r, 2);
    }
}
