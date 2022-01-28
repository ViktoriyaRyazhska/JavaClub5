package javaclub5.oop.task1;

import org.junit.Assert;
import org.junit.Test;

public class Task1Test {

    @Test
    public void makingAdam(){
        Human[] paradise = Runner.create();
        Assert.assertEquals("Adam are a man", true ,paradise[0] instanceof Man);
    }
}
