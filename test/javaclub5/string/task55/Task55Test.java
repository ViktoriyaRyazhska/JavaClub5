package javaclub5.string.task55;

import org.junit.Assert;
import org.junit.Test;

import static javaclub5.string.task55.Task55.replaceDots;
import static org.junit.Assert.*;

public class Task55Test {
    @Test
    public void testSomeDots() {
        Assert.assertTrue("Sorry, try again :-(", "one-two-three".equals(Task55.replaceDots("one.two.three")));
    }
}