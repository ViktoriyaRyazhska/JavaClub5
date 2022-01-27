package two;

import org.junit.Assert;
import org.junit.Test;

public class Task07Test {
    @Test
    public void test01() {
        Assert.assertEquals(61000, Task07.passMilliseconds(0, 1, 1));
    }
    @Test
    public void test02() {
        Assert.assertEquals(0, Task07.passMilliseconds(0, -1, 1));
    }
    @Test
    public void test03() {
        Assert.assertEquals(3661000, Task07.passMilliseconds(1, 1, 1));
    }
    @Test
    public void test04() {
        Assert.assertEquals(3600000, Task07.passMilliseconds(1, 0, 0));
    }
    @Test
    public void test05() {
        Assert.assertEquals(0, Task07.passMilliseconds(0, 0, 0));
    }
}
