/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import pointDistance.Points;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pointDistance.Distance;

/**
 *
 * @author Nguyen Van Nhut 
 * Date: 19/08/2016 
 * Version:1 
 * UnitTest for point distance
 * input: A(x1,y1), B(x2,y2)
 * output:Distance = Math.sqrt(((this.x-B.x)*(this.x -B.x))+((this.y-B.y)*(this.y-B.y)));
 */
public class pointDistance_JUnitTest {
    
    public pointDistance_JUnitTest() {
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
     public void Dis1() {
         double ex = 1.41;
         Points A = new Points();
         Points B = new Points();
         Distance D = new Distance();
         A.setX(1);
         A.setY(3);
         B.setX(2);
         B.setY(4);
         double ac = D.calculateDistance(A,B);
         assertEquals(ex, ac, 0.01);
     }
     @Test
     public void Dis2() {
         double ex = 1;
         Points A = new Points();
         Points B = new Points();
         Distance D = new Distance();
         A.setX(2);
         A.setY(3);
         B.setX(2);
         B.setY(2);
         double ac = D.calculateDistance(A,B);
         assertEquals(ex, ac, 0.01);
     }
     @Test
     public void Dis3() {
         double ex = 2.82;
         Points A = new Points();
         Points B = new Points();
         Distance D = new Distance();
         A.setX(5);
         A.setY(7);
         B.setX(3);
         B.setY(5);
         double ac = D.calculateDistance(A,B);
         assertEquals(ex, ac, 0.01);
     }
     @Test
     public void Dis4() {
         double ex = 2.23;
         Points A = new Points();
         Points B = new Points();
         Distance D = new Distance();
         A.setX(1);
         A.setY(5);
         B.setX(3);
         B.setY(6);
         double ac = D.calculateDistance(A,B);
         assertEquals(ex, ac, 0.01);
     }
      @Test
     public void Dis5() {
         double ex = 7.61;
         Points A = new Points();
         Points B = new Points();
         Distance D = new Distance();
         A.setX(3);
         A.setY(2);
         B.setX(10);
         B.setY(5);
         double ac = D.calculateDistance(A,B);
         assertEquals(ex, ac, 0.01);
     }
     @Test
     public void Dis6() {
         double ex = 4.45;
         Points A = new Points();
         Points B = new Points();
         Distance D = new Distance();
         A.setX(3);
         A.setY(2);
         B.setX(10);
         B.setY(5);
         double ac = D.calculateDistance(A,B);
         assertEquals(ex, ac, 0.01);
     }
     @Test
     public void Dis7() {
         double ex = 7.4;
         Points A = new Points();
         Points B = new Points();
         Distance D = new Distance();
         A.setX(3);
         A.setY(2);
         B.setX(10);
         B.setY(5);
         double ac = D.calculateDistance(A,B);
         assertEquals(ex, ac, 0.01);
     }
     @Test
     public void Dis8() {
         double ex = 2.32;
         Points A = new Points();
         Points B = new Points();
         Distance D = new Distance();
         A.setX(1);
         A.setY(5);
         B.setX(3);
         B.setY(6);
         double ac = D.calculateDistance(A,B);
         assertEquals(ex, ac, 0.01);
     }
     @Test
     public void Dis9() {
         double ex = 3.4;
         Points A = new Points();
         Points B = new Points();
         Distance D = new Distance();
         A.setX(1);
         A.setY(4);
         B.setX(3);
         B.setY(1);
         double ac = D.calculateDistance(A,B);
         assertEquals(ex, ac, 0.01);
     }
     @Test
     public void Dis10() {
         double ex = 4.51;
         Points A = new Points();
         Points B = new Points();
         Distance D = new Distance();
         A.setX(3);
         A.setY(2);
         B.setX(6);
         B.setY(5);
         double ac = D.calculateDistance(A,B);
         assertEquals(ex, ac, 0.01);
     }
}
