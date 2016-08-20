/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import numberingOperator.Division;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import numberingOperator.TwoNumber;

/**
 *
 *@author Nguyen Van Nhut
 * Date: 19/08/2016
 * Version:1 
 * UnitTest for divided calculation 
 * input: number1, number2 
 * output: number1 / number2
 */
public class Division_JUnitTest {
    
    public Division_JUnitTest() {
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
     public void Div1() {
        double ex = 1;
        TwoNumber number1 = new TwoNumber();
        TwoNumber number2 = new TwoNumber();
        number1.setFirstNumber(1);
        number2.setSecondNumber(1);
        Division Di = new Division();
        Di.setA(number1);
        Di.setB(number2);
        double ac = Di.divideTwoNumber();
        assertEquals(ex, ac, 0);
     }
      @Test
     public void Div2() {
        double ex = 2;
        TwoNumber number1 = new TwoNumber();
        TwoNumber number2 = new TwoNumber();
        number1.setFirstNumber(2);
        number2.setSecondNumber(1);
        Division Di = new Division();
        Di.setA(number1);
        Di.setB(number2);
        double ac = Di.divideTwoNumber();
        assertEquals(ex, ac, 0);
     }
      @Test
     public void Div3() {
        double ex = 3;
        TwoNumber number1 = new TwoNumber();
        TwoNumber number2 = new TwoNumber();
        number1.setFirstNumber(3);
        number2.setSecondNumber(1);
        Division Di = new Division();
        Di.setA(number1);
        Di.setB(number2);
        double ac = Di.divideTwoNumber();
        assertEquals(ex, ac, 0);
     }
      @Test
     public void Div4() {
        double ex = 2;
        TwoNumber number1 = new TwoNumber();
        TwoNumber number2 = new TwoNumber();
        number1.setFirstNumber(10);
        number2.setSecondNumber(5);
        Division Di = new Division();
        Di.setA(number1);
        Di.setB(number2);
        double ac = Di.divideTwoNumber();
        assertEquals(ex, ac, 0);
     }
      @Test
     public void Div5() {
        double ex = 1.5;
        TwoNumber number1 = new TwoNumber();
        TwoNumber number2 = new TwoNumber();
        number1.setFirstNumber(3);
        number2.setSecondNumber(2);
        Division Di = new Division();
        Di.setA(number1);
        Di.setB(number2);
        double ac = Di.divideTwoNumber();
        assertEquals(ex, ac, 0);
     }
      @Test
     public void Div6() {
        double ex = 2;
        TwoNumber number1 = new TwoNumber();
        TwoNumber number2 = new TwoNumber();
        number1.setFirstNumber(8);
        number2.setSecondNumber(3);
        Division Di = new Division();
        Di.setA(number1);
        Di.setB(number2);
        double ac = Di.divideTwoNumber();
        assertEquals(ex, ac, 0);
     }
      @Test
     public void Div7() {
        double ex = 1;
        TwoNumber number1 = new TwoNumber();
        TwoNumber number2 = new TwoNumber();
        number1.setFirstNumber(6);
        number2.setSecondNumber(5);
        Division Di = new Division();
        Di.setA(number1);
        Di.setB(number2);
        double ac = Di.divideTwoNumber();
        assertEquals(ex, ac, 0);
     }
      @Test
     public void Div8() {
        double ex = 0;
        TwoNumber number1 = new TwoNumber();
        TwoNumber number2 = new TwoNumber();
        number1.setFirstNumber(1);
        number2.setSecondNumber(7);
        Division Di = new Division();
        Di.setA(number1);
        Di.setB(number2);
        double ac = Di.divideTwoNumber();
        assertEquals(ex, ac, 0);
     }
      @Test
     public void Div9() {
        double ex = 2;
       TwoNumber number1 = new TwoNumber();
        TwoNumber number2 = new TwoNumber();
        number1.setFirstNumber(6);
        number2.setSecondNumber(6);
        Division Di = new Division();
        Di.setA(number1);
        Di.setB(number2);
        double ac = Di.divideTwoNumber();
        assertEquals(ex, ac, 0);
     }
      @Test
     public void Div10() {
        double ex = 0;
        TwoNumber number1 = new TwoNumber();
        TwoNumber number2 = new TwoNumber();
        number1.setFirstNumber(3);
        number2.setSecondNumber(4);
        Division Di = new Division();
        Di.setA(number1);
        Di.setB(number2);
        double ac = Di.divideTwoNumber();
        assertEquals(ex, ac, 0);
     }
}
