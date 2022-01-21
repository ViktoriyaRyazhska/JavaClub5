package javaclub5.strings.task6;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Popova Anna
 */
public class RunnerTest {

    @Test
    public void PeopleThatPlayBanjo() {
        Assert.assertEquals("Nope!", "Kate does not play banjo", Runner.areYouPlayingBanjo("Kate"));
        Assert.assertEquals("Nope!", "Ralf plays banjo", Runner.areYouPlayingBanjo("Ralf"));
        Assert.assertEquals("Nope! Remember lower case counts, too!", "rick plays banjo", Runner.areYouPlayingBanjo("rick"));
        Assert.assertEquals("Nope!", "Den does not play banjo", Runner.areYouPlayingBanjo("Den"));
    }

}