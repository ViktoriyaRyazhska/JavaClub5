package javaclub5.basicprogram.task4;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class RunnerTest {
    @Test

    public void is_divisible_test() {
        Assert.assertTrue("Divisible", Runner.is_divisible(10, 2));
        Assert.assertTrue("Divisible", Runner.is_divisible(25, 5));
        Assert.assertFalse("Not divisible", Runner.is_divisible(10, 3));
    }
}