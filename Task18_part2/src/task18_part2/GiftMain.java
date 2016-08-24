/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task18_part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hv
 */
public class GiftMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter type Shape Box");
        String sh = input.readLine();
        System.out.println("enter type color box");
        String cb = input.readLine();
        System.out.println("enter name gift");
        String ng = input.readLine();
        System.out.println("Enter weight:");
        double w = Double.parseDouble(input.readLine());
        GiftBox G = new GiftBox(sh, cb);
        GiftBox.Gift inner = G.new Gift(ng, w);
        System.out.println("type Shap box:" + sh);
        System.out.println("Color:" + cb);
        System.out.println("Name Gift:" + ng);
        System.out.println("Weight:" + w);
        System.out.println("Fee must pay for making box and fee gift:" + inner.calFee());
    }

}
