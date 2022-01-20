package javaclub5.loops.task8;

import org.junit.Assert;
import org.junit.Test;
/**
 *
 * Tests of Task 8 Loops
 *
 * @author Rostyslav Ros
 */

public class Task8Test {

    @Test
    /**
     * Test of multiplyNumsInArray method
     */
    public void multiplyNumsInArrayTest() {
        Assert.assertEquals(6, Runner.multiplyNumsInArray(new int[]{1,2,3}));
        Assert.assertEquals(16, Runner.multiplyNumsInArray(new int[]{4,1,1,1,4}));
        Assert.assertEquals(64, Runner.multiplyNumsInArray(new int[]{2,2,2,2,2,2}));
    }
}
