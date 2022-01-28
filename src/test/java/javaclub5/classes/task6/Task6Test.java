package javaclub5.classes.task6;

import org.junit.Assert;
import org.junit.Test;

public class Task6Test {

    @Test
    public void testBasicBlock() throws Exception {
        Runner.Block b = new Runner.Block(new int[]{2,2,2});
        Assert.assertEquals(2,b.getWidth());
        Assert.assertEquals(2,b.getLength());
        Assert.assertEquals(2,b.getHeight());
        Assert.assertEquals(8,b.getVolume());
        Assert.assertEquals(24,b.getSurfaceArea());
    }
}
