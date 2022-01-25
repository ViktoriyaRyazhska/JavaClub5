package one;

import org.junit.Assert;
import org.junit.Test;

public class Task01Test {
    @Test
    public void whenEnterDifferentValueThenGetDouble () {
        Assert.assertEquals(4, Task01.doubleInteger(2));
        Assert.assertEquals(-4, Task01.doubleInteger(-2));
        Assert.assertEquals(0, Task01.doubleInteger(0));
        Assert.assertEquals(512, Task01.doubleInteger(256));
        Assert.assertEquals(5136, Task01.doubleInteger(2568));
    }
}
