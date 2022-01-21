package javaclub5.strings.task5;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Popova Anna
 */

public class RunnerTest {
    @Test
    public void testSomeDots() {
        Assert.assertTrue("Sorry, try again :-(", "one-two-three".equals(Runner.replaceDots("one.two.three")));
    }

}