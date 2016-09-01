/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1.pkg30;

/**
 *
 * @author Nguyen Van Nhut
 */
public class ShapFactory {

    public interfaceShape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circles();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangles();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Squares();
        }
        return null;
    }
}
