package two;

import org.junit.Assert;
import org.junit.Test;

public class Task42Test {
    @Test
    public void test01() {
        Assert.assertEquals(0, Task42.Older(6,3));
    }
    @Test
    public void test02() {
        Assert.assertEquals(-15, Task42.Older(45, 30));
    }
    @Test
    public void test03() {
        Assert.assertEquals(16, Task42.Older(30, 7));
    }
    @Test
    public void test04() {
        Assert.assertEquals(0, Task42.Older(0,0));
    }
}