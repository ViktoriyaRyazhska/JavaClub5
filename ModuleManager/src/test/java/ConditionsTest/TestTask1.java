package test.java.ConditionsTest;

import org.junit.Assert;
import org.junit.Test;
import main.java.com.softserve.BasicProgram.Task1;

public class TestTask1 {

    @Test
    public static void test() {
	Assert.assertEquals(10, Task1.isInteger(5));
	Assert.assertEquals(8, Task1.isInteger(999888777));
	Assert.assertEquals(50, Task1.isInteger(-561245));
	Assert.assertEquals(0, Task1.isInteger(45869));
    }

}
