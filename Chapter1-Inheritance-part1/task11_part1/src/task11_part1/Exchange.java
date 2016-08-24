/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task11_part1;

/**
 *
 * @author Nguyen Van Nhut
 * @author Nguyen Van Nhut
 * Day 22/08/2016
 * Version 1
 * class for creating Exchange
 */
public class Exchange {
    String noExchage;
    String dateEx;
    double unPrice;
    int Number;

    public Exchange(String noExchage, String dateEx, double unPrice, int Number) {
        this.noExchage = noExchage;
        this.dateEx = dateEx;
        this.unPrice = unPrice;
        this.Number = Number;
    }

    public Exchange() {
    }

    public String getNoExchage() {
        return noExchage;
    }

    public void setNoExchage(String noExchage) {
        this.noExchage = noExchage;
    }

    public String getDateEx() {
        return dateEx;
    }

    public void setDateEx(String dateEx) {
        this.dateEx = dateEx;
    }

    public double getUnPrice() {
        return unPrice;
    }

    public void setUnPrice(double unPrice) {
        this.unPrice = unPrice;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int Number) {
        this.Number = Number;
    }
    public double calMoney( int number, double unprice )
    {
        double sum =0;
        sum = number * unprice;
        return sum;
    }
    public String showInforExhange() {
        String s = "Type No.:" +noExchage  + " -- " + "Day Exchange:" + dateEx + " -- " + "unprice:" + unPrice + " -- "
                + "Number:" + Number + " -- ";
        return s;
    }
}
