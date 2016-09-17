/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task17_part2;

/**
 *
 * @author nguyen van nhut
 * Day 23/08/2016
 * version 1
 * class for building Lion class extends from animal class
 */
public class Lion extends Animals implements IRuning, IGrowing, IBurrowing, ISwimming {

    public Lion(String Name, String Food) {
        super(Name, Food);
    }

    public Lion() {
    }

    @Override
    public void Runing() {
        System.out.println("Running");
    }

    @Override
    public void Swimming() {
        System.out.println("Swiming");
    }

    @Override
    public void Growing() {
        System.out.println("No molting");
    }

    @Override
    public void Burrowing() {
        System.out.println("Live in Nest");
    }

    public void outputInfo() {
        System.out.println("Name Animail : " + Name + " -- " + "Food: " + Food);
        Swimming();
        Runing();
        Growing();
        Burrowing();
    }
}
