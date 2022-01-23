package test.string.task56;

import main.basicprogram.task11.GrassHopper;
import main.string.task56.PlayingBanjo;
import org.junit.Assert;
import org.junit.Test;

public class PlayingBanjoTest {
    @Test
    public void Test() {
        Assert.assertEquals( "Nope!", "Martin does not play banjo", PlayingBanjo.areYouPlayingBanjo("Martin"));
        Assert.assertEquals( "Nope!", "Rikke plays banjo", PlayingBanjo.areYouPlayingBanjo("Rikke"));
        Assert.assertEquals( "Nope! Remember lower case counts, too!", "rolf plays banjo", PlayingBanjo.areYouPlayingBanjo("rolf"));
        Assert.assertEquals( "Nope!", "bravo does not play banjo", PlayingBanjo.areYouPlayingBanjo("bravo"));

    }
}