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
import salary.Salary;
import salary.Staff;

/**
 *
 * @author Nguyen Van Nhut
 * Day 19/08/2016
 * version 1
 * test for Natural salary Person
 * input tax salary , number based, benefit
 * output Natural salary Person
 */
public class NaturalSalary_JUnitTest {
    
    public NaturalSalary_JUnitTest() {
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
     public void NaturalSalary1() {
         double  ex = 15225990;
         Staff A = new Staff();
         Salary S = new Salary();
         A.setCoefficientsSalary(2.67);
         A.setNumberName(1);
         A.setBenefit(12000000);
         S.setStaff(A);
         double ac =S.naturalSalaty();
         assertEquals(ex, ac, 0.1);
     }
      @Test
     public void NaturalSalary2() {
         double  ex = 4164000;
         Staff A = new Staff();
         Salary S = new Salary();
         A.setCoefficientsSalary(2);
         A.setNumberName(1);
         A.setBenefit(1200000);
         S.setStaff(A);
         double ac =S.naturalSalaty();;
         assertEquals(ex, ac, 0.01);
     }
      @Test
     public void NaturalSalary3() {
         double  ex = 15374000;
         Staff A = new Staff();
         Salary S = new Salary();
         A.setCoefficientsSalary(2);
         A.setNumberName(1);
         A.setBenefit(13000000);
         S.setStaff(A);
         double ac =S.naturalSalaty();
         assertEquals(ex, ac, 0.01);
     }
      @Test
     public void NaturalSalary4() {
         double  ex = 13721000;
         Staff A = new Staff();
         Salary S = new Salary();
         A.setCoefficientsSalary(3);
         A.setNumberName(1);
         A.setBenefit(10000000);
         S.setStaff(A);
         double ac =S.naturalSalaty();
         assertEquals(ex, ac, 0.01);
     }
      @Test
     public void NaturalSalary5() {
         double  ex = 13227000;
         Staff A = new Staff();
         Salary S = new Salary();
         A.setCoefficientsSalary(1);
         A.setNumberName(1);
         A.setBenefit(12000000);
         S.setStaff(A);
         double ac =S.naturalSalaty();
         assertEquals(ex, ac, 0.01);
     }
      @Test
     public void NaturalSalary6() {
         double  ex = 15972000;
         Staff A = new Staff();
         Salary S = new Salary();
         A.setCoefficientsSalary(2.5);
         A.setNumberName(1);
         A.setBenefit(13000000);
         S.setStaff(A);
         double ac =S.naturalSalaty();
         assertEquals(ex, ac, 0.01);
     }
     @Test
     public void NaturalSalary7() {
         double  ex = 15373000;
         Staff A = new Staff();
         Salary S = new Salary();
         A.setCoefficientsSalary(2);
         A.setNumberName(1);
         A.setBenefit(13000000);
         S.setStaff(A);
         double ac =S.naturalSalaty();
         assertEquals(ex, ac, 0.01);
     }
     @Test
     public void NaturalSalary8() {
         double  ex = 16572000;
         Staff A = new Staff();
         Salary S = new Salary();
         A.setCoefficientsSalary(3);
         A.setNumberName(1);
         A.setBenefit(13000000);
         S.setStaff(A);
         double ac =S.naturalSalaty();
         assertEquals(ex, ac, 0.01);
     }
     @Test
     public void NaturalSalary9() {
         double  ex = 17745000;
         Staff A = new Staff();
         Salary S = new Salary();
         A.setCoefficientsSalary(4);
         A.setNumberName(1);
         A.setBenefit(13000000);
         S.setStaff(A);
         double ac =S.naturalSalaty();
         assertEquals(ex, ac, 0.01);
     }
     @Test
     public void NaturalSalary10() {
         double  ex = 18870000;
         Staff A = new Staff();
         Salary S = new Salary();
         A.setCoefficientsSalary(5);
         A.setNumberName(1);
         A.setBenefit(13000000);
         S.setStaff(A);
          double ac =S.naturalSalaty();
         assertEquals(ex, ac, 0.01);
     }
}
