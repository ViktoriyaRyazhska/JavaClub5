package two;

import org.junit.Assert;
import org.junit.Test;

public class Task62Test {
    @Test
    public void test01() {
        Assert.assertEquals(27.0, Task62.convert(80), 0.0);
    }
    @Test
    public void test02() {
        Assert.assertEquals(0.0, Task62.convert(32), 0.0);
    }
    @Test
    public void test03() {
        Assert.assertEquals(16.0, Task62.convert(60), 0.0);
    }
    @Test
    public void test04() {
        Assert.assertEquals(-169.0, Task62.convert(-273), 0.0);
    }
    @Test
    public void test05() {
        Assert.assertEquals(-18.0, Task62.convert(0), 0.0);
    }
}
