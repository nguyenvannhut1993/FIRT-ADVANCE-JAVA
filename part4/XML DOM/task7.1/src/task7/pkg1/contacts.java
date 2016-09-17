/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task7.pkg1;

/**
 *
 * @author Nguyen Van Nhut
 */
public class contacts {
  String name;
  String phomeNumber;

    public contacts(String name, String phomeNumber) {
        this.name = name;
        this.phomeNumber = phomeNumber;
    }

    public contacts() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhomeNumber() {
        return phomeNumber;
    }

    public void setPhomeNumber(String phomeNumber) {
        this.phomeNumber = phomeNumber;
    }

    @Override
    public String toString() {
        return "name: "+name+" -- "+"phone: "+phomeNumber;
    }
    
}
