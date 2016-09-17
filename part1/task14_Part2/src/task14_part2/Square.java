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
 * class for building square class
 * input length 
 * output show  square area and  perimeter
 */
public class Square extends Shape{
    public double lengh;
    public double getLengh() {
        return lengh;
    }

    public void setLengh(double lengh) {
        this.lengh = lengh;
    }
    // calculate perimeter
    @Override
    public double perimeter()
    {
        return lengh*4;
    }
    //calculate area
    @Override
    public double area()
    {
        return lengh*lengh;
    }
}
