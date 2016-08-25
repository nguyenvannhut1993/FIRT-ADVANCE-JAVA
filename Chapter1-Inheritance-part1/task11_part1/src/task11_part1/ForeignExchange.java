/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task11_part1;

/**
 *
 * @author Nguyen Van Nhut
 * Day 22/08/2016
 * Version 1
 * class for creating Exchange foreign price
 * input type Money, type of exchange
 * output show information
 */
public class ForeignExchange extends Exchange{
    String typeMoney;
    String TypExchage;

    public ForeignExchange(String typeMoney, String TypExchage, String noExchage, String dateEx, double unPrice, int Number) {
        super(noExchage, dateEx, unPrice, Number);
        this.typeMoney = typeMoney;
        this.TypExchage = TypExchage;
    }

    public ForeignExchange() {
    }

    public String getTypeMoney() {
        return typeMoney;
    }

    public void setTypeMoney(String typeMoney) {
        this.typeMoney = typeMoney;
    }

    public String getTypExchage() {
        return TypExchage;
    }

    public void setTypExchage(String TypExchage) {
        this.TypExchage = TypExchage;
    }

    public ForeignExchange(String typeMoney, String TypExchage) {
        this.typeMoney = typeMoney;
        this.TypExchage = TypExchage;
    }

    
    public double calMoneyFogin()
    {
        double sum =0;
        if(TypExchage.equalsIgnoreCase("buy"))
             sum = super.calMoney(Number, unPrice);
        else
            sum = super.calMoney(Number, unPrice)*super.calMoney(Number, unPrice)*0.1;
        return sum;
    }
    public String showInforFogin() {
        String s = super.showInforExhange() + "type of Money:" + typeMoney;
        return s;
    }
}
