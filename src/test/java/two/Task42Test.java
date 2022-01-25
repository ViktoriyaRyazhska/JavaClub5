package two;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Task42Test {
    @Test
    public void test01() {
        Assert.assertEquals(0, Task42.Older(6,3));
        Assert.assertEquals(-15, Task42.Older(45,30));
        Assert.assertEquals(16, Task42.Older(30,7));
        Assert.assertEquals(0, Task42.Older(0,0));
    }
}