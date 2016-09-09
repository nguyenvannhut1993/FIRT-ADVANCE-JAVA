package task3.pkg3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/**
 *
 * @author Nguyen Van Nhut 
 * Day 9/09/2016 
 * Version 1 
 * class for creating Main class to calculate area all shapes input radian, width, length
 */
public class ShapeMain {

    public static void main(String[] args) throws IOException {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter Radian:");
            double radian = Double.parseDouble(input.readLine());
            Area circle = (double x1, double x2) -> x1 * Math.pow(x2, 2);
            System.out.println("=====CIRCLE=====");
            System.out.println("S = PI * (r * r) = " + circle.calArea(Math.PI, radian));
            System.out.println("Enter lenght: ");
            double L = Double.parseDouble(input.readLine());
            System.out.println("Enter width: ");
            double W = Double.parseDouble(input.readLine());
            Area rectangle = (double x1, double x2) -> x1 * x2;
            System.out.println("=====RECTANGLE=====");
            System.out.println("S = W x L = " + rectangle.calArea(W, L));
            System.out.println("Enter lenght 1 conner square: ");
            double sq = Double.parseDouble(input.readLine());
            Area square = (double x1, double x2) -> x1 * x2;
            System.out.println("=====SQƯARE=====");
            System.out.println("S = A x A = " + square.calArea(sq, sq));
        } catch (NumberFormatException e) {
            System.out.println("Error:" + e.getMessage());
        }

    }
}
