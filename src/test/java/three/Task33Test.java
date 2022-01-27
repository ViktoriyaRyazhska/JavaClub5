package three;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task33Test {
    @Test
    public void one() {
        assertArrayEquals(new int[]{0, 0, 0}, Task33.humanYearsCatYearsDogYears(0));
    }

    @Test
    public void two() {
        assertArrayEquals(new int[]{1,15,15}, Task33.humanYearsCatYearsDogYears(1));
    }

    @Test
    public void three() {
        assertArrayEquals(new int[]{2,24,24}, Task33.humanYearsCatYearsDogYears(2));
    }

    @Test
    public void four() {
        assertArrayEquals(new int[]{10,56,64}, Task33.humanYearsCatYearsDogYears(10));
    }

}