/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task17_part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author nguyen van nhut
 * Day 23/08/2016
 * version 1
 * class for building main class
 */
public class AnimalsMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try {
            String yn = "";
            String na;
            String fo;
            Bird b[] = new Bird[100];
            Fish f[] = new Fish[100];
            Boa boa[] = new Boa[100];
            Lion li[] = new Lion[100];
            ManagerAnimal lists = new ManagerAnimal(f, b, boa, li);
            do {
                BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter name animal:");
                na = input.readLine();
                System.out.println("Enter food:");
                fo = input.readLine();
                System.out.println("choice animals (1)fish (2)Bird (3)Lion (4)Boa");
                int choice = Integer.parseInt(input.readLine());
                switch (choice) {
                    case 1: {
                        Fish a = new Fish(na, fo);
                        lists.addAnimalFish(a);
                        lists.showFish();
                        break;
                    }
                    case 2: {
                        Bird bi = new Bird(na, fo);
                        lists.addAnimalBird(bi);
                        lists.showBird();
                        break;
                    }
                    case 3: {
                        Boa c = new Boa(na, fo);
                        lists.addAnimalBoa(c);
                        lists.showBoa();
                        break;
                    }
                    case 4: {
                        Lion l = new Lion(na, fo);
                        lists.addAnimalLion(l);
                        lists.showLion();
                        break;
                    }

                }
                System.out.println("do you want add animal?[y/n]");
                yn = input.readLine();
            } while (yn.equalsIgnoreCase("y"));
            lists.showBird();
            lists.showFish();
            lists.showBoa();
            lists.showLion();
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
}
