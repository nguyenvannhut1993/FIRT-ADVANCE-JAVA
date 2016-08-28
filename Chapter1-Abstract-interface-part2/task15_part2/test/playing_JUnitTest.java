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
import task15_part2.NonStringedInstrument;

/**
 *
 * @author Nguyen Van Nhut
 */
public class playing_JUnitTest {
    
    public playing_JUnitTest() {
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
    public void playing1() {
        String ex = "thoi";
        NonStringedInstrument n = new NonStringedInstrument("thoi");
        String ac = n.plays();
        assertEquals("", ex, ac);
    }
    @Test
    public void playing2() {
        String ex = "hit";
        NonStringedInstrument n = new NonStringedInstrument("hit");
        String ac = n.plays();
        assertEquals("", ex, ac);
    }
    @Test
    public void playing3() {
        String ex = "danh";
        NonStringedInstrument n = new NonStringedInstrument("danh");
        String ac = n.plays();
        assertEquals("", ex, ac);
    }
    @Test
    public void playing4() {
        String ex = "co";
        NonStringedInstrument n = new NonStringedInstrument("co");
        String ac = n.plays();
        assertEquals("", ex, ac);
    }
    @Test
    public void playing5() {
        String ex = "go";
        NonStringedInstrument n = new NonStringedInstrument("go");
        String ac = n.plays();
        assertEquals("", ex, ac);
    }
    @Test
    public void playing6() {
        String ex = "hat";
        NonStringedInstrument n = new NonStringedInstrument("thoi");
        String ac = n.plays();
        assertEquals("", ex, ac);
    }
    @Test
    public void playing7() {
        String ex = "kien";
        NonStringedInstrument n = new NonStringedInstrument("thoi");
        String ac = n.plays();
        assertEquals("", ex, ac);
    }
    @Test
    public void playing8() {
        String ex = "go";
        NonStringedInstrument n = new NonStringedInstrument("thoi");
        String ac = n.plays();
        assertEquals("", ex, ac);
    }
    @Test
    public void playing9() {
        String ex = "thoi";
        NonStringedInstrument n = new NonStringedInstrument("dan");
        String ac = n.plays();
        assertEquals("", ex, ac);
    }
    @Test
    public void playing10() {
        String ex = "thoi";
        NonStringedInstrument n = new NonStringedInstrument("danh");
        String ac = n.plays();
        assertEquals("", ex, ac);
    }
}
