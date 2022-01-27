package two;

import org.junit.Assert;
import org.junit.Test;

public class Task52Test {
    @Test
    public void test01() {
        Assert.assertEquals("egnarO", Task52.reg("Orange"));
    }
    @Test
    public void test02() {
        Assert.assertEquals("Invalid value", Task52.reg(""));
    }
    @Test
    public void test03() {
        Assert.assertEquals("Invalid value", Task52.reg("DS 4w d"));
    }
}
