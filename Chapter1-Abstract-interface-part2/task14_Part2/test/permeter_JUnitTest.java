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
public class permeter_JUnitTest {
    
    public permeter_JUnitTest() {
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
    public void perimeter1() {
        double ex = 31.41;
        Circle C = new Circle(5);
        double ac =  C.perimeter();
        assertEquals(ex, ac, 0.01);
    }
     @Test
    public void perimeter2() {
        double ex = 37.69;
        Circle C = new Circle(6);
        double ac =  C.perimeter();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void perimeter3() {
        double ex = 25.13;
        Circle C = new Circle(4);
        double ac =  C.perimeter();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void perimeter4() {
        double ex = 18.84;
        Circle C = new Circle(3);
        double ac =  C.perimeter();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void perimeter5() {
        double ex = 12.56;
        Circle C = new Circle(2);
        double ac =  C.perimeter();
        assertEquals(ex, ac, 0.01);
    }
     @Test
    public void perimeter6() {
        double ex = 31.4;
        Circle C = new Circle(5);
        double ac =  C.perimeter();
        assertEquals(ex, ac, 0.01);
    }
     @Test
    public void perimeter7() {
        double ex = 37.6;
        Circle C = new Circle(6);
        double ac =  C.perimeter();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void perimeter8() {
        double ex = 62.82;
        Circle C = new Circle(10);
        double ac =  C.perimeter();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void perimeter9() {
        double ex = 50.24;
        Circle C = new Circle(8);
        double ac =  C.perimeter();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void perimeter10() {
        double ex = 56.53;
        Circle C = new Circle(9);
        double ac =  C.perimeter();
        assertEquals(ex, ac, 0.01);
    }
}
