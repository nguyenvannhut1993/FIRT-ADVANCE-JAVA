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
import task13_part1.Names;
import task13_part1.Salary;
import task13_part1.Staff;
import task13_part1.StaffProduct;

/**
 *
 * @author Nguyen Van Nhut
 * Day 22/08/2016
 * version 1
 * test for income of staff
 * input number name, coefficientsSalary;
 */
public class income_UnitTest {
    
    public income_UnitTest() {
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
    public void inCome1() {
        double ex = 1512000001;
        Names c = new Names("nhut");
        Staff d = new Staff(c, 1, 1200);
        StaffProduct a = new StaffProduct(2, c, 1, 1200);
        Salary b = new Salary(d, a, null);
        double ac = b.inComeProduct(a);
        assertEquals(ex, ac, 1);
        
    }
    @Test
    public void inCome2() {
        double ex = 1638000001;
        Names c = new Names("nhut");
        Staff d = new Staff(c, 1, 1300);
        StaffProduct a = new StaffProduct(2, c, 1, 1300);
        Salary b = new Salary(d, a, null);
        double ac = b.inComeProduct(a);
        assertEquals(ex, ac, 1);
        
    }
     @Test
    public void inCome3() {
        double ex = 1260000001;
        Names c = new Names("nhut");
        Staff d = new Staff(c, 2, 1000);
        StaffProduct a = new StaffProduct(1, c, 2, 1000);
        Salary b = new Salary(d, a, null);
        double ac = b.inComeProduct(a);
        assertEquals(ex, ac, 1);
        
    }
    @Test
    public void inCome4() {
        double ex = 1008000001;
        Names c = new Names("nhut");
        Staff d = new Staff(c, 1, 800);
        StaffProduct a = new StaffProduct(2, c, 1, 800);
        Salary b = new Salary(d, a, null);
        double ac = b.inComeProduct(a);
        assertEquals(ex, ac, 1);
        
    }
     @Test
    public void inCome5() {
        double ex = 1134000001;
        Names c = new Names("nhut");
        Staff d = new Staff(c, 1, 900);
        StaffProduct a = new StaffProduct(2, c, 1, 900);
        Salary b = new Salary(d, a, null);
        double ac = b.inComeProduct(a);
        assertEquals(ex, ac, 1);
        
    }
    @Test
    public void inCome6() {
        double ex = 1812000001;
        Names c = new Names("nhut");
        Staff d = new Staff(c, 1, 1200);
        StaffProduct a = new StaffProduct(2, c, 1, 1500);
        Salary b = new Salary(d, a, null);
        double ac = b.inComeProduct(a);
        assertEquals(ex, ac, 1);
        
    }
     @Test
    public void inCome7() {
        double ex = 1432000001;
        Names c = new Names("nhut");
        Staff d = new Staff(c, 1, 1500);
        StaffProduct a = new StaffProduct(2, c, 1, 1600);
        Salary b = new Salary(d, a, null);
        double ac = b.inComeProduct(a);
        assertEquals(ex, ac, 1);
        
    }
    @Test
    public void inCome8() {
        double ex = 1543000001;
        Names c = new Names("nhut");
        Staff d = new Staff(c, 1, 1200);
        StaffProduct a = new StaffProduct(2, c, 1, 1200);
        Salary b = new Salary(d, a, null);
        double ac = b.inComeProduct(a);
        assertEquals(ex, ac, 1);
        
    }
     @Test
    public void inCome9() {
        double ex = 2012000001;
        Names c = new Names("nhut");
        Staff d = new Staff(c, 1, 1700);
        StaffProduct a = new StaffProduct(2, c, 1, 1700);
        Salary b = new Salary(d, a, null);
        double ac = b.inComeProduct(a);
        assertEquals(ex, ac, 1);
        
    }
    @Test
    public void inCome10() {
        double ex = 2013000001;
        Names c = new Names("nhut");
        Staff d = new Staff(c, 1, 1800);
        StaffProduct a = new StaffProduct(2, c, 1, 1800);
        Salary b = new Salary(d, a, null);
        double ac = b.inComeProduct(a);
        assertEquals(ex, ac, 1);
        
    }
}
