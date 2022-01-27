package javaclub5.loops.task13;

import org.junit.Assert;
import org.junit.Test;

public class Task13Test {

    @Test
    public void test1(){
        Assert.assertEquals(3,Runner.summation(2));
    }
    @Test
    public void test2(){
        Assert.assertEquals(36,Runner.summation(8));
    }
}
