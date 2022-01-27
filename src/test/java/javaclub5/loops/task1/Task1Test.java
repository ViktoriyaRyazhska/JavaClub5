package javaclub5.loops.task1;

import org.junit.Assert;
import org.junit.Test;

public class Task1Test {

    @Test
    public void test10Empty(){
        Assert.assertEquals("",Runner.repeatStr(10,""));
    }

    @Test
    public void test5Hello(){
        Assert.assertEquals("HelloHelloHelloHelloHello",Runner.repeatStr(5,"Hello"));
    }
}
