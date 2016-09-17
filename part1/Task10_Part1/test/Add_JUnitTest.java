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
import task10_part1.ListTeacherStudent;
import task10_part1.Student;
import task10_part1.Teacher;

/**
 *
 * @author Nguyen Van Nhut
 * Day 22/08/2016
 * Version 1 
 * test for adding teacher in list
 */
public class Add_JUnitTest {
    
    public Add_JUnitTest() {
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
         Teacher T = new Teacher("nhut", 3,2, "nguyent", "22/08", "31/5", "0123456789");
        Teacher[] C = new Teacher[10];
         Student[] Des = new Student[10];
         ListTeacherStudent A = new ListTeacherStudent(C, Des);
        boolean ac = A.addTeacher(T);
        assertEquals(ex, ac);
    }
    @Test
    public void AddLap2() {
        boolean ex = true;
         Teacher T = new Teacher("khoa", 100,2, "ha", "26/08", "31/5", "3456789");
        Teacher[] C = new Teacher[10];
         Student[] Des = new Student[10];
         ListTeacherStudent A = new ListTeacherStudent(C, Des);
        boolean ac = A.addTeacher(T);
        assertEquals(ex, ac);
    }
    @Test
    public void AddLap3() {
        boolean ex = true;
         Teacher T = new Teacher("j", 3,2, "k", "11/08", "31/5", "456789");
        Teacher[] C = new Teacher[10];
         Student[] Des = new Student[10];
         ListTeacherStudent A = new ListTeacherStudent(C, Des);
        boolean ac = A.addTeacher(T);
        assertEquals(ex, ac);
    }
    @Test
    public void AddLap4() {
        boolean ex = true;
         Teacher T = new Teacher("h", 100,1131, "k", "10/7", "31/5", "01284233434");
        Teacher[] C = new Teacher[10];
         Student[] Des = new Student[10];
         ListTeacherStudent A = new ListTeacherStudent(C, Des);
        boolean ac = A.addTeacher(T);
        assertEquals(ex, ac);
    }
    @Test
    public void AddLap5() {
        boolean ex = true;
         Teacher T = new Teacher("ht", 3,2, "ent", "23/12", "33/5", "0123456789");
        Teacher[] C = new Teacher[10];
         Student[] Des = new Student[10];
         ListTeacherStudent A = new ListTeacherStudent(C, Des);
        boolean ac = A.addTeacher(T);
        assertEquals(ex, ac);
    }
    @Test
    public void AddLap6() {
        boolean ex = false;
         Teacher T = new Teacher("", 3,2, "nguyent", "22/08", "31/5", "0987654323");
        Teacher[] C = new Teacher[10];
         Student[] Des = new Student[10];
         ListTeacherStudent A = new ListTeacherStudent(C, Des);
        boolean ac = A.addTeacher(T);
        assertEquals(ex, ac);
    }
    @Test
    public void AddLap7() {
        boolean ex = false;
         Teacher T = new Teacher("kh", 100,10, "", "22/08", "90/5", "0123456789");
        Teacher[] C = new Teacher[10];
         Student[] Des = new Student[10];
         ListTeacherStudent A = new ListTeacherStudent(C, Des);
        boolean ac = A.addTeacher(T);
        assertEquals(ex, ac);
    }
    @Test
    public void AddLap8() {
        boolean ex = false;
         Teacher T = new Teacher("1", 3,2, "t", "22/08", "31/5", "09765433333");
        Teacher[] C = new Teacher[10];
         Student[] Des = new Student[10];
         ListTeacherStudent A = new ListTeacherStudent(C, Des);
        boolean ac = A.addTeacher(T);
        assertEquals(ex, ac);
    }
    @Test
    public void AddLap9() {
        boolean ex = false;
         Teacher T = new Teacher();
        Teacher[] C = new Teacher[10];
         Student[] Des = new Student[10];
         ListTeacherStudent A = new ListTeacherStudent(C, Des);
        boolean ac = A.addTeacher(T);
        assertEquals(ex, ac);
    }
    @Test
    public void AddLap10() {
        boolean ex = false;
         Teacher T = new Teacher();
        Teacher[] C = new Teacher[10];
         Student[] Des = new Student[10];
         ListTeacherStudent A = new ListTeacherStudent(C, Des);
        boolean ac = A.addTeacher(T);
        assertEquals(ex, ac);
    }
}
