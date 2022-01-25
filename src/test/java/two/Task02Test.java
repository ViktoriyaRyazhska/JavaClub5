package two;

import org.junit.Assert;
import org.junit.Test;

public class Task02Test {
    @Test
    public void test01() {
        Assert.assertEquals(10, Task02.multiplying(2, 5));
    }
    @Test
    public void test02() {
        Assert.assertEquals(-2, Task02.multiplying(2, -1));
    }
    @Test
    public void test03() {
        Assert.assertEquals(0, Task02.multiplying(0, 0));
    }
}
