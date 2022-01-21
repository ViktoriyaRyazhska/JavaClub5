package javaclub5.loops.task6;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Popova Anna
 */

public class RunnerTest {

    private int[] reverseSolution(int n) {
        int[] result = new int[n];
        for (int i = n; i > 0; i--) {
            result[n - i] = i;
        }
        return result;
    }

    @Test
    public void reverseTest() {
        Assert.assertArrayEquals(new int[]{3, 2, 1}, Runner.reverse(3));
        Assert.assertArrayEquals(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1}, Runner.reverse(9));
        Assert.assertArrayEquals(reverseSolution(100), Runner.reverse(100));
        Assert.assertArrayEquals(reverseSolution(1000), Runner.reverse(1000));
        Assert.assertArrayEquals(reverseSolution(100000), Runner.reverse(100000));
        Assert.assertArrayEquals(reverseSolution(10000000), Runner.reverse(10000000));
    }


}