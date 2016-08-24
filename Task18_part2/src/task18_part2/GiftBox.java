/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task18_part2;

/**
 *
 * @author hv
 */
public class GiftBox {
    public String Shaps;
    public String Colors;
    final int price = 10000;

    public GiftBox(String Shaps, String Colors) {
        this.Shaps = Shaps;
        this.Colors = Colors;
    }
    class Gift{
        public String name;
        public Double wight;
        final int FEE = 200;

        public Gift(String name, Double wight) {
            this.name = name;
            this.wight = wight;
        }
        public double calFee()
        {
            return wight*FEE+GiftBox.this.price;
        }
    }
}
