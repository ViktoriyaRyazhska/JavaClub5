package javaclub5.strings.task14;

import org.junit.Assert;
import org.junit.Test;

public class Task14Test {

    @Test
    public void strCountTest(){
        Assert.assertEquals(1, Runner.strCount("Hello", 'o'));
        Assert.assertEquals(2, Runner.strCount("Hello", 'l'));
        Assert.assertEquals(0, Runner.strCount("",'z'));
    }
}
