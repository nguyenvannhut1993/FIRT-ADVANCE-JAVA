/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawshape;

/**
 *
 * @author nguyen van nhut
 * Day 5/09/2016
 * Version 1
 * Create RedShapeDecorator class
 */
public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shapes shape) {
        super(shape);
    }
    @Override
    public String Draw()
    {
        return this.shape.Draw()+ "and"+ setRedBorder(shape) ;
        
    }
    private String setRedBorder(Shapes shape)
    {
        return "Border Color:Red";
    }
}
