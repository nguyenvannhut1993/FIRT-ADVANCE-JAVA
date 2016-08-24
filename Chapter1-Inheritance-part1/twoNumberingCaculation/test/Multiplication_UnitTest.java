/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import numberingOperator.Division;
import numberingOperator.Multiplication;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import numberingOperator.TwoNumber;

/**
 *
@author Nguyen Van Nhut
 * Date: 19/08/2016
 * Version:1 
 * UnitTest for multiplicative calculation 
 * input: number1, number2 
 * output: number1 * number2
 */
public class Multiplication_UnitTest {
    
    public Multiplication_UnitTest() {
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
     public void Mul1() {
        double ex = 1;
        TwoNumber number1 = new TwoNumber();
        TwoNumber number2 = new TwoNumber();
        number1.setFirstNumber(1);
        number2.setSecondNumber(1);
        Multiplication Di = new Multiplication();
        Di.setA(number1);
        Di.setB(number2);
        double ac = Di.multiplyTwoNumber();
        assertEquals(ex, ac, 0);
     }
      @Test
     public void Mul2() {
        double ex = 2;
        TwoNumber number1 = new TwoNumber();
        TwoNumber number2 = new TwoNumber();
        number1.setFirstNumber(2);
        number2.setSecondNumber(1);
        Multiplication Di = new Multiplication();
        Di.setA(number1);
        Di.setB(number2);
        double ac = Di.multiplyTwoNumber();
        assertEquals(ex, ac, 0);
     }
      @Test
     public void Mul3() {
        double ex = 3;
        TwoNumber number1 = new TwoNumber();
        TwoNumber number2 = new TwoNumber();
        number1.setFirstNumber(3);
        number2.setSecondNumber(1);
        Multiplication Di = new Multiplication();
        Di.setA(number1);
        Di.setB(number2);
       double ac = Di.multiplyTwoNumber();
        assertEquals(ex, ac, 0);
     }
      @Test
     public void Mul4() {
        double ex = 50;
        TwoNumber number1 = new TwoNumber();
        TwoNumber number2 = new TwoNumber();
        number1.setFirstNumber(10);
        number2.setSecondNumber(5);
        Multiplication Di = new Multiplication();
        Di.setA(number1);
        Di.setB(number2);
        double ac = Di.multiplyTwoNumber();
        assertEquals(ex, ac, 0);
     }
      @Test
     public void Mul5() {
        double ex = 6;
        TwoNumber number1 = new TwoNumber();
        TwoNumber number2 = new TwoNumber();
        number1.setFirstNumber(3);
        number2.setSecondNumber(2);
        Multiplication Di = new Multiplication();
        Di.setA(number1);
        Di.setB(number2);
        double ac = Di.multiplyTwoNumber();
        assertEquals(ex, ac, 0);
     }
      @Test
     public void Mul6() {
        double ex = 2;
        TwoNumber number1 = new TwoNumber();
        TwoNumber number2 = new TwoNumber();
        number1.setFirstNumber(8);
        number2.setSecondNumber(3);
        Multiplication Di = new Multiplication();
        Di.setA(number1);
        Di.setB(number2);
        double ac = Di.multiplyTwoNumber();
        assertEquals(ex, ac, 0);
     }
      @Test
     public void Mul7() {
        double ex = 1;
        TwoNumber number1 = new TwoNumber();
        TwoNumber number2 = new TwoNumber();
        number1.setFirstNumber(6);
        number2.setSecondNumber(5);
        Multiplication Di = new Multiplication();
        Di.setA(number1);
        Di.setB(number2);
        double ac = Di.multiplyTwoNumber();
        assertEquals(ex, ac, 0);
     }
      @Test
     public void Mul8() {
        double ex = 0;
        TwoNumber number1 = new TwoNumber();
        TwoNumber number2 = new TwoNumber();
        number1.setFirstNumber(1);
        number2.setSecondNumber(7);
        Multiplication Di = new Multiplication();
        Di.setA(number1);
        Di.setB(number2);
       double ac = Di.multiplyTwoNumber();
        assertEquals(ex, ac, 0);
     }
      @Test
     public void Mul9() {
        double ex = 2;
       TwoNumber number1 = new TwoNumber();
        TwoNumber number2 = new TwoNumber();
        number1.setFirstNumber(6);
        number2.setSecondNumber(6);
        Multiplication Di = new Multiplication();
        Di.setA(number1);
        Di.setB(number2);
        double ac = Di.multiplyTwoNumber();
        assertEquals(ex, ac, 0);
     }
      @Test
     public void Mul10() {
        double ex = 0;
        TwoNumber number1 = new TwoNumber();
        TwoNumber number2 = new TwoNumber();
        number1.setFirstNumber(3);
        number2.setSecondNumber(4);
        Multiplication Di = new Multiplication();
        Di.setA(number1);
        Di.setB(number2);
        double ac = Di.multiplyTwoNumber();
        assertEquals(ex, ac, 0);
     }
}
