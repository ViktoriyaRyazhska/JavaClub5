package javaclub5.strings.task1;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * Tests of Task 1 Strings
 *
 * @author Rostyslav Ros
 */

public class Task1Test {

    @Test
    /**
     * Test of transformIntToString method
     */
    public void transformIntToStringTest() {
        Assert.assertEquals("67", Runner.transformIntToString(67));
        Assert.assertEquals("123", Runner.transformIntToString(123));
        Assert.assertEquals("999", Runner.transformIntToString(999));

    }
}
