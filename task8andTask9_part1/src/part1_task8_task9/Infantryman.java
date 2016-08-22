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
 * Class for creating Infantryman extends for Soldier
 */
public class Infantryman extends Soldier {

    public Infantryman(String name, int power, String weapon) {
        super(name, power, weapon);
    }

    public Infantryman() {
    }
    // function Fight
    @Override
    public int Fight(int powtr) {
        powtr = powtr - 2;
        return powtr;
    }
}
