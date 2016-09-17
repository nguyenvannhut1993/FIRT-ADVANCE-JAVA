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
 * class for building rectangle class
 * input wight, lengh;
 * output show  rectangle area and  perimeter
 */
public class Rectangle extends Shape{
    public double Wight;
    public double len;

    public double getWight() {
        return Wight;
    }

    public void setWight(double Wight) {
        this.Wight = Wight;
    }

    public double getLen() {
        return len;
    }

    public void setLen(double len) {
        this.len = len;
    }
    //calculate perimeter
    @Override
    public double perimeter()
    {
        return (len + Wight)*2;
    }
    // calculate area
    @Override
    public double area()
    {
        return len*Wight;
    }
}
