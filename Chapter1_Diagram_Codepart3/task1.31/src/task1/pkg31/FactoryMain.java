/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1.pkg31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/**
 *
 * @author nguyen van nhut
 */
public class FactoryMain {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("please choice 1/Tradition 2/Stylized 3/chinese dress");
        int choice = Integer.parseInt(input.readLine());
        if (choice == 1) {
            IFactory t = new CreateFactoryTradition().getStyleTra("tradition");
            t.sewing();
        } else if (choice == 2) {
            IFactory s = new CreateFactoryStyle().getStyleStylized("Style");
            s.sewing();
        } else {
            IFactory c = new CreateFactoryChinese().getStyleChinese("chinese");
            c.sewing();
        }
    }

}
