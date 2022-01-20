package javaclub5.basicprogram.task1;

import org.junit.Assert;
import org.junit.Test;
/**
 *
 * Tests of Task 1 BasicProgram
 *
 * @author Rostyslav Ros
 */

public class Task1Test {

    /**
     * Test of doubleInt method
     */
    @Test
    public void doubleIntTest() {
        Assert.assertEquals("Nope!" , 4, Runner.doubleInt(2));
    }
}
