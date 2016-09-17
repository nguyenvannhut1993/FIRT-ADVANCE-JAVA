package drawshape;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Nguyen van nhut
 */
public class DrawShape {

    public static void main(String[] args) throws IOException {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Choice Shape: 1(Circle) or 2(Rectangle)");
            int choice = Integer.parseInt(input.readLine());
            System.out.println("do you want to decorate shape [y/n]?");
            String yn = input.readLine();
            Shapes circle = new Circles();
            Shapes rectangle = new Rectangles();
            if (choice == 1 && yn.equalsIgnoreCase("n")) {
                System.out.println("Circle with normal border");
                System.out.println(circle.Draw());
            } else if (choice == 1 && yn.equalsIgnoreCase("y")) {
                System.out.println("Circle of Red border");
                Shapes redCircle = new RedShapeDecorator(circle);
                System.out.println(redCircle.Draw());
            } else if (choice == 2 && yn.equalsIgnoreCase("n")) {
                System.out.println("Rectangle with normal border");
                System.out.println(rectangle.Draw());
            } else if (choice == 2 && yn.equalsIgnoreCase("y")) {
                System.out.println("Rectangle of Red border");
                Shapes redRectangle = new RedShapeDecorator(rectangle);
                System.out.println(redRectangle.Draw());
            } else {
                System.out.println("Please choice correctly:");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
}
