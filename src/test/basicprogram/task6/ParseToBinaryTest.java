package test.basicprogram.task6;

import main.basicprogram.task6.ParseToBinary;
import org.junit.Assert;
import org.junit.Test;

public class ParseToBinaryTest {

    @Test
    public void Test() {
        Assert.assertEquals( 1, ParseToBinary.toBinary(1)); // Test 1!
        Assert.assertEquals( 10, ParseToBinary.toBinary(2)); // Test 2!
        Assert.assertEquals( 11, ParseToBinary.toBinary(3)); // Test 3!
        Assert.assertEquals( 101, ParseToBinary.toBinary(5)); // Test 4!
    }
}
