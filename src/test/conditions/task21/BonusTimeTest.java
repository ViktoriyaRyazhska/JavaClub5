package test.conditions.task21;


import main.conditions.task21.BonusTime;
import org.junit.Assert;
import org.junit.Test;

public class BonusTimeTest {

    @Test
    public void Test() {
        Assert.assertEquals(("£100000"), BonusTime.bonusTime(10000, true));
        Assert.assertEquals(("£20000"), BonusTime.bonusTime(2000, true));
        Assert.assertEquals(("£10000"), BonusTime.bonusTime(10000, false));
        Assert.assertEquals(("£2000"), BonusTime.bonusTime(2000, false));

    }
}
