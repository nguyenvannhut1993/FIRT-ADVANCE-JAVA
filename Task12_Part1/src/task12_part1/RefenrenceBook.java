/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task12_part1;

/**
 *
 * @author Nguyen Van Nhut
 * Day 22/08/2016
 * Version 1
 * Class for creating Reference class
 */
public class RefenrenceBook extends Book {

    int tax;

    public RefenrenceBook(int tax, String codeBook, String nameBook, String dayIn, double unPrice, int quantity, String pubHouse) {
        super(codeBook, nameBook, dayIn, unPrice, quantity, pubHouse);
        this.tax = tax;
    }

    public RefenrenceBook(int tax) {
        this.tax = tax;
    }

    public RefenrenceBook() {
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }
    // show information for Reference Book
    public String showInReferenCeBook() {
        String s = super.showInforBook() + " Tax:" + tax;
        return s;
    }
}
