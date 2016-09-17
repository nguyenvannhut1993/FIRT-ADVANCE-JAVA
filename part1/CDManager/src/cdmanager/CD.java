/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdmanager;

/**
 *
 * @author Nguyen Van Nhut
 * Day 19/08/2016
 *  CD class
 * create CD 
 * input: index, name CD, Singer, NumberSong, price
 * 
 */
public class CD {

    String indexCD;
    String nameCD;
    String Singer;
    int numberSong;
    float Price;

    public CD(String indexCD, String nameCD, String Singer, int numberSong, float Price) {
        this.indexCD = indexCD;
        this.nameCD = nameCD;
        this.Singer = Singer;
        this.numberSong = numberSong;
        this.Price = Price;
    }

    public CD() {
    }

    public String getIndexCD() {
        return indexCD;
    }

    public void setIndexCD(String indexCD) {
        this.indexCD = indexCD;
    }

    public String getNameCD() {
        return nameCD;
    }

    public void setNameCD(String nameCD) {
        this.nameCD = nameCD;
    }

    public String getSinger() {
        return Singer;
    }

    public void setSinger(String Singer) {
        this.Singer = Singer;
    }

    public int getNumberSong() {
        return numberSong;
    }

    public void setNumberSong(int numberSong) {
        this.numberSong = numberSong;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }
   // function print 
    public void printCD() {
        System.out.println("Index:" + getIndexCD() + "--- " + " NameCD: " + getNameCD() + "--- " + "Singer:"
                + getSinger() + "--- " + "Number Song :" + getNumberSong() + "--- " + "Price:" + getPrice());
    }
}
