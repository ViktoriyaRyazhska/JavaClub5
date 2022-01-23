package test.basicprogram.task1;

import main.basicprogram.task1.CodeFast;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CodeFastTest {

    @Test
    public void Test() {
        Assert.assertEquals( 4, CodeFast.doubleInteger(2)); // Test 1!
        Assert.assertEquals( 8, CodeFast.doubleInteger(4)); // Test 2!
        Assert.assertEquals( 50, CodeFast.doubleInteger(25)); // Test 3!
        Assert.assertEquals( 0, CodeFast.doubleInteger(0)); // Test 4!
        Assert.assertEquals( -10, CodeFast.doubleInteger(-5)); // Test 4!
    }
}
