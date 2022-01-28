package javaclub5.loops.task35;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Sergiy Zapadenko on 27.01.2022 16:17
 */
class Task35Test {

    @Test
    void valueDoubled() {
        assertArrayEquals(new int[] {2, 4, 6}, Task35.valueDoubled(new int[] {1, 2, 3}));
        assertArrayEquals(new int[] {8, 2, 2, 2, 8}, Task35.valueDoubled(new int[] {4, 1, 1, 1, 4}));
        assertArrayEquals(new int[] {2, 2, 2, 2, 2, 2}, Task35.valueDoubled(new int[] {1, 1, 1, 1, 1, 1}));
    }
}