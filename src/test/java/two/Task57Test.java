package two;

import org.junit.Assert;
import org.junit.Test;

public class Task57Test {
    @Test
    public void test01() {
        Assert.assertEquals("Orange", Task57.reg("Orange"));
    }
    @Test
    public void test02() {
        Assert.assertEquals("", Task57.reg(""));
    }
    @Test
    public void test03() {
        Assert.assertEquals("DS4wd", Task57.reg("DS 4w d"));
    }
    @Test
    public void test04() {
        Assert.assertEquals("Longstringwithmultiplespaces",
                Task57.reg("Long    string with multiple      spaces"));
    }

}
