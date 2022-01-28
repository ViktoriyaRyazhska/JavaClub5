package javaclub5.loops.task3;

import org.junit.Assert;
import org.junit.Test;

public class Task3Test {

    @Test
    public void meanOfArrayTest(){
        Assert.assertEquals(2,Runner.getAverage(new int[] {2,2,2,2}));
        Assert.assertEquals(3,Runner.getAverage(new int[] {1,2,3,4,5}));
        Assert.assertEquals(1,Runner.getAverage(new int[] {1,1,1,1,1,1,1,2}));
    }
}
