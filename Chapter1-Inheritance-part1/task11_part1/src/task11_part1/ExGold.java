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
 * class for creating Exchange Gold price
 */
public class ExGold extends Exchange{
    String typeGold;
    public ExGold(String typeGold, String noExchage, String dateEx, double unPrice, int Number) {
        super(noExchage, dateEx, unPrice, Number);
        this.typeGold = typeGold;
    }

    public ExGold(String typeGold) {
        this.typeGold = typeGold;
    }

    public ExGold() {
    }

    public String getTypeGold() {
        return typeGold;
    }

    public void setTypeGold(String typeGold) {
        this.typeGold = typeGold;
    }
    public double calMoneyGold()
    {
        return super.calMoney(Number, unPrice);
    }
    // show information
    public String showInforGoid() {
        String s = super.showInforExhange() + "type of gold:" + typeGold;
        return s;
    }
}
