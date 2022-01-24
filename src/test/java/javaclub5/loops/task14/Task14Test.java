package javaclub5.loops.task14;


import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static javaclub5.loops.task14.Runner.gettingPrimes;

/**
 *
 * Tests of Task 14 Loops
 *
 * @author Rostyslav Ros
 */

public class Task14Test {

    /**
     * Test of gettingPrimes method
     */
    @Test
    public void gettingPrimesTest() {
        System.out.println("Fixed Tests");
        Assert.assertEquals("[101, 103]", Arrays.toString(gettingPrimes(2,100,110)));
        Assert.assertEquals("[103, 107]", Arrays.toString(gettingPrimes(4,100,110)));
        Assert.assertEquals(null, gettingPrimes(6,100,110));
        Assert.assertEquals("[359, 367]", Arrays.toString(gettingPrimes(8,300,400)));
        Assert.assertEquals("[337, 347]", Arrays.toString(gettingPrimes(10,300,400)));
    }
}
