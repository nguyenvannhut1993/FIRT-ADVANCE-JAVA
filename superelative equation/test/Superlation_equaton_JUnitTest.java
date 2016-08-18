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
import superelative.equation.Main_equation;
import superelative.equation.superlative_equation;

/**
 *
 * @author hv
 */
public class Superlation_equaton_JUnitTest {
    superlative_equation bai;
    Main_equation bai1;
    public Superlation_equaton_JUnitTest() {
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
    public void Test1(){
    double ex =-1;
    bai.setA(4);
    bai.setB(8);
    double ac = bai.executeEquation();
    assertEquals(ex, ac,0);
}
    @Test
    public void Test2(){
    double ex =-2;
    bai.setA(2);
    bai.setB(4);
    double ac = bai.executeEquation();
    assertEquals(ex, ac,0);
}
    @Test
    public void Test3(){
    double ex =-1;
    bai.setA(10);
    bai.setB(-10);
    double ac = bai.executeEquation();
    assertEquals(ex, ac,0);
}
    @Test
    public void Test4(){
    double ex =2;
    bai.setA(9);
    bai.setB(18);
    double ac = bai.executeEquation();
    assertEquals(ex, ac,0);
    }
    @Test
    public void Test5(){
    double ex =-1;
    bai.setA(12);
    bai.setB(6);
    double ac = bai.executeEquation();
    assertEquals(ex, ac,0);
}
}
