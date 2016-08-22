/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part1_task8_task9;

/**
 *
 * @author Nguyen Van Nhut
 * Day 22/08/2016
 * Class for creating type Desktop
 */
public class Desktop extends Computer{
    String CPU;
    String RAM;

    public Desktop(String CPU, String RAM, String No, double price, String manufacturer, int quantity) {
        super(No, price, manufacturer, quantity);
        this.CPU = CPU;
        this.RAM = RAM;
    }

    public Desktop(String CPU, String RAM) {
        this.CPU = CPU;
        this.RAM = RAM;
    }

    public Desktop() {
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }
    // show information
     @Override
    public String showStringInfo() {
       String s = super.showStringInfo()+RAM + " --- "+"CPU:"+CPU;
        return s; 
    }
}
