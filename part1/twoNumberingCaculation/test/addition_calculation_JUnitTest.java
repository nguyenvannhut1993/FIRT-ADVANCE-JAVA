/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import numberingOperator.Addition;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import numberingOperator.TwoNumber;
import numberingOperator.NumberingOperatorMain;
import numberingOperator.Subtraction;

/**
 *
 * @author Nguyen Van Nhut 
 * Date: 19/08/2016 
 * Version:1 
 * UnitTest for two numbering calculation
 * input: number1, number2 
 * output: number1 + number2
 */
public class addition_calculation_JUnitTest {
    // twonumberingCaculationMain number; 

    public addition_calculation_JUnitTest() {
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
    public void Add1() {
        double ex = 2;
        TwoNumber number1 = new TwoNumber();
        TwoNumber number2 = new TwoNumber();
        number1.setFirstNumber(1);
        number2.setSecondNumber(1);
        Addition Di = new Addition();
        Di.setA(number1);
        Di.setB(number2);
        double ac = Di.addTwoNumber();
        assertEquals(ex, ac, 0);
    }

    @Test
    public void Add2() {
        double ex = 3;
        TwoNumber number1 = new TwoNumber();
        TwoNumber number2 = new TwoNumber();
        number1.setFirstNumber(2);
        number2.setSecondNumber(1);
        Addition Di = new Addition();
        Di.setA(number1);
        Di.setB(number2);
        double ac = Di.addTwoNumber();
        assertEquals(ex, ac, 0);
    }

    @Test
    public void Add3() {
        double ex = 4;
        TwoNumber number1 = new TwoNumber();
        TwoNumber number2 = new TwoNumber();
        number1.setFirstNumber(3);
        number2.setSecondNumber(1);
        Addition Di = new Addition();
        Di.setA(number1);
        Di.setB(number2);
        double ac = Di.addTwoNumber();
        assertEquals(ex, ac, 0);
    }

    @Test
    public void Add4() {
        double ax = 15;
        TwoNumber number1 = new TwoNumber();
        TwoNumber number2 = new TwoNumber();
        number1.setFirstNumber(10);
        number2.setSecondNumber(5);
        Addition Di = new Addition();
        Di.setA(number1);
        Di.setB(number2);
        double ex = Di.addTwoNumber();
        assertEquals(ex, ax, 0);
    }

    @Test
    public void Add5() {
        double ex = 5;
        TwoNumber number1 = new TwoNumber();
        TwoNumber number2 = new TwoNumber();
        number1.setFirstNumber(3);
        number2.setSecondNumber(2);
        Addition Di = new Addition();
        Di.setA(number1);
        Di.setB(number2);
        double ac = Di.addTwoNumber();
        assertEquals(ex, ac, 0);
    }

    @Test
    public void Add6() {
        double ex = 10;
        TwoNumber number1 = new TwoNumber();
        TwoNumber number2 = new TwoNumber();
        number1.setFirstNumber(8);
        number2.setSecondNumber(3);
        Addition Di = new Addition();
        Di.setA(number1);
        Di.setB(number2);
        double ac = Di.addTwoNumber();
        assertEquals(ex, ac, 0);
    }

    @Test
    public void Add7() {
        double ex = 12;
        TwoNumber number1 = new TwoNumber();
        TwoNumber number2 = new TwoNumber();
        number1.setFirstNumber(6);
        number2.setSecondNumber(5);
        Addition Di = new Addition();
        Di.setA(number1);
        Di.setB(number2);
        double ac = Di.addTwoNumber();
        assertEquals(ex, ac, 0);
    }

    @Test
    public void Add8() {
        double ex = -5;
        TwoNumber number1 = new TwoNumber();
        TwoNumber number2 = new TwoNumber();
        number1.setFirstNumber(1);
        number2.setSecondNumber(7);
        Addition Di = new Addition();
        Di.setA(number1);
        Di.setB(number2);
        double ac = Di.addTwoNumber();
        assertEquals(ex, ac, 0);
    }

    @Test
    public void Add9() {
        double ex = 11;
        TwoNumber number1 = new TwoNumber();
        TwoNumber number2 = new TwoNumber();
        number1.setFirstNumber(6);
        number2.setSecondNumber(6);
        Addition Di = new Addition();
        Di.setA(number1);
        Di.setB(number2);
        double ac = Di.addTwoNumber();
        assertEquals(ex, ac, 0);
    }

    @Test
    public void Add10() {
        double ex = -7;
        TwoNumber number1 = new TwoNumber();
        TwoNumber number2 = new TwoNumber();
        number1.setFirstNumber(3);
        number2.setSecondNumber(4);
        Addition Di = new Addition();
        Di.setA(number1);
        Di.setB(number2);
        double ac = Di.addTwoNumber();
        assertEquals(ex, ac, 0);
    }

}
