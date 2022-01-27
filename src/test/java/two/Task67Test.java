package two;

import org.junit.Assert;
import org.junit.Test;

public class Task67Test {
    @Test
    public void test01() {
        Assert.assertEquals("Some text", Task67.Reg("sOME TEXT"));
    }
    @Test
    public void test02() {
        Assert.assertEquals("LOWER CASE", Task67.Reg("lower case"));
    }
    @Test
    public void test03() {
        Assert.assertEquals("upper case", Task67.Reg("UPPER CASE"));
    }
    @Test
    public void test04() {
        Assert.assertEquals("MiXeD tEXt", Task67.Reg("mIxEd TexT"));
    }
    @Test
    public void test05() {
        Assert.assertEquals("   ", Task67.Reg("   "));
    }
    @Test
    public void test06() {
        Assert.assertEquals("", Task67.Reg(""));
    }
    @Test
    public void test07() {
        Assert.assertEquals("123", Task67.Reg("123"));
    }
}
