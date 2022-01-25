package javaclub5.loops.task15;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Popova Anna
 */

public class RunnerTest {
    @Test
    public void makeMoveTest() {
        Assert.assertEquals(1, Runner.makeMove(1));
        Assert.assertEquals(2, Runner.makeMove(2));
        Assert.assertEquals(3, Runner.makeMove(3));
    }
}