/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import circle.Circle;
import circle.Points;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nguyen Van Nhut
 * Date: 19/08/2016
 * Version:1 
 * UnitTest for divided calculation 
 * input: Point A, Point B 
 * output: C = PI*2*(D.calculateDistance(A,B));
 */
public class Circumference_JUnitTest {
    
    public Circumference_JUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void Cricumference() {
        double ex = 19.86;
        Points O = new Points();
        Points R = new Points();
        Circle C = new Circle();
        O.setX(1);
        O.setY(1);
        R.setX(2);
        R.setY(4);
        C.setA(O);
        C.setB(R);
        double ac = C.caculateCircumference();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void Cricumference2() {
        double ex = 31.40;
        Points O = new Points();
        Points R = new Points();
        Circle C = new Circle();
        O.setX(2);
        O.setY(3);
        R.setX(5);
        R.setY(7);
        C.setA(O);
        C.setB(R);
        double ac = C.caculateCircumference();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void Cricumference3() {
        double ex = 28.09;
        Points O = new Points();
        Points R = new Points();
        Circle C = new Circle();
        O.setX(1);
        O.setY(2);
        R.setX(5);
        R.setY(4);
        C.setA(O);
        C.setB(R);
        double ac = C.caculateCircumference();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void Cricumference4() {
        double ex = 28.09;
        Points O = new Points();
        Points R = new Points();
        Circle C = new Circle();
        O.setX(0);
        O.setY(1);
        R.setX(4);
        R.setY(3);
        C.setA(O);
        C.setB(R);
        double ac = C.caculateCircumference();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void Cricumference5() {
        double ex = 40.21;
        Points O = new Points();
        Points R = new Points();
        Circle C = new Circle();
        O.setX(1);
        O.setY(1);
        R.setX(5);
        R.setY(6);
        C.setA(O);
        C.setB(R);
        double ac = C.caculateCircumference();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void Cricumference6() {
        double ex = 22.54;
        Points O = new Points();
        Points R = new Points();
        Circle C = new Circle();
        O.setX(0);
        O.setY(0);
        R.setX(2);
        R.setY(3);
        C.setA(O);
        C.setB(R);
        double ac = C.caculateCircumference();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void Cricumference7() {
        double ex = 8.86;
        Points O = new Points();
        Points R = new Points();
        Circle C = new Circle();
        O.setX(1);
        O.setY(1);
        R.setX(2);
        R.setY(2);
        C.setA(O);
        C.setB(R);
        double ac = C.caculateCircumference();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void Cricumference8() {
        double ex = 22.62;
        Points O = new Points();
        Points R = new Points();
        Circle C = new Circle();
        O.setX(1);
        O.setY(5);
        R.setX(4);
        R.setY(3);
        C.setA(O);
        C.setB(R);
        double ac = C.caculateCircumference();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void Cricumference9() {
        double ex = 19.84;
        Points O = new Points();
        Points R = new Points();
        Circle C = new Circle();
        O.setX(1);
        O.setY(1);
        R.setX(2);
        R.setY(4);
        C.setA(O);
        C.setB(R);
       double ac = C.caculateCircumference();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void Cricumference10() {
        double ex = 32.00;
        Points O = new Points();
        Points R = new Points();
        Circle C = new Circle();
        O.setX(1);
        O.setY(3);
        R.setX(6);
        R.setY(4);
        C.setA(O);
        C.setB(R);
        double ac = C.caculateCircumference();
        assertEquals(ex, ac, 0.01);
    }
}
