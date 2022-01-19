package basicprogramtest.task1test;

import javaclub5.basicprogram.task1.Runner;
import org.junit.Assert;
import org.junit.Test;

public class Task1Test {

    @Test
    public void doubleIntTest() {
        Runner runner = new Runner();
        Assert.assertTrue(runner.doubleInt(2) == 4);
    }
}
