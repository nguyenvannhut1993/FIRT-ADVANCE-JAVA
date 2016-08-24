/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part1_task8_task9;

/**
 *
 * @author Nguyen Van Nhut
 * Day 22/08/2016
 */
public class Laptop extends Computer{
    double Wight;
    double Time;
    double Resolusion; 

    public Laptop(double Wight, double Time, double Resolusion, String No, double price, String manufacturer, int quantity) {
        super(No, price, manufacturer, quantity);
        this.Wight = Wight;
        this.Time = Time;
        this.Resolusion = Resolusion;
    }

    public Laptop(double Wight, double Time, double Resolusion) {
        this.Wight = Wight;
        this.Time = Time;
        this.Resolusion = Resolusion;
    }
    public Laptop() {
    }
    // show information
    @Override
    public String showStringInfo() {
       String s = super.showStringInfo()+"Wight:"+Wight+" --- "+"Time:"+Time + " --- "+
               "Resolusion:"+Resolusion;
        return s; 
    }
    
}
