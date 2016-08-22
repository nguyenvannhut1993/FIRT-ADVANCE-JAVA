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
 * Version 1 
 * Class for creating Supper class
 */
public class Soldier {

    String name;
    int power;
    String weapon;

    public Soldier(String name, int power, String weapon) {
        this.name = name;
        this.power = power;
        this.weapon = weapon;
    }

    public Soldier() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
    // function fight 
    public int Fight(int potr) {
        potr = potr - 1;
        return potr;
    }
    // function Show to show all information of Soldier
    public void Shows(String name, int power, String weapon) {
        System.out.println("Name:" + name + "--" + " Power:" + power + "--"
                + " weapon:" + weapon);
    }
}
