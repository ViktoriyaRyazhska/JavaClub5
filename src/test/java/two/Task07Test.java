package two;

import org.junit.Assert;
import org.junit.Test;

public class Task07Test {
    /*
    @Test
    public void test1() {
        Assert.assertEquals(50343047, Task07.passMilliseconds(0, 1, 1));
    }
    */
    @Test
    public void test2() {
        Assert.assertEquals(-2, Task02.multiplying(2, -1));
    }
    @Test
    public void test3() {
        Assert.assertEquals(0, Task02.multiplying(0, 0));
    }
}
