
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/*
 *
 * @author Nguyen Van Nhut
 * Day 20/09/2016
 * Version 1
 * Class for test suite
 * Input: Salary_JUnitTest.class, 
 * LowSalary_JUnitTest.class, 
 * TestSalaryAverage.class, 
 * HighSalary_JUnitTest.class, CountPerson_JUnitTest.class
 *
*/
@RunWith(Suite.class)
@Suite.SuiteClasses({Salary_JUnitTest.class, LowSalary_JUnitTest.class, TestSalaryAverage.class, HighSalary_JUnitTest.class, CountPerson_JUnitTest.class})
public class StreamTestSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
