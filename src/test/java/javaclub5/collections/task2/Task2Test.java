package javaclub5.collections.task2;


import org.junit.Assert;
import org.junit.Test;


import java.util.List;

public class Task2Test {
    Runner r = new Runner();

    @Test
    public void sampleTest1() {
        Assert.assertEquals(List.of(1), Runner.CreateList(1));
    }

    @Test
    public void sampleTest2() {
        Assert.assertEquals(List.of(1,2,3,4,5), Runner.CreateList(5));
    }
}