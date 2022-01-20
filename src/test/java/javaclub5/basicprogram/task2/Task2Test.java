package javaclub5.basicprogram.task2;


import org.junit.Assert;
import org.junit.Test;

/**
 *
 * Tests of Task 2 BasicProgram
 *
 * @author Rostyslav Ros
 */

public class Task2Test {

    /**
     * Test of multiplyTwoNums method
     */
    @Test
    public void multiplyTwoNumsTest() {
        Assert.assertEquals(4, Runner.multiplyTwoNums(2, 2));
        Assert.assertEquals(10, Runner.multiplyTwoNums(5, 2));
        Assert.assertEquals(100, Runner.multiplyTwoNums(100, 1));
        Assert.assertEquals(0, Runner.multiplyTwoNums(0, 100));
    }
}
