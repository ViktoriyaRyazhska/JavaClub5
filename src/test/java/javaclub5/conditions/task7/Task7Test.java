package javaclub5.conditions.task7;


import org.junit.Assert;
import org.junit.Test;

/**
 *
 * Tests of Task 7 Conditions
 *
 * @author Rostyslav Ros
 */

public class Task7Test {

    /**
     * Test of arithmeticResult method
     */
    @Test
    public void arithmeticResultTest() {
        Assert.assertEquals(11, Runner.arithmeticResult("+", 4, 7));
        Assert.assertEquals(-3, Runner.arithmeticResult("-", 15, 18));
        Assert.assertEquals(25, Runner.arithmeticResult("*", 5, 5));
        Assert.assertEquals(7, Runner.arithmeticResult("/", 49, 7));
    }
}
