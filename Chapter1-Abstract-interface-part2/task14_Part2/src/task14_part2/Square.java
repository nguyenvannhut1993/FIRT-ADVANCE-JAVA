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
public class Square extends Shape{
    public double lengh;
    public double getLengh() {
        return lengh;
    }

    public void setLengh(double lengh) {
        this.lengh = lengh;
    }
    @Override
    public double perimeter()
    {
        return lengh*4;
    }
    @Override
    public double area()
    {
        return lengh*lengh;
    }
}
