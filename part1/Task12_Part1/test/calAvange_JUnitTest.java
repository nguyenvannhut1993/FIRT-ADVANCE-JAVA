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
import task12_part1.ListBook;
import task12_part1.RefenrenceBook;
import task12_part1.TexBook;

/**
 *
 * @author Nguyen Van Nhut
 */
public class calAvange_JUnitTest {
    
    public calAvange_JUnitTest() {
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
     public void test1() {
        double ex = 2.5;
        TexBook T[] = new TexBook[100];
        RefenrenceBook Rf[] = new RefenrenceBook[100];
        ListBook Lists = new ListBook(T,Rf);
        TexBook a = new TexBook("1", "12A456", "Hoa", "22/08", 5, 1, "GD");
        Lists.addTexBook(a);
        double ac = Lists.calTexBook(a);
        assertEquals(ex, ac, 0);
     }
     @Test
     public void test2() {
        double ex = 2;
        TexBook T[] = new TexBook[100];
        RefenrenceBook Rf[] = new RefenrenceBook[100];
        ListBook Lists = new ListBook(T,Rf);
        TexBook a = new TexBook("1", "12A456", "Hoa", "22/08", 4, 1, "GD");
        Lists.addTexBook(a);
        double ac = Lists.calTexBook(a);
        assertEquals(ex, ac, 0);
     }
      @Test
     public void test3() {
        double ex = 6;
        TexBook T[] = new TexBook[100];
        RefenrenceBook Rf[] = new RefenrenceBook[100];
        ListBook Lists = new ListBook(T,Rf);
        TexBook a = new TexBook("1", "12A456", "Hoa", "22/08", 12, 1, "GD");
        Lists.addTexBook(a);
        double ac = Lists.calTexBook(a);
        assertEquals(ex, ac, 0);
     }
      @Test
     public void test4() {
        double ex = 20;
        TexBook T[] = new TexBook[100];
        RefenrenceBook Rf[] = new RefenrenceBook[100];
        ListBook Lists = new ListBook(T,Rf);
        TexBook a = new TexBook("1", "12A456", "Hoa", "22/08", 20, 2, "GD");
        Lists.addTexBook(a);
        double ac = Lists.calTexBook(a);
        assertEquals(ex, ac, 0);
     }
      @Test
     public void test5() {
        double ex = 28;
        TexBook T[] = new TexBook[100];
        RefenrenceBook Rf[] = new RefenrenceBook[100];
        ListBook Lists = new ListBook(T,Rf);
        TexBook a = new TexBook("1", "12A456", "Hoa", "22/08", 14, 4, "GD");
        Lists.addTexBook(a);
        double ac = Lists.calTexBook(a);
        assertEquals(ex, ac, 0);
     }
      @Test
     public void test6() {
        double ex = 2.5;
        TexBook T[] = new TexBook[100];
        RefenrenceBook Rf[] = new RefenrenceBook[100];
        ListBook Lists = new ListBook(T,Rf);
        TexBook a = new TexBook("1", "12A456", "Hoa", "22/08", 7, 1, "GD");
        Lists.addTexBook(a);
        double ac = Lists.calTexBook(a);
        assertEquals(ex, ac, 0);
     }
     @Test
     public void test7() {
        double ex = 2;
        TexBook T[] = new TexBook[100];
        RefenrenceBook Rf[] = new RefenrenceBook[100];
        ListBook Lists = new ListBook(T,Rf);
        TexBook a = new TexBook("1", "12A456", "Hoa", "22/08", 5, 1, "GD");
        Lists.addTexBook(a);
        double ac = Lists.calTexBook(a);
        assertEquals(ex, ac, 0);
     }
      @Test
     public void test8() {
        double ex = 6;
        TexBook T[] = new TexBook[100];
        RefenrenceBook Rf[] = new RefenrenceBook[100];
        ListBook Lists = new ListBook(T,Rf);
        TexBook a = new TexBook("1", "12A456", "Hoa", "22/08", 14, 1, "GD");
        Lists.addTexBook(a);
        double ac = Lists.calTexBook(a);
        assertEquals(ex, ac, 0);
     }
      @Test
     public void test9() {
        double ex = 20;
        TexBook T[] = new TexBook[100];
        RefenrenceBook Rf[] = new RefenrenceBook[100];
        ListBook Lists = new ListBook(T,Rf);
        TexBook a = new TexBook("1", "12A456", "Hoa", "22/08", 22, 2, "GD");
        Lists.addTexBook(a);
        double ac = Lists.calTexBook(a);
        assertEquals(ex, ac, 0);
     }
      @Test
     public void test10() {
        double ex = 28;
        TexBook T[] = new TexBook[100];
        RefenrenceBook Rf[] = new RefenrenceBook[100];
        ListBook Lists = new ListBook(T,Rf);
        TexBook a = new TexBook("1", "12A456", "Hoa", "22/08", 15, 4, "GD");
        Lists.addTexBook(a);
        double ac = Lists.calTexBook(a);
        assertEquals(ex, ac, 0);
     }
}
