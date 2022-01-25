package javaclub5.strings.task18;

import org.junit.Assert;
import org.junit.Test;

import static javaclub5.strings.task18.Kata.remove;

/**
 *
 * Tests of Task 18 Strings
 *
 * @author Rostyslav Ros
 */

public class Task18Test {

    /**
     * Test of remove method
     */

    @Test
    public void removeTest() {
        Assert.assertEquals("Hi", remove("Hi!", 1));
        Assert.assertEquals("Hi", remove("Hi!", 100));
        Assert.assertEquals("Hi!!", remove("Hi!!!", 1));
        Assert.assertEquals("Hi", remove("Hi!!!", 100));
        Assert.assertEquals("Hi", remove("!Hi", 1));
        Assert.assertEquals("Hi!", remove("!Hi!", 1));
        Assert.assertEquals("Hi", remove("!Hi!", 100));
        Assert.assertEquals("!!Hi !!hi!!! !hi", remove("!!!Hi !!hi!!! !hi", 1));
        Assert.assertEquals("Hi !!hi!!! !hi", remove("!!!Hi !!hi!!! !hi", 3));
        Assert.assertEquals("Hi hi!!! !hi", remove("!!!Hi !!hi!!! !hi", 5));
        Assert.assertEquals("Hi hi hi", remove("!!!Hi !!hi!!! !hi", 100));
    }
}
