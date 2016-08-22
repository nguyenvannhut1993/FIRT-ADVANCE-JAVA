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
 * Class for creating Trooper extends for Soldier
 */
public class Trooper extends Soldier {

    public Trooper(String name, int power, String weapon) {
        super(name, power, weapon);
    }

    public Trooper() {
    }

    @Override
    public int Fight(int powtr) {
        powtr = powtr - 3;
        return powtr;
    }

}
