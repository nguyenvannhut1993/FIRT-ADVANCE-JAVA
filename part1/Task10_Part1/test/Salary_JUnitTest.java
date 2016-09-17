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
 * Day:22/08/2016 
 * Version 1 
 * test for salary of teacher
 * input coeffSalary,grant 
 * output salary
 */
public class Salary_JUnitTest {

    public Salary_JUnitTest() {
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
    public void test_salary1() {
        double ex = 2520003;
        Teacher T = new Teacher("nhut", 3, 2, "nguyent", "22/08", "31/5", "0123456789");
        Teacher[] C = new Teacher[10];
        Student[] Des = new Student[10];
        ListTeacherStudent A = new ListTeacherStudent(C, Des);
        A.addTeacher(T);
        double ac = A.calSalarys();
        assertEquals(ex, ac, 0);
    }

    @Test
    public void test_salary2() {
        double ex = 2520100;
        Teacher T = new Teacher("nhut", 100, 2, "nguyent", "22/08", "31/5", "0123456789");
        Teacher[] C = new Teacher[10];
        Student[] Des = new Student[10];
        ListTeacherStudent A = new ListTeacherStudent(C, Des);
        A.addTeacher(T);
        double ac = A.calSalarys();
        assertEquals(ex, ac, 0);
    }

    @Test
    public void test_salary3() {
        double ex = 12600003;
        Teacher T = new Teacher("khoa", 3, 10, "dao", "10/11", "31/5", "01289644333");
        Teacher[] C = new Teacher[10];
        Student[] Des = new Student[10];
        ListTeacherStudent A = new ListTeacherStudent(C, Des);
        A.addTeacher(T);
        double ac = A.calSalarys();
        assertEquals(ex, ac, 0);
    }

    @Test
    public void test_salary4() {
        double ex = 6300006;
        Teacher T = new Teacher("nhut", 6, 5, "nguyent", "22/08", "31/5", "0123456789");
        Teacher[] C = new Teacher[10];
        Student[] Des = new Student[10];
        ListTeacherStudent A = new ListTeacherStudent(C, Des);
        A.addTeacher(T);
        double ac = A.calSalarys();
        assertEquals(ex, ac, 0);
    }

    @Test
    public void test_salary5() {
        double ex = 12600010;
        Teacher T = new Teacher("nhut", 10, 10, "nguyent", "22/08", "31/5", "0123456789");
        Teacher[] C = new Teacher[10];
        Student[] Des = new Student[10];
        ListTeacherStudent A = new ListTeacherStudent(C, Des);
        A.addTeacher(T);
        double ac = A.calSalarys();
        assertEquals(ex, ac, 0);
    }

    @Test
    public void test_salary6() {
        double ex = 12600010;
        Teacher T = new Teacher("nhut", 100, 100, "nguyent", "22/08", "31/5", "0123456789");
        Teacher[] C = new Teacher[10];
        Student[] Des = new Student[10];
        ListTeacherStudent A = new ListTeacherStudent(C, Des);
        A.addTeacher(T);
        double ac = A.calSalarys();
        assertEquals(ex, ac, 0);
    }

    @Test
    public void test_salary7() {
        double ex = 12600010;
        Teacher T = new Teacher("nhut", 10, 9, "nguyent", "22/08", "31/5", "0123456789");
        Teacher[] C = new Teacher[10];
        Student[] Des = new Student[10];
        ListTeacherStudent A = new ListTeacherStudent(C, Des);
        A.addTeacher(T);
        double ac = A.calSalarys();
        assertEquals(ex, ac, 0);
    }

    @Test
    public void test_salary8() {
        double ex = 12600000;
        Teacher T = new Teacher("nhut", 9, 10, "nguyent", "22/08", "31/5", "0123456789");
        Teacher[] C = new Teacher[10];
        Student[] Des = new Student[10];
        ListTeacherStudent A = new ListTeacherStudent(C, Des);
        A.addTeacher(T);
        double ac = A.calSalarys();
        assertEquals(ex, ac, 0);
    }

    @Test
    public void test_salary9() {
        double ex = 2646010;
        Teacher T = new Teacher("nhut", 100, 21, "nguyent", "22/08", "31/5", "0123456789");
        Teacher[] C = new Teacher[10];
        Student[] Des = new Student[10];
        ListTeacherStudent A = new ListTeacherStudent(C, Des);
        A.addTeacher(T);
        double ac = A.calSalarys();
        assertEquals(ex, ac, 0);
    }

    @Test
    public void test_salary10() {
        double ex = 2520003;
        Teacher T = new Teacher("nhut", 1, 2, "nguyent", "22/08", "31/5", "0123456789");
        Teacher[] C = new Teacher[10];
        Student[] Des = new Student[10];
        ListTeacherStudent A = new ListTeacherStudent(C, Des);
        A.addTeacher(T);
        double ac = A.calSalarys();
        assertEquals(ex, ac, 0);
    }
}
