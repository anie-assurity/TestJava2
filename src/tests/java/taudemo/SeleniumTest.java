package taudemo;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SeleniumTest {
    @BeforeClass
    public static void beforeClass() {
    System.out.println("start");
    }

    @AfterClass
    public static void afterClass() {
    System.out.println("end");
       }
    @Test
    public void openThePageAndCheckTheTitle() {
    String field1 = "field1";
    String field2 = "field1";

    System.out.println("test1");

    assertEquals(field1,field2);
       }
}
