package javaclub5.conditions.task11;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Popova Anna
 */

public class SolutionTest {
    @Test
    public void testSomething() {
        Assert.assertEquals(2, Solution.sequence(20));
        Assert.assertEquals(2, Solution.sequence(148));
        Assert.assertEquals(2, Solution.sequence(111));
        Assert.assertEquals(2, Solution.sequence(118));
        Assert.assertEquals(0, Solution.sequence(41));
        Assert.assertEquals(0, Solution.sequence(85));
        Assert.assertEquals(0, Solution.sequence(117));
        Assert.assertEquals(1, Solution.sequence(82));
        Assert.assertEquals(1, Solution.sequence(72));
        Assert.assertEquals(1, Solution.sequence(5101394));
        Assert.assertEquals(1, Solution.sequence(163));
        Assert.assertEquals(1, Solution.sequence(90));
    }

}