/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import rectangle.Points;
import rectangle.Regtangless;

/**
 *
 * @author Nguyen Van Nhut
 * Date: 19/08/2016
 * Version:1 
 * UnitTest for divided calculation 
 * input: Point A, Point B 
 * output: C = ((B.x - A.x)+(B.y - A.y))*2;
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
    public void Cicumference1() {
        double ex = 8;
        Points A = new Points();
        Points B = new Points();
        Regtangless C = new Regtangless();
        A.setX(1);
        A.setY(1);
        B.setX(3);
        B.setY(3);
        C.setA(A);
        C.setB(B);
        double ac = C.excuteCircumference();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void Cicumference2() {
        double ex = 16;
        Points A = new Points();
        Points B = new Points();
        Regtangless C = new Regtangless();
        A.setX(1);
        A.setY(3);
        B.setX(5);
        B.setY(7);
        C.setA(A);
        C.setB(B);
        double ac = C.excuteCircumference();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void Cicumference3() {
         double ex = 6;
        Points A = new Points();
        Points B = new Points();
        Regtangless C = new Regtangless();
        A.setX(1);
        A.setY(2);
        B.setX(3);
        B.setY(3);
        C.setA(A);
        C.setB(B);
        double ac = C.excuteCircumference();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void Cicumference4() {
         double ex = 10;
        Points A = new Points();
        Points B = new Points();
        Regtangless C = new Regtangless();
        A.setX(4);
        A.setY(8);
        B.setX(5);
        B.setY(12);
        C.setA(A);
        C.setB(B);
        double ac = C.excuteCircumference();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void Cicumference5() {
         double ex = 18;
        Points A = new Points();
        Points B = new Points();
        Regtangless C = new Regtangless();
        A.setX(1);
        A.setY(1);
        B.setX(6);
        B.setY(5);
        C.setA(A);
        C.setB(B);
        double ac = C.excuteCircumference();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void Cicumference6() {
        double ex = 15;
        Points A = new Points();
        Points B = new Points();
        Regtangless C = new Regtangless();
        A.setX(1);
        A.setY(2);
        B.setX(5);
        B.setY(6);
        C.setA(A);
        C.setB(B);
        double ac = C.excuteCircumference();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void Cicumference7() {
         double ex = 3;
        Points A = new Points();
        Points B = new Points();
        Regtangless C = new Regtangless();
        A.setX(1);
        A.setY(3);
        B.setX(2);
        B.setY(4);
        C.setA(A);
        C.setB(B);
        double ac = C.excuteCircumference();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void Cicumference8() {
         double ex = 7;
        Points A = new Points();
        Points B = new Points();
        Regtangless C = new Regtangless();
        A.setX(1);
        A.setY(4);
        B.setX(2);
        B.setY(5);
        C.setA(A);
        C.setB(B);
        double ac = C.excuteCircumference();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void Cicumference9() {
         double ex = 7;
        Points A = new Points();
        Points B = new Points();
        Regtangless C = new Regtangless();
        A.setX(5);
        A.setY(6);
        B.setX(7);
        B.setY(8);
        C.setA(A);
        C.setB(B);
        double ac = C.excuteCircumference();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void Cicumference10() {
         double ex = 3;
        Points A = new Points();
        Points B = new Points();
        Regtangless C = new Regtangless();
        A.setX(1);
        A.setY(1);
        B.setX(3);
        B.setY(2);
        C.setA(A);
        C.setB(B);
        double ac = C.excuteCircumference();
        assertEquals(ex, ac, 0.01);
    }
}
