/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task10_part1;

/**
 *
 *@author Nguyen Van Nhut
 * Day 22/08/2016
 * Version 1
 * class for Creating Human class
 * input name,Birthday, Address, phoneNumber
 * output : show information
 */
public class Human {

    String Name;
    String Birthday;
    String Address;
    String phoneNumber;

    public Human(String Name, String Birthday, String Address, String phoneNumber) {
        this.Name = Name;
        this.Birthday = Birthday;
        this.Address = Address;
        this.phoneNumber = phoneNumber;
    }

    public Human() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    // show information Human 
    public String ShowHunman() {
        String s = "Name:" + Name + " -- " + "BirthDay:" + Birthday + " -- " + "Address:" + Address + " -- "
                + "PhoneNumber:" + phoneNumber + " -- ";
        return s;
    }
}
