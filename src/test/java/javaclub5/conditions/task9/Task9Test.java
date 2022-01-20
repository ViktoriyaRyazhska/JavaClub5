package javaclub5.conditions.task9;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * Tests of Task 9 Conditions
 *
 * @author Rostyslav Ros
 */

public class Task9Test {

    /**
     * Test of yesOrNo method
     */
    @Test
    public void yesOrNoTest() {
        Assert.assertEquals(Runner.yesOrNo(true),"Yes");
        Assert.assertEquals(Runner.yesOrNo(false),"No");
    }

}
