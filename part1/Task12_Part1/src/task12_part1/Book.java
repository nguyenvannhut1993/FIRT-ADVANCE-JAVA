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
 * Class for creating Book class
 */
public class Book {

    String codeBook;
    String nameBook;
    String dayIn;
    double unPrice;
    int quantity;
    String pubHouse;

    public Book(String codeBook, String nameBook, String dayIn, double unPrice, int quantity, String pubHouse) {
        this.codeBook = codeBook;
        this.nameBook = nameBook;
        this.dayIn = dayIn;
        this.unPrice = unPrice;
        this.quantity = quantity;
        this.pubHouse = pubHouse;
    }

    public Book() {
    }

    public String getCodeBook() {
        return codeBook;
    }

    public void setCodeBook(String codeBook) {
        this.codeBook = codeBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getDayIn() {
        return dayIn;
    }

    public void setDayIn(String dayIn) {
        this.dayIn = dayIn;
    }

    public double getUnPrice() {
        return unPrice;
    }

    public void setUnPrice(double unPrice) {
        this.unPrice = unPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPubHouse() {
        return pubHouse;
    }

    public void setPubHouse(String pubHouse) {
        this.pubHouse = pubHouse;
    }

    public String showInforBook() {
        String s = "Type Code Book.:" + codeBook + " -- " + "Day get book:" + dayIn + " -- " + "unit price:" + unPrice + " -- "
                + "Quanlity:" + quantity + " -- " + "publishing House:" + pubHouse + " -- ";
        return s;
    }
}
