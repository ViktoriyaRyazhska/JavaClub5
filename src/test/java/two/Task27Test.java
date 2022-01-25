package two;

import org.junit.Assert;
import org.junit.Test;

public class Task27Test {
    @Test
    public void test01() {
        Assert.assertEquals("He can fit 20 of the 21 waiting", Task27.EnoughSpace(40, 20, 21));
        Assert.assertEquals("He can fit 0 of the 1 waiting", Task27.EnoughSpace(40, 40, 1));
        Assert.assertEquals("He can fit all 0 passengers", Task27.EnoughSpace(40, 39, 0));
    }
    @Test
    public void test02() {
        Assert.assertEquals("He can fit all 20 passengers", Task27.EnoughSpace(40, 20, 20));
        Assert.assertEquals("He can fit all 40 passengers", Task27.EnoughSpace(40, 0, 40));
    }
}
