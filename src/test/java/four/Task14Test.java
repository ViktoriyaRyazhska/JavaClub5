package four;
import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

public class Task14Test {
    @Test
    public void T1_GeneralTests() {

        Assert.assertEquals(new Task14(37, 40), new Task14(1, 8).add(new Task14(4, 5)));
        Assert.assertEquals(new Task14(1, 1), new Task14(1, 4).add(new Task14(3, 4)));
        Assert.assertEquals(new Task14(863483, 416760), new Task14(911, 920).add(new Task14(980, 906)));
        Assert.assertEquals(new Task14(838923, 926885), new Task14(610, 941).add(new Task14(253, 985)));
        Assert.assertEquals(new Task14(16880, 3591), new Task14(956, 798).add(new Task14(662, 189)));
        Assert.assertEquals(new Task14(1011239, 417585), new Task14(694, 485).add(new Task14(853, 861)));
        Assert.assertEquals(new Task14(191737, 20757), new Task14(982, 111).add(new Task14(219, 561)));
        Assert.assertEquals(new Task14(41201, 23571), new Task14(344, 873).add(new Task14(658, 486)));
        Assert.assertEquals(new Task14(184563, 68951), new Task14(662, 361).add(new Task14(322, 382)));
        Assert.assertEquals(new Task14(33926, 23577), new Task14(740, 813).add(new Task14(184, 348)));
        Assert.assertEquals(new Task14(78524, 39543), new Task14(579, 441).add(new Task14(543, 807)));
        Assert.assertEquals(new Task14(83997, 283910), new Task14(212, 979).add(new Task14(46, 580)));
    }

    @Test
    public void T2_ReductionTests() {

        Assert.assertEquals(new Task14(1, 2), new Task14(4, 8));
        Assert.assertEquals(new Task14(2, 3), new Task14(10, 15));
        Assert.assertEquals(new Task14(4, 9), new Task14(24, 54));
    }

    @Test
    public void T3_ToStringTests() {

        Assert.assertEquals("4/5", (new Task14(2, 5).add(new Task14(2, 5))).toString());
        Assert.assertEquals("5/6", (new Task14(2, 4).add(new Task14(1, 3))).toString());
        Assert.assertEquals("13/15", (new Task14(1, 5).add(new Task14(4, 6))).toString());
    }
}


