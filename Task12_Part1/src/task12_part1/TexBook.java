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
 * Class for creating Texbook class
 */
public class TexBook extends Book {

    String statusBook;

    public TexBook(String statusBook, String codeBook, String nameBook, String dayIn, double unPrice, int quantity, String pubHouse) {
        super(codeBook, nameBook, dayIn, unPrice, quantity, pubHouse);
        this.statusBook = statusBook;
    }

    public TexBook() {
    }

    public String getStatusBook() {
        return statusBook;
    }

    public void setStatusBook(String statusBook) {
        this.statusBook = statusBook;
    }
    // show information textbook
    public String showInTextBook() {
        String s = super.showInforBook() + " Status book:" + statusBook;
        return s;
    }
}
