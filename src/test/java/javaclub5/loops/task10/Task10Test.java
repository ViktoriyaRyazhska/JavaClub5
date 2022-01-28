package javaclub5.loops.task10;

import org.junit.Assert;
import org.junit.Test;

public class Task10Test {

    @Test
    public void fisTheMeerkatTestA(){
        Assert.assertEquals(new String[]{ "head", "body", "tail" },
                Runner.fixTheMeerkat(new String[]{ "tail", "body", "head" }));
    }

    @Test
    public void fisTheMeerkatTestB(){
        Assert.assertEquals(new String[]{ "heads", "body", "tails" },
                Runner.fixTheMeerkat(new String[]{ "tails", "body", "heads" }));
    }

    @Test
    public void fisTheMeerkatTestC(){
        Assert.assertEquals(new String[]{ "top", "middle", "bottom" },
                Runner.fixTheMeerkat(new String[]{ "bottom", "middle", "top" }));
    }

}
