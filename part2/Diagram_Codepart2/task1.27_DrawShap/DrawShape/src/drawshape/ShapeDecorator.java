/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawshape;

/**
 * @author nguyen van nhut
 * Day 5/09/2016
 * Version 1
 * Create ShapeDecorator abstract class
 */
public abstract class ShapeDecorator implements Shapes {
    protected Shapes shape;

    public ShapeDecorator(Shapes shape) {
        this.shape = shape;
    }

    public Shapes getShape() {
        return shape; 
    }

    public void setShape(Shapes shape) {
        this.shape = shape;
    }
   @Override
   public String Draw(){
       return shape.Draw();
   }
}
