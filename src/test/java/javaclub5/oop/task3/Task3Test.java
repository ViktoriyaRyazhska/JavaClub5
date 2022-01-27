package javaclub5.oop.task3;

import org.junit.Assert;
import org.junit.Test;

public class Task3Test {

    Leetspeak myEncoder = new Leetspeak();
    @Test
    public void simpleTest(){
        Assert.assertTrue("empty string", myEncoder.encode("").equals(""));
        Assert.assertTrue("abcdef string", myEncoder.encode("abcdef").equals("4bcd3f"));
    }
}
