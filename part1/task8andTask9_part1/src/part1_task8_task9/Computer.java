/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part1_task8_task9;

/**
 *
 * @author Nguyen Van nhut
 * Day 22/08/2016
 * Version 1
 * class for build super class and create show all information, calculate fee
 * 
 */
public class Computer {
    String No;
    double price;
    String manufacturer;
    int quantity;
    public Computer(String No, double price, String manufacturer, int quantity) {
        this.No = No;
        this.price = price;
        this.manufacturer = manufacturer;
        this.quantity = quantity;
    }
    public Computer() {
    }

    public String getNo() {
        return No;
    }

    public void setNo(String No) {
        this.No = No;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    // method calculate fee products
    public double calFee( double price, int quantity){
        double sum = price*quantity;
        return sum;
    }
    // method show information 
    public String showStringInfo()
    {
        String s = "No.:"+ No +" --- " + "Price:"+ price + " --- "+"manufacturer"+ 
                manufacturer+" --- ";
        return s;
    }
}
