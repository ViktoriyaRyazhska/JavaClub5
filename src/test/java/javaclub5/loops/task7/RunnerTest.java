package javaclub5.loops.task7;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Popova Anna
 */

public class RunnerTest {
    @Test
    public void betterThanAverageTest() {
        Assert.assertEquals(true, Runner.betterThanAverage(new int[]{2, 3}, 5));
        Assert.assertEquals(true, Runner.betterThanAverage(new int[]{100, 40, 34, 57, 29, 72, 57, 88}, 75));
        Assert.assertEquals(true, Runner.betterThanAverage(new int[]{12, 23, 34, 45, 56, 67, 78, 89, 90}, 69));
        Assert.assertEquals(false, Runner.betterThanAverage(new int[]{100, 90}, 11));

    }

}