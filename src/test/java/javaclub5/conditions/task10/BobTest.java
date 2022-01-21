package javaclub5.conditions.task10;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Popova Anna
 */

public class BobTest {
    @Test
    public void enoughTest() {
        Assert.assertEquals("Should return 0.", 0, Bob.enough(10, 5, 5));
        Assert.assertEquals("Should return 10.", 10, Bob.enough(100, 60, 50));
        Assert.assertEquals("Should return 0.", 0, Bob.enough(20, 5, 5));
    }

}