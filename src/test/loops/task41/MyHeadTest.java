package test.loops.task41;

import main.basicprogram.task1.CodeFast;
import main.loops.task41.MyHead;
import org.junit.Assert;
import org.junit.Test;

public class MyHeadTest {

    @Test
    public void Test() {
        Assert.assertArrayEquals(new String[]{ "1", "2", "3" }, MyHead.fixTheMeerkat(new String[]{ "3", "2", "1" }));
        Assert.assertArrayEquals(new String[]{ "head", "body", "tail" }, MyHead.fixTheMeerkat(new String[]{ "tail", "body", "head" }));
        Assert.assertArrayEquals(new String[]{ "sky", "rainbow", "ground" }, MyHead.fixTheMeerkat(new String[]{ "ground", "rainbow", "sky" }));

    }
}