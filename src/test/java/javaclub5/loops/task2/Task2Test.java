package javaclub5.loops.task2;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Task2Test {
    @Test
    public void one() {
        assertArrayEquals(new int[]{1,15,15}, Dinglemouse.humanYearsCatYearsDogYears(1));
    }

    @Test
    public void two() {
        assertArrayEquals(new int[]{2,24,24}, Dinglemouse.humanYearsCatYearsDogYears(2));
    }

    @Test
    public void ten() {
        assertArrayEquals(new int[]{10,56,64}, Dinglemouse.humanYearsCatYearsDogYears(10));
    }

}
