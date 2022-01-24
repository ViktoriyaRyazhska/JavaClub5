package javaclub5.classes.task1;

import javaclub5.classes.task3.Fraction;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * Tests of Task 1 Classes
 *
 * @author Rostyslav Ros
 */

public class Task1Test {

    /**
     * Test of class
     */
    @Test
    public void testSample() {
        EncapsulatedDemo ed = new EncapsulatedDemo();
        Assert.assertEquals(0,ed.getNumber());
    }
}
