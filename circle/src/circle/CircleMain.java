/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Nguyen Van Nhut
 * Main function of Circle
 */
public class CircleMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            Points A = new Points();
            Points B = new Points();
            Circle Ci = new Circle();
            System.out.println("Please Enter a A coordinate ");
            System.out.println("Point x1:");
            int x1 = Integer.parseInt(input.readLine());
            // call set function
            A.setX(x1);
            System.out.println("Point y1:");
            int y1 = Integer.parseInt(input.readLine());
            A.setY(y1);
            System.out.println("Please Enter a B coordinate ");
            System.out.println("Point x2:");
            int x2 = Integer.parseInt(input.readLine());
            B.setX(x2);
            System.out.println("Point y2:");
            int y2 = Integer.parseInt(input.readLine());
            B.setY(y2);
            Ci.setA(A);
            Ci.setB(B);
            double C = Ci.caculateCircumference();
            System.out.println(" Circumference of circle is: " + String.format("%.2f", C));
            double S = Ci.caculateArea();
            System.out.println("Area of circle is:" + String.format("%.2f", S));
        } catch (NumberFormatException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
}
