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
import task14_part2.Circle;

/**
 *
 * @author Nguyen Van Nhut
 * Day 23/08/2016
 * version 1
 * test for perimeter and area
 * input radius
 */
public class area_JUnitTest {
    
    public area_JUnitTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void area1() {
        double ex = 25;
        Circle C = new Circle(5);
        double ac =  C.area();
        assertEquals(ex, ac, 0.01);
    }
     @Test
    public void area2() {
        double ex = 36;
        Circle C = new Circle(6);
        double ac =  C.area();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void area3() {
        double ex = 16;
        Circle C = new Circle(4);
        double ac =  C.area();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void area4() {
        double ex = 16;
        Circle C = new Circle(4);
        double ac =  C.area();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void area5() {
        double ex = 4;
        Circle C = new Circle(2);
        double ac =  C.area();
        assertEquals(ex, ac, 0.01);
    }
     @Test
    public void area6() {
        double ex = 24;
        Circle C = new Circle(5);
        double ac =  C.area();
        assertEquals(ex, ac, 0.01);
    }
     @Test
    public void area7() {
        double ex = 35;
        Circle C = new Circle(6);
        double ac =  C.area();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void area8() {
        double ex = 90;
        Circle C = new Circle(10);
        double ac =  C.area();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void area9() {
        double ex = 63;
        Circle C = new Circle(8);
        double ac =  C.area();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void area10() {
        double ex = 80;
        Circle C = new Circle(9);
        double ac =  C.area();
        assertEquals(ex, ac, 0.01);
    }
}
