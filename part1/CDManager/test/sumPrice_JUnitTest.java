/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import cdmanager.CD;
import cdmanager.CDManagers;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nguyen Van Nhut
 * Day 19 /06/2016
 * test for Sum price 
 * input price
 * output sum price
 */
public class sumPrice_JUnitTest {

    public sumPrice_JUnitTest() {
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
    public void sumPrice1() {
        float ex = 6;
        CD[] cd1 = new CD[10];
        CD cd2 = new CD();
        cd2.setPrice(6);
        CDManagers cd = new CDManagers(cd1);
        cd.addCD(cd2);
        float ac = cd.excutePrice();
        assertEquals(ex, ac, 0);
    }

    @Test
    public void sumPrice2() {
        float ex = 2;
        CD[] cd1 = new CD[10];
        CD cd2 = new CD();
        cd2.setPrice(2);
        CDManagers cd = new CDManagers(cd1);
        cd.addCD(cd2);
        float ac = cd.excutePrice();
        assertEquals(ex, ac, 0);
    }

    @Test
    public void sumPrice3() {
        float ex = 4;
        CD[] cd1 = new CD[10];
        CD cd2 = new CD();
        cd2.setPrice(4);
        CDManagers cd = new CDManagers(cd1);
        cd.addCD(cd2);
        float ac = cd.excutePrice();
        assertEquals(ex, ac, 0);
    }

    @Test
    public void sumPrice4() {
        float ex = 10;
        CD[] cd1 = new CD[10];
        CD cd2 = new CD();
        cd2.setPrice(10);
        CDManagers cd = new CDManagers(cd1);
        cd.addCD(cd2);
        float ac = cd.excutePrice();
        assertEquals(ex, ac, 0);
    }

    @Test
    public void sumPrice5() {
        float ex = 20;
        CD[] cd1 = new CD[10];
        CD cd2 = new CD();
        CD cd3 = new CD();
        cd2.setPrice(10);
        CDManagers cd = new CDManagers(cd1);
        cd.addCD(cd2);
        cd3.setPrice(10);
        cd.addCD(cd3);
        float ac = cd.excutePrice();
        assertEquals(ex, ac, 0);
    }

    @Test
    public void sumPrice6() {
        float ex = 17;
        CD[] cd1 = new CD[10];
        CD cd2 = new CD();
        CD cd3 = new CD();
        cd2.setPrice(8);
        CDManagers cd = new CDManagers(cd1);
        cd.addCD(cd2);
        cd3.setPrice(10);
        cd.addCD(cd3);
        float ac = cd.excutePrice();
        assertEquals(ex, ac, 0);
    }

    @Test
    public void sumPrice7() {
        float ex = 15;
        CD[] cd1 = new CD[10];
        CD cd2 = new CD();
        CD cd3 = new CD();
        cd2.setPrice(6);
        CDManagers cd = new CDManagers(cd1);
        cd.addCD(cd2);
        cd3.setPrice(10);
        cd.addCD(cd3);
        float ac = cd.excutePrice();
        assertEquals(ex, ac, 0);
    }

    @Test
    public void sumPrice8() {
        float ex = 15;
        CD[] cd1 = new CD[10];
        CD cd2 = new CD();
        CD cd3 = new CD();
        cd2.setPrice(7);
        CDManagers cd = new CDManagers(cd1);
        cd.addCD(cd2);
        cd3.setPrice(9);
        cd.addCD(cd3);
        float ac = cd.excutePrice();
        assertEquals(ex, ac, 0);
    }

    @Test
    public void sumPrice9() {
        float ex = 5;
        CD[] cd1 = new CD[10];
        CD cd2 = new CD();
        CD cd3 = new CD();
        cd2.setPrice(1);
        CDManagers cd = new CDManagers(cd1);
        cd.addCD(cd2);
        cd3.setPrice(3);
        cd.addCD(cd3);
        float ac = cd.excutePrice();
        assertEquals(ex, ac, 0);
    }

    @Test
    public void sumPrice10() {
        float ex = 6;
        CD[] cd1 = new CD[10];
        CD cd2 = new CD();
        CD cd3 = new CD();
        cd2.setPrice(4);
        CDManagers cd = new CDManagers(cd1);
        cd.addCD(cd2);
        cd3.setPrice(1);
        cd.addCD(cd3);
        float ac = cd.excutePrice();
        assertEquals(ex, ac, 0);
    }
}
