/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import numberingOperator.Multiplication;
import numberingOperator.Subtraction;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import numberingOperator.TwoNumber;

/**
 *
 * @author Nguyen Van Nhut Date: 19/08/2016 Version:1 UnitTest for subtractive
 * calculation input: number1, number2 output: number1 - number2
 */
public class Subtraction_UnitTest {

    public Subtraction_UnitTest() {
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
    public void Sub1() {
        double ex = 0;
        TwoNumber number1 = new TwoNumber();
        TwoNumber number2 = new TwoNumber();
        number1.setFirstNumber(1);
        number2.setSecondNumber(1);
        Subtraction Di = new Subtraction();
        Di.setA(number1);
        Di.setB(number2);
        double ac = Di.subtractTwoNumber();
        assertEquals(ex,ac , 0);
    }

    @Test
    public void Sub2() {
        double ex = 1;
        TwoNumber number1 = new TwoNumber();
        TwoNumber number2 = new TwoNumber();
        number1.setFirstNumber(2);
        number2.setSecondNumber(1);
        Subtraction Di = new Subtraction();
        Di.setA(number1);
        Di.setB(number2);
        double ac = Di.subtractTwoNumber();
        assertEquals(ex, ac, 0);
    }

    @Test
    public void Sub3() {
        double ex = 2;
        TwoNumber number1 = new TwoNumber();
        TwoNumber number2 = new TwoNumber();
        number1.setFirstNumber(3);
        number2.setSecondNumber(1);
        Subtraction Di = new Subtraction();
        Di.setA(number1);
        Di.setB(number2);
        double ac = Di.subtractTwoNumber();
        assertEquals(ex, ac, 0);
    }

    @Test
    public void Sub4() {
        double ex = 5;
        TwoNumber number1 = new TwoNumber();
        TwoNumber number2 = new TwoNumber();
        number1.setFirstNumber(10);
        number2.setSecondNumber(5);
       Subtraction Di = new Subtraction();
        Di.setA(number1);
        Di.setB(number2);
        double ac = Di.subtractTwoNumber();
        assertEquals(ex, ac, 0);
    }

    @Test
    public void Sub5() {
        double ex = 1;
        TwoNumber number1 = new TwoNumber();
        TwoNumber number2 = new TwoNumber();
        number1.setFirstNumber(3);
        number2.setSecondNumber(2);
       Subtraction Di = new Subtraction();
        Di.setA(number1);
        Di.setB(number2);
        double ac = Di.subtractTwoNumber();
        assertEquals(ex, ac, 0);
    }

    @Test
    public void Sub6() {
        double ex = 4;
        TwoNumber number1 = new TwoNumber();
        TwoNumber number2 = new TwoNumber();
        number1.setFirstNumber(8);
        number2.setSecondNumber(3);
        Subtraction Di = new Subtraction();
        Di.setA(number1);
        Di.setB(number2);
        double ac = Di.subtractTwoNumber();
        assertEquals(ex, ac, 0);
    }

    @Test
    public void Sub7() {
        double ex = 0;
        TwoNumber number1 = new TwoNumber();
        TwoNumber number2 = new TwoNumber();
        number1.setFirstNumber(6);
        number2.setSecondNumber(5);
        Subtraction Di = new Subtraction();
        Di.setA(number1);
        Di.setB(number2);
        double ac = Di.subtractTwoNumber();
        assertEquals(ex, ac, 0);
    }

    @Test
    public void Sub8() {
        double ex = -5;
        TwoNumber number1 = new TwoNumber();
        TwoNumber number2 = new TwoNumber();
        number1.setFirstNumber(1);
        number2.setSecondNumber(7);
        Subtraction Di = new Subtraction();
        Di.setA(number1);
        Di.setB(number2);
        double ac = Di.subtractTwoNumber();
        assertEquals(ex, ac, 0);
    }

    @Test
    public void Sub9() {
        double ex = 1;
        TwoNumber number1 = new TwoNumber();
        TwoNumber number2 = new TwoNumber();
        number1.setFirstNumber(6);
        number2.setSecondNumber(6);
        Subtraction Di = new Subtraction();
        Di.setA(number1);
        Di.setB(number2);
        double ac = Di.subtractTwoNumber();
        assertEquals(ex, ac, 0);
    }

    @Test
    public void Sub10() {
        double ex = 0;
        TwoNumber number1 = new TwoNumber();
        TwoNumber number2 = new TwoNumber();
        number1.setFirstNumber(3);
        number2.setSecondNumber(4);
        Subtraction Di = new Subtraction();
        Di.setA(number1);
        Di.setB(number2);
        double ac = Di.subtractTwoNumber();
        assertEquals(ex, ac, 0);
    }
}
