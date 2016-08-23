/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task14_part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Nguyen Van Nhut
 */
public class ShapMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter type shape (1)square (2)rectangle (3)circle");
        int c = Integer.parseInt(input.readLine());
        switch (c) {
            case 1: {
                System.out.println("Enter 1 a lengh:");
                double l = Double.parseDouble(input.readLine());
                Square sq = new Square();
                sq.setLengh(l);
                System.out.println("perimeter of square:" + sq.perimeter());
                System.out.println("Area of square:" + sq.area());
                break;
            }
            case 2: {
                System.out.println("Enter 1 a lengh:");
                double l = Double.parseDouble(input.readLine());
                System.out.println("Enter 1 a wight:");
                double w = Double.parseDouble(input.readLine());
                Rectangle rc = new Rectangle();
                rc.setLen(l);
                rc.setWight(w);
                System.out.println("perimeter of Rectangle:" + rc.perimeter());
                System.out.println("Area of Rectangle:" + rc.area());
                break;
            }
            case 3: {
                System.out.println("Enter radius circle:");
                double r = Double.parseDouble(input.readLine());
                Circle ci = new Circle();
                ci.setR(r);
                System.out.println("perimeter of circle:" + ci.perimeter());
                System.out.println("Area of circle:" + ci.area());
                break;
            }
            default:
                System.out.println("please choise 1 or 2 or 3");

        }
    }

}
