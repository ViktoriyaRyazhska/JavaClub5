package javaclub5.strings.task2;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * Tests of Task 2 Strings
 *
 * @author Rostyslav Ros
 */

public class Task2Test {

    @Test
    /**
     * Test of reversed method
     */
    public void reversedTest() {
        Assert.assertEquals("dlrow", Runner.reversed("world"));
    }
}
