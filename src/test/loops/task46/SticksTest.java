package test.loops.task46;

import main.loops.task46.Sticks;
import org.junit.Assert;
import org.junit.Test;

public class SticksTest {

    @Test
    public void Test() {
        Assert.assertEquals(1, Sticks.makeMove(1));
        Assert.assertEquals(2, Sticks.makeMove(2));
        Assert.assertEquals(3, Sticks.makeMove(3));
    }

}
