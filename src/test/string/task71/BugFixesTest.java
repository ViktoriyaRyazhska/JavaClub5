package test.string.task71;

import main.collections.task71.BugFixes;
import main.string.task66.CharacterRecognition;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class BugFixesTest {

    @Test
    public void Test() {

        Assert.assertEquals(Arrays.asList( 1, 3 ), BugFixes.filterOddNumber(new ArrayList<>(Arrays.asList( 1, 2, 2, 2, 4, 3, 4 ))));
        Assert.assertEquals(Arrays.asList( 1, 3, 5, 7 ), BugFixes.filterOddNumber(new ArrayList<>(Arrays.asList( 1, 3, 2, 2, 5, 7, 4 ))));
        Assert.assertEquals(Arrays.asList( 1, 9 ), BugFixes.filterOddNumber(new ArrayList<>(Arrays.asList( 1, 9, 4 ))));

    }
}