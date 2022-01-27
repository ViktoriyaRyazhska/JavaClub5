package javaclub5.string.task54;

import org.junit.Assert;
import org.junit.Test;

public class Task54Test {
    @Test

    public void oppositeTest() {
        Assert.assertEquals(-1, Task54.opposite(1), 0);
        Assert.assertEquals(2, Task54.opposite(-2), 0);
        Assert.assertEquals(0, Task54.opposite(0), 0);
    }
}