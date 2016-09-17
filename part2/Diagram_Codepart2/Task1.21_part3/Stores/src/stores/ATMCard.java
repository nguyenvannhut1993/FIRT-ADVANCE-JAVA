/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stores;

/**
 *
 * @author nguyen van nhut
 * Day:29/08/2016
 * version 1
 * class for creating ATMCard
 * input balance,authucation
 * output show information
 */
public class ATMCard implements authuMethod {

    private double balance;
    private String athucation;

    public ATMCard(double balance, String athucation) {
        this.balance = balance;
        this.athucation = athucation;
    }

    public ATMCard() {
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAthucation() {
        return athucation;
    }

    public void setAthucation(String athucation) {
        this.athucation = athucation;
    }

    public void finalize() throws Throwable {

    }

    public String authuCardMethod() {
        String s = athucation;
        return s;
    }
    //show information
    public String showInfoATM() {
        return "blance:" + balance + "--authucation:" + authuCardMethod();
    }
}
