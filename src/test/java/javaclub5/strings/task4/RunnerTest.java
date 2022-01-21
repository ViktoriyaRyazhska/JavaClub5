package javaclub5.strings.task4;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Popova Anna
 */

public class RunnerTest {

    @Test

    public void oppositeTest() {
        Assert.assertEquals(-1, Runner.opposite(1), 0);
        Assert.assertEquals(2, Runner.opposite(-2), 0);
        Assert.assertEquals(0, Runner.opposite(0), 0);
    }

}