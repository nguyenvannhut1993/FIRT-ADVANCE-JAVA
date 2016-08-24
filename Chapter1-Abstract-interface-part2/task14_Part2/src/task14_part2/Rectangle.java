/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task14_part2;

/**
 *
 * @author hv
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
    @Override
    public double perimeter()
    {
        return (len + Wight)*2;
    }
    @Override
    public double area()
    {
        return len*Wight;
    }
}
