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
public class Animals {
    String Name;
    String Food;

    public Animals(String Name, String Food) {
        this.Name = Name;
        this.Food = Food;
    }

    public Animals() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getFood() {
        return Food;
    }

    public void setFood(String Food) {
        this.Food = Food;
    }
    
}
