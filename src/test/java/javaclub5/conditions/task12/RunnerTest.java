package javaclub5.conditions.task12;


import org.junit.Assert;
import org.junit.Test;

/**
 * @author Popova Anna
 */

public class RunnerTest {
    @Test
    public void switchItUpTests() {
        Assert.assertEquals("One", Runner.switchItUp(1));
        Assert.assertEquals("Three", Runner.switchItUp(3));
        Assert.assertEquals("Five", Runner.switchItUp(5));
    }

}