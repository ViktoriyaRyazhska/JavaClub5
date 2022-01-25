package two;

import org.junit.Assert;
import org.junit.Test;

public class Task32Test {
    @Test
    public void test01() {
        Assert.assertEquals("", Task32.repeatStr(3, ""));
        Assert.assertEquals("121212", Task32.repeatStr(3, "12"));
        Assert.assertEquals("", Task32.repeatStr(0, "12"));
        Assert.assertEquals("12", Task32.repeatStr(1, "12"));
    }
}
