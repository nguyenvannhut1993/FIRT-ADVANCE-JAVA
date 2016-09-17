/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1.pkg30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Nguyen Van Nhut
 */
public class ShapMain {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        ShapFactory shapfactory = new ShapFactory();
        System.out.println(" ENTER CIRCLE /RECTANGLE /SQUARE");
        String type = input.readLine();
        interfaceShape shape = shapfactory.getShape(type);
        shape.draw();
    }

}
