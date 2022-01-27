package javaclub5.basicprogram.task10;

import org.junit.Assert;
import org.junit.Test;

public class Task10Test {
    @Test
    public void datingRangeTest(){
        Assert.assertEquals("15-20", Runner.datingRange(17));
        Assert.assertEquals("27-66", Runner.datingRange(40));
        Assert.assertEquals("14-16", Runner.datingRange(15));
        Assert.assertEquals("9-11", Runner.datingRange(10));
    }

}
