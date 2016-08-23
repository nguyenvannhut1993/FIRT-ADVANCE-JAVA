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
public class Boa extends Animals implements ISwimming, IRuning, IGrowing, INesting {

    public Boa(String Name, String Food) {
        super(Name, Food);
    }

    public Boa() {
    }

    @Override
    public void Swimming() {
        System.out.println("Swimming");
    }

    @Override
    public void Runing() {
        System.out.println("Running");
    }

    @Override
    public void Growing() {
        System.out.println("Molting");
    }

    @Override
    public void Nesting() {
        System.out.println("Live in Nest");
    }

    public void outputInfo() {
        System.out.println("Name Animail : " + Name + " -- " + "Food: " + Food);
        Swimming();
        Runing();
        Growing();
        Nesting();
    }
}
