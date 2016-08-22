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
import part1_task8_task9.Laptop;
import part1_task8_task9.MannagerComputer;

/**
 *
 * @author Nguyen Van Nhut 
 * Day 22/08/2016 
 * Version 1 
 * test for adding method
 */
public class AddLap_JUnitTest {

    public AddLap_JUnitTest() {
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
    public void AddLap1() {
        boolean ex = true;
        Laptop T = new Laptop(2, 10, 15, "nA", 120, "n", 1);
        Laptop[] C = new Laptop[10];
        part1_task8_task9.Desktop[] Des = new part1_task8_task9.Desktop[100];
        MannagerComputer A = new MannagerComputer(C, Des);
        boolean ac = A.addLap(T);
        assertEquals(ex, ac);
    }

    @Test
    public void AddLap2() {
        boolean ex = true;
        Laptop T = new Laptop(2, 2, 5, "n", 10, "tt", 1);
        Laptop[] C = new Laptop[10];
        part1_task8_task9.Desktop[] Des = new part1_task8_task9.Desktop[100];
        MannagerComputer A = new MannagerComputer(C, Des);
        boolean ac = A.addLap(T);
        assertEquals(ex, ac);
    }

    @Test
    public void AddLap3() {
        boolean ex = true;
        Laptop T = new Laptop(2, 5, 3, "nAA", 120, "n", 1);
        Laptop[] C = new Laptop[10];
        part1_task8_task9.Desktop[] Des = new part1_task8_task9.Desktop[100];
        MannagerComputer A = new MannagerComputer(C, Des);
        boolean ac = A.addLap(T);
        assertEquals(ex, ac);
    }

    @Test
    public void AddLap4() {
        boolean ex = true;
        Laptop T = new Laptop(2, 1, 15, "nA", 120, "n", 0);
        Laptop[] C = new Laptop[10];
        part1_task8_task9.Desktop[] Des = new part1_task8_task9.Desktop[100];
        MannagerComputer A = new MannagerComputer(C, Des);
        boolean ac = A.addLap(T);
        assertEquals(ex, ac);
    }

    @Test
    public void AddLap5() {
        boolean ex = true;
        Laptop T = new Laptop(1, 1, 5, "n.a", 120, "ha", 0);
        Laptop[] C = new Laptop[10];
        part1_task8_task9.Desktop[] Des = new part1_task8_task9.Desktop[100];
        MannagerComputer A = new MannagerComputer(C, Des);
        boolean ac = A.addLap(T);
        assertEquals(ex, ac);
    }

    @Test
    public void AddLap6() {
        boolean ex = true;
        Laptop T = new Laptop();
        Laptop[] C = new Laptop[0];
        part1_task8_task9.Desktop[] Des = new part1_task8_task9.Desktop[100];
        MannagerComputer A = new MannagerComputer(C, Des);
        boolean ac = A.addLap(T);
        assertEquals(ex, ac);
    }

    @Test
    public void AddLap7() {
        boolean ex = false;
        Laptop T = new Laptop(1, 4, 5, "n.a", 110, "a", 10);
        Laptop[] C = new Laptop[10];
        part1_task8_task9.Desktop[] Des = new part1_task8_task9.Desktop[100];
        MannagerComputer A = new MannagerComputer(C, Des);
        boolean ac = A.addLap(T);
        assertEquals(ex, ac);
    }

    @Test
    public void AddLap8() {
        boolean ex = false;
        Laptop T = new Laptop(1, 1, 5, "n.a", 120, "nhut", 0);
        Laptop[] C = new Laptop[10];
        part1_task8_task9.Desktop[] Des = new part1_task8_task9.Desktop[100];
        MannagerComputer A = new MannagerComputer(C, Des);
        boolean ac = A.addLap(T);
        assertEquals(ex, ac);
    }

    @Test
    public void AddLap9() {
        boolean ex = false;
        Laptop T = new Laptop(1, 10, 5, "n.a", 160, "nhut", 3);
        Laptop[] C = new Laptop[10];
        part1_task8_task9.Desktop[] Des = new part1_task8_task9.Desktop[100];
        MannagerComputer A = new MannagerComputer(C, Des);
        boolean ac = A.addLap(T);
        assertEquals(ex, ac);
    }

    @Test
    public void AddLap10() {
        boolean ex = false;
        Laptop T = new Laptop(1, 1, 5, "n.a", 120, "nha", 5);
        Laptop[] C = new Laptop[10];
        part1_task8_task9.Desktop[] Des = new part1_task8_task9.Desktop[100];
        MannagerComputer A = new MannagerComputer(C, Des);
        boolean ac = A.addLap(T);
        assertEquals(ex, ac);
    }
}
