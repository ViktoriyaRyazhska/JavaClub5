package javaclub5.basicprogram.task9;

import org.junit.Assert;
import org.junit.Test;

public class Task9Test {
    @Test
    public void negativeNumberTest() {
        Assert.assertEquals(-42, Runner.makeNegative(42));
        Assert.assertEquals(-42, Runner.makeNegative(-42));
        Assert.assertEquals(0, Runner.makeNegative(0));
    }
}
