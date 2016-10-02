
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import StreamObject.Employment;
import StreamObject.processingStream;

/**
 *
 * @author Nguyen Van Nhut
 * Day 20/09/2016
 * Version 1
 * Class for testing Average Age
 * Input list
 */
public class TestSalaryAverage {
    
    public TestSalaryAverage() {
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
    public void Test1() {
        double ex = 23.1;
        List<Employment> list = new ArrayList<Employment>();
        list.add(new Employment("Nguyen Van nhut", 23, 1000000));
        list.add(new Employment("Vo Loc", 23, 2000000));
        list.add(new Employment("Vo Van Nhan", 19, 200000));
        list.add(new Employment(" Nguyen Vu Luan", 17, 300000));
        list.add(new Employment("Nguyen Dinh khang", 30, 10000000));
        list.add(new Employment("Le Thi Ha", 26, 8000000));
        list.add(new Employment("Nguyen Ngoc Khanh", 24, 200000));
        processingStream a = new processingStream();
        double ac = a.calAvaAge(list);
        assertEquals(ex, ac,0.1);
    }
    @Test
    public void Test2() {
        double ex = 24.2;
        List<Employment> list = new ArrayList<Employment>();
        list.add(new Employment(" Nguyen Vu Luan", 17, 300000));
        list.add(new Employment("Nguyen Dinh khang", 30, 10000000));
        list.add(new Employment("Le Thi Ha", 26, 8000000));
        list.add(new Employment("Nguyen Ngoc Khanh", 24, 200000));
        processingStream a = new processingStream();
        double ac = a.calAvaAge(list);
        assertEquals(ex, ac,0.1);
    }
    @Test
    public void Test3() {
        double ex = 24;
        List<Employment> list = new ArrayList<Employment>();
        list.add(new Employment("Nguyen Van nhut", 23, 1000000));
        list.add(new Employment("Vo Loc", 23, 2000000));
        list.add(new Employment("Le Thi Ha", 26, 8000000));
        list.add(new Employment("Nguyen Ngoc Khanh", 24, 200000));
        processingStream a = new processingStream();
        double ac = a.calAvaAge(list);
        assertEquals(ex, ac,0.2);
    }
    @Test
    public void Test4() {
        double ex = 25.5;
        List<Employment> list = new ArrayList<Employment>();
        list.add(new Employment("Nguyen Tuan Anh", 32, 20000000));
        list.add(new Employment("Dang Xuan Vuong", 26, 5000000));
        list.add(new Employment("Nguyen Thanh Bao", 28, 90000000));
        list.add(new Employment("Nguyen Hoang Huy", 24, 5100000));
        list.add(new Employment("Nguyen Thi Diep", 19, 80000000));
        list.add(new Employment("Nguyen Ngoc Khanh", 24, 200000));
        processingStream a = new processingStream();
        double ac = a.calAvaAge(list);
        assertEquals(ex, ac,0.1);
    }
    @Test
    public void Test5() {
        double ex = 24.2;
        List<Employment> list = new ArrayList<Employment>();
        list.add(new Employment("Nguyen Van nhut", 23, 1000000));
        list.add(new Employment("Vo Loc", 23, 2000000));
        list.add(new Employment("Vo Van Nhan", 19, 200000));
        list.add(new Employment("Nguyen Tuan Anh", 32, 20000000));
        processingStream a = new processingStream();
        double ac = a.calAvaAge(list);
        assertEquals(ex, ac,0.1);
    }
     @Test
    public void Test6() {
        double ex = 24;
        List<Employment> list = new ArrayList<Employment>();
        list.add(new Employment("Nguyen Van nhut", 23, 1000000));
        list.add(new Employment("Le Thi Ha", 26, 8000000));
        list.add(new Employment("Nguyen Ngoc Khanh", 24, 200000));
        processingStream a = new processingStream();
        double ac = a.calAvaAge(list);
        assertEquals(ex, ac,0.1);
    }
    @Test
    public void Test7() {
        double ex = 23;
        List<Employment> list = new ArrayList<Employment>();
        list.add(new Employment(" Nguyen Vu Luan", 17, 300000));
        list.add(new Employment("Nguyen Dinh khang", 30, 10000000));
        list.add(new Employment("Nguyen Ngoc Khanh", 24, 200000));
        processingStream a = new processingStream();
        double ac = a.calAvaAge(list);
        assertEquals(ex, ac,0.1);
    }
    @Test
    public void Test8() {
        double ex = 24.7;
        List<Employment> list = new ArrayList<Employment>();
        list.add(new Employment("Le Thi Ha", 26, 8000000));
        list.add(new Employment("Nguyen Ngoc Khanh", 24, 200000));
        processingStream a = new processingStream();
        double ac = a.calAvaAge(list);
        assertEquals(ex, ac,0.2);
    }
    @Test
    public void Test9() {
        double ex = 24.6;
        List<Employment> list = new ArrayList<Employment>();
        list.add(new Employment("Nguyen Tuan Anh", 32, 20000000));
        list.add(new Employment("Nguyen Hoang Huy", 24, 5100000));
        list.add(new Employment("Nguyen Thi Diep", 19, 80000000));
        list.add(new Employment("Nguyen Ngoc Khanh", 24, 200000));
        processingStream a = new processingStream();
        double ac = a.calAvaAge(list);
        assertEquals(ex, ac,0.1);
    }
    @Test
    public void Test10() {
        double ex = 23;
        List<Employment> list = new ArrayList<Employment>();
        list.add(new Employment("Nguyen Van nhut", 23, 1000000));
        list.add(new Employment("Nguyen Thanh Bao", 28, 90000000));
        list.add(new Employment("Nguyen Hoang Huy", 24, 5100000));
        list.add(new Employment("Nguyen Thi Diep", 19, 80000000));
        list.add(new Employment("Nguyen Ngoc Khanh", 24, 200000));
        processingStream a = new processingStream();
        double ac = a.calAvaAge(list);
        assertEquals(ex, ac,0.1);
    }
}
