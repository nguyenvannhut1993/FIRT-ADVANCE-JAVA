/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task17_part2;

/**
 *
 * @author Nguyen Van Nhut
 */
public class Fish extends Animals implements ISwimming, IGrowing, IInWater {

    public Fish(String Name, String Food) {
        super(Name, Food);
    }

    public Fish() {
    }

    @Override
    public void Swimming() {
        System.out.println("Swimming");
    }

    @Override
    public void inWater() {
        System.out.println("Live in water");
    }

    @Override
    public void Growing() {
        System.out.println("No molting");
    }

    public void outputInfo() {
        System.out.println("Name Animail : " + Name + " -- " + "Food: " + Food);
        Swimming();
        Growing();
        inWater();
    }
}
