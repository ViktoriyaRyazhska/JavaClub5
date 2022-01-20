package test.loops.task40;

import Task70.loops.task40.Positive;
import org.junit.Test;

import static org.junit.Assert.*;

public class PositiveTest {

    @Test
    public void testSomething() {
        assertEquals(15, Positive.sum(new int[]{1, 2, 3, 4, 5}));
        assertEquals(13, Positive.sum(new int[]{1, -2, 3, 4, 5}));
        assertEquals(0, Positive.sum(new int[]{}));
        assertEquals(0, Positive.sum(new int[]{-1, -2, -3, -4, -5}));
        assertEquals(9, Positive.sum(new int[]{-1, 2, 3, 4, -5}));
    }
}