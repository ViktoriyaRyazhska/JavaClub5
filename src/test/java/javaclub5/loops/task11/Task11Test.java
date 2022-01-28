package javaclub5.loops.task11;

import org.junit.Assert;
import org.junit.Test;

import java.net.PortUnreachableException;

public class Task11Test {

    @Test
    public void twiceAsOldTest(){
        Assert.assertEquals(30, Runner.TwiceAsOld(30,0));
        Assert.assertEquals(16, Runner.TwiceAsOld(30,7));
        Assert.assertEquals(15, Runner.TwiceAsOld(45,30));
    }
}
