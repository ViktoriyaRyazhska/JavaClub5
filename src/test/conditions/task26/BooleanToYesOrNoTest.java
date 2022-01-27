package test.conditions.task26;


import main.conditions.task21.BonusTime;
import main.conditions.task26.BooleanToYesOrNo;
import org.junit.Assert;
import org.junit.Test;

public class BooleanToYesOrNoTest {

    @Test
    public void Test() {
        Assert.assertEquals(BooleanToYesOrNo.boolToWord(true),"Yes");
        Assert.assertEquals(BooleanToYesOrNo.boolToWord(false),"No");

    }
}