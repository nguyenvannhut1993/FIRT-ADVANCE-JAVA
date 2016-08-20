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
 * test for Tax person
 * input tax salary , number based, benefit
 * output tax person
 */
public class Taxperson_JUnitTest {
    
    public Taxperson_JUnitTest() {
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
     public void texPerson1() {
         double  ex = 138210;
         Staff A = new Staff();
         Salary S = new Salary();
         A.setCoefficientsSalary(2.67);
         A.setNumberName(1);
         A.setBenefit(12000000);
         S.setStaff(A);
         double ac =S.taxperson();
         assertEquals(ex, ac, 0.01);
     }
      @Test
     public void texPerson2() {
         double  ex = -624000;
         Staff A = new Staff();
         Salary S = new Salary();
         A.setCoefficientsSalary(2);
         A.setNumberName(2);
         A.setBenefit(1200000);
         S.setStaff(A);
         double ac =S.taxperson();
         assertEquals(ex, ac, 0.01);
     }
      @Test
     public void texPerson3() {
         double  ex = 146000;
         Staff A = new Staff();
         Salary S = new Salary();
         A.setCoefficientsSalary(2);
         A.setNumberName(1);
         A.setBenefit(13000000);
         S.setStaff(A);
         double ac =S.taxperson();
         assertEquals(ex, ac, 0.01);
     }
      @Test
     public void texPerson4() {
         double  ex = 59000;
         Staff A = new Staff();
         Salary S = new Salary();
         A.setCoefficientsSalary(3);
         A.setNumberName(1);
         A.setBenefit(10000000);
         S.setStaff(A);
         double ac =S.taxperson();
         assertEquals(ex, ac, 0.01);
     }
      @Test
     public void texPerson5() {
         double  ex = 33000;
         Staff A = new Staff();
         Salary S = new Salary();
         A.setCoefficientsSalary(1);
         A.setNumberName(1);
         A.setBenefit(12000000);
         S.setStaff(A);
         double ac =S.taxperson();
         assertEquals(ex, ac, 0.01);
     }
      @Test
     public void texPerson6() {
         double  ex = 177000;
         Staff A = new Staff();
         Salary S = new Salary();
         A.setCoefficientsSalary(2.5);
         A.setNumberName(1);
         A.setBenefit(13000000);
         S.setStaff(A);
         double ac =S.taxperson();
         assertEquals(ex, ac, 0.01);
     }
     @Test
     public void texPerson7() {
         double  ex = 145000;
         Staff A = new Staff();
         Salary S = new Salary();
         A.setCoefficientsSalary(2);
         A.setNumberName(1);
         A.setBenefit(13000000);
         S.setStaff(A);
         double ac =S.taxperson();
         assertEquals(ex, ac, 0.01);
     }
     @Test
     public void texPerson8() {
         double  ex = 208000;
         Staff A = new Staff();
         Salary S = new Salary();
         A.setCoefficientsSalary(3);
         A.setNumberName(1);
         A.setBenefit(13000000);
         S.setStaff(A);
         double ac =S.taxperson();
         assertEquals(ex, ac, 0.01);
     }
     @Test
     public void texPerson9() {
         double  ex = 293000;
         Staff A = new Staff();
         Salary S = new Salary();
         A.setCoefficientsSalary(4);
         A.setNumberName(1);
         A.setBenefit(13000000);
         S.setStaff(A);
         double ac =S.taxperson();
         assertEquals(ex, ac, 0.01);
     }
     @Test
     public void texPerson10() {
         double  ex = 430000;
         Staff A = new Staff();
         Salary S = new Salary();
         A.setCoefficientsSalary(5);
         A.setNumberName(1);
         A.setBenefit(13000000);
         S.setStaff(A);
         double ac =S.taxperson();
         assertEquals(ex, ac, 0.01);
     }
}
