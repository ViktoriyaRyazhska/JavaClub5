package javaclub5.loops.task9;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * Tests of Task 9 Loops
 *
 * @author Rostyslav Ros
 */

public class Task9Test {

    @Test
    /**
     * Test of sumOfPositiveNumbers method
     */
    public void sumOfPositiveNumbersTest() {
        Assert.assertEquals(15, Runner.sumOfPositiveNumbers(new int[]{1,2,3,4,5}));
        Assert.assertEquals(13, Runner.sumOfPositiveNumbers(new int[]{1,-2,3,4,5}));
        Assert.assertEquals(0, Runner.sumOfPositiveNumbers(new int[]{}));
        Assert.assertEquals(0, Runner.sumOfPositiveNumbers(new int[]{-1,-2,-3,-4,-5}));
        Assert.assertEquals(9, Runner.sumOfPositiveNumbers(new int[]{-1,2,3,4,-5}));

    }
}
