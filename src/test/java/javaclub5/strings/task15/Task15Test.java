package javaclub5.strings.task15;

import org.junit.Assert;
import org.junit.Test;

public class Task15Test {

    @Test
    public void sortAndStarTest(){
        Assert.assertEquals("b***i***t***c***o***i***n", Runner.twoSort(new String[] {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}));
        Assert.assertEquals("a***r***e", Runner.twoSort(new String[] {"turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones"}));
    }
}
