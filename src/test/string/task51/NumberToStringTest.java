package test.string.task51;

import main.string.task51.NumberToString;
import org.junit.Assert;
import org.junit.Test;

public class NumberToStringTest {


    @Test
    public void Test() {
        Assert.assertEquals("67", NumberToString.numberToString(67));
        Assert.assertEquals("123", NumberToString.numberToString(123));
        Assert.assertEquals("999", NumberToString.numberToString(999));

    }
}