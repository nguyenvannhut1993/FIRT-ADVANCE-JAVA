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
public class Bird extends Animals implements IFlying, INesting, IGrowing, IRuning {

    public Bird(String Name, String Food) {
        super(Name, Food);
    }

    public Bird() {
    }

    @Override
    public void Flying() {
        System.out.println("Flying");
    }

    @Override
    public void Runing() {
        System.out.println("Runing");
    }

    @Override
    public void Growing() {
        System.out.println("No Molting");
    }

    @Override
    public void Nesting() {
        System.out.println("Live in Nest");
    }

    public void outputInfo() {
        System.out.println("Name Animail : " + Name + " -- " + "Food: " + Food);
        Flying();
        Runing();
        Growing();
        Nesting();
    }
}
