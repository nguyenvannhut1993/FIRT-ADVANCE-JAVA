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
 * class for creating class NonStringedInstrument
 */
public class NonStringedInstrument extends Instrument {

    String uage;

    public NonStringedInstrument(String uage) {
        this.uage = uage;
    }

    public NonStringedInstrument() {
    }

    public String getUage() {
        return uage;
    }

    public void setUage(String uage) {
        this.uage = uage;
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
    public String plays() {
        return uage;
    }

    public void showInfor() {
        System.out.println(" music information:" + plays());
    }

}
