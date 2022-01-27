package javaclub5.strings.task8;

import org.junit.Assert;
import org.junit.Test;

public class Task8Test {
    @Test
    public void tests() {
        Assert.assertEquals("draionmsnata",Runner.tripleTrouble("dima","rost", "anna"));
        Assert.assertEquals("abcabc", Runner.tripleTrouble("aa","bb","cc"));
    }
}
