package javaclub5.strings.task13;

import org.junit.Assert;
import org.junit.Test;

public class Task13Test {

    @Test
    public void abbrevNameTest(){
        Assert.assertEquals("S.H.", Runner.abbrevName("Sam Harris"));
        Assert.assertEquals("P.F.", Runner.abbrevName("Patrick Feenan"));
        Assert.assertEquals("E.C.", Runner.abbrevName("Evan Cole"));
        Assert.assertEquals("P.F.", Runner.abbrevName("P Favuzzi"));
        Assert.assertEquals("D.M.", Runner.abbrevName("David Mendieta"));
    }
}
