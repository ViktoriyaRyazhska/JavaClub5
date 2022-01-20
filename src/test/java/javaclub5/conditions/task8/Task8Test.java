package javaclub5.conditions.task8;



import org.junit.Assert;
import org.junit.Test;

/**
 *
 * Tests of Task 8 Conditions
 *
 * @author Rostyslav Ros
 */

public class Task8Test {

    /**
     * Test of isLove method
     */
    @Test
    public void testOddAndEven() {
        Assert.assertEquals(true, OppositesAttract.isLove(1, 4));
    }

    @Test
    public void testEvenAndEven() {
        Assert.assertEquals(false, OppositesAttract.isLove(2, 2));
    }

    @Test
    public void testOddAndOdd() {
        Assert.assertEquals(false, OppositesAttract.isLove(1, 1));
    }

    @Test
    public void testEvenAndOdd() {
        Assert.assertEquals(true, OppositesAttract.isLove(0, 1));
    }
}
