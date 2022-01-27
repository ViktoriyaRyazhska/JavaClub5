package javaclub5.loops.task12;

import org.junit.Assert;
import org.junit.Test;

public class Task12Test {

    @Test
    public void basicTest(){
        Assert.assertEquals(1,Runner.nearestSq(1));
        Assert.assertEquals(9,Runner.nearestSq(8));
        Assert.assertEquals(9,Runner.nearestSq(10));
    }
}
