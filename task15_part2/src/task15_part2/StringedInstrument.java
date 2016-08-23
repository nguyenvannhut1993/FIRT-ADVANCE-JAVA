/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task15_part2;

/**
 *
 * @author Nguyen Van Nhut
 * Day 23/08/2016
 * version 1
 * class for creating StringedInstrument class
 */
public class StringedInstrument extends Instrument{
    int nunberWire;

    public StringedInstrument(int nunberWire) {
        this.nunberWire = nunberWire;
    }

    public int getNunberWire() {
        return nunberWire;
    }

    public void setNunberWire(int nunberWire) {
        this.nunberWire = nunberWire;
    }

    public String getNameInstru() {
        return nameInstru;
    }

    public void setNameInstru(String nameInstru) {
        this.nameInstru = nameInstru;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    @Override
    public String plays()
    {
        return nameInstru +" -- "+ nunberWire;
    }
    public void showInfo()
    {
        System.out.println(" music information:"+plays());
    }
}
