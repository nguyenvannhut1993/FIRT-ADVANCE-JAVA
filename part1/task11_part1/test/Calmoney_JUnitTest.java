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
import task11_part1.ExGold;
import task11_part1.Exchange;
import task11_part1.ForeignExchange;
import task11_part1.ListExchangess;

/**
 *
 * @author Nguyen Van Nhut
 * Day 22/08/2016
 * version 1
 * test for calculating money 
 */
public class Calmoney_JUnitTest {
    
    public Calmoney_JUnitTest() {
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
    public void test1() {
        double ex =3;
        Exchange T = new Exchange("1", "22/08", 1, 3);
        
        
        double ac =T.calMoney(T.getNumber(),T.getUnPrice());
        assertEquals(ex, ac, 0);
    }
     @Test
    public void test2() {
        double ex =8;
        Exchange T = new Exchange("1", "22/08", 2, 4);
        
        
        double ac =T.calMoney(T.getNumber(),T.getUnPrice());
        assertEquals(ex, ac, 0);
    }
     @Test
    public void test3() {
        double ex =6;
        Exchange T = new Exchange("1", "22/08", 2, 3);
        
        
        double ac =T.calMoney(T.getNumber(),T.getUnPrice());
        assertEquals(ex, ac, 0);
    }
     @Test
    public void test4() {
        double ex =30;
        Exchange T = new Exchange("1", "22/08", 10, 3);
        
        
        double ac =T.calMoney(T.getNumber(),T.getUnPrice());
        assertEquals(ex, ac, 0);
    }
     @Test
    public void test5() {
        double ex =20;
        Exchange T = new Exchange("1", "22/08", 1, 20);
        
        
        double ac =T.calMoney(T.getNumber(),T.getUnPrice());
        assertEquals(ex, ac, 0);
    }
     @Test
    public void test6() {
        double ex =99;
        Exchange T = new Exchange("1", "22/08", 10, 10);
        
        
        double ac =T.calMoney(T.getNumber(),T.getUnPrice());
        assertEquals(ex, ac, 0);
    }
     @Test
    public void test7() {
        double ex =32;
        Exchange T = new Exchange("1", "22/08", 11, 3);
        
        
        double ac =T.calMoney(T.getNumber(),T.getUnPrice());
        assertEquals(ex, ac, 0);
    }
     @Test
    public void test8() {
        double ex =5;
        Exchange T = new Exchange("1", "22/08", 1, 6);
        
        
        double ac =T.calMoney(T.getNumber(),T.getUnPrice());
        assertEquals(ex, ac, 0);
    }
     @Test
    public void test9() {
        double ex =1;
        Exchange T = new Exchange("1", "22/08", 1, 8);
        
        
        double ac =T.calMoney(T.getNumber(),T.getUnPrice());
        assertEquals(ex, ac, 0);
    }
     @Test
    public void test10() {
        double ex =540;
        Exchange T = new Exchange("1", "22/08", 29,32);
        
        
        double ac =T.calMoney(T.getNumber(),T.getUnPrice());
        assertEquals(ex, ac, 0);
    }
}
