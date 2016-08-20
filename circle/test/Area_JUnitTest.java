/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import circle.Circle;
import circle.Distance;
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
 * output: S = PI*(D.calculateDistance(A,B)*D.calculateDistance(A,B));
 */
public class Area_JUnitTest {
    
    public Area_JUnitTest() {
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
    public void Area1() {
        double ex = 31.41;
        Points O = new Points();
        Points R = new Points();
        Circle C = new Circle();
        O.setX(1);
        O.setY(1);
        R.setX(2);
        R.setY(4);
        C.setA(O);
        C.setB(R);
        double ac = C.caculateArea();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void Area2() {
        double ex = 78.50;
        Points O = new Points();
        Points R = new Points();
        Circle C = new Circle();
        O.setX(2);
        O.setY(3);
        R.setX(5);
        R.setY(7);
        C.setA(O);
        C.setB(R);
        double ac = C.caculateArea();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void Area3() {
        double ex = 62.80;
        Points O = new Points();
        Points R = new Points();
        Circle C = new Circle();
        O.setX(1);
        O.setY(2);
        R.setX(5);
        R.setY(4);
        C.setA(O);
        C.setB(R);
        double ac = C.caculateArea();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void Area4() {
        double ex = 62.80;
        Points O = new Points();
        Points R = new Points();
        Circle C = new Circle();
        O.setX(0);
        O.setY(1);
        R.setX(4);
        R.setY(3);
        C.setA(O);
        C.setB(R);
        double ac = C.caculateArea();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void Area5() {
        double ex = 128.74;
        Points O = new Points();
        Points R = new Points();
        Circle C = new Circle();
        O.setX(1);
        O.setY(1);
        R.setX(5);
        R.setY(6);
        C.setA(O);
        C.setB(R);
        double ac = C.caculateArea();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void Area6() {
        double ex = 40.84;
        Points O = new Points();
        Points R = new Points();
        Circle C = new Circle();
        O.setX(0);
        O.setY(0);
        R.setX(2);
        R.setY(3);
        C.setA(O);
        C.setB(R);
        double ac = C.caculateArea();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void Area7() {
        double ex = 6.26;
        Points O = new Points();
        Points R = new Points();
        Circle C = new Circle();
        O.setX(1);
        O.setY(1);
        R.setX(2);
        R.setY(2);
        C.setA(O);
        C.setB(R);
        double ac = C.caculateArea();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void Area8() {
        double ex = 56.54;
        Points O = new Points();
        Points R = new Points();
        Circle C = new Circle();
        O.setX(1);
        O.setY(5);
        R.setX(4);
        R.setY(2);
        C.setA(O);
        C.setB(R);
        double ac = C.caculateArea();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void Area9() {
        double ex = 30.41;
        Points O = new Points();
        Points R = new Points();
        Circle C = new Circle();
        O.setX(1);
        O.setY(1);
        R.setX(2);
        R.setY(4);
        C.setA(O);
        C.setB(R);
        double ac = C.caculateArea();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void Area10() {
        double ex = 81.66;
        Points O = new Points();
        Points R = new Points();
        Circle C = new Circle();
        O.setX(1);
        O.setY(3);
        R.setX(6);
        R.setY(4);
        C.setA(O);
        C.setB(R);
        double ac = C.caculateArea();
        assertEquals(ex, ac, 0.01);
    }
}
