package javaclub5.loops.task33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Sergiy Zapadenko on 26.01.2022 22:09
 */
class Task33Test {

    @Test
    void humanYearsCatYearsDogYears() {
        assertArrayEquals(new int[]{1,15,15}, Task33.humanYearsCatYearsDogYears(1));
        assertArrayEquals(new int[]{2,24,24}, Task33.humanYearsCatYearsDogYears(2));
        assertArrayEquals(new int[]{3,28,29}, Task33.humanYearsCatYearsDogYears(3));
        assertArrayEquals(new int[]{4,32,34}, Task33.humanYearsCatYearsDogYears(4));
        assertArrayEquals(new int[]{5,36,39}, Task33.humanYearsCatYearsDogYears(5));
        assertArrayEquals(new int[]{6,40,44}, Task33.humanYearsCatYearsDogYears(6));
        assertArrayEquals(new int[]{10,56,64}, Task33.humanYearsCatYearsDogYears(10));
    }
}