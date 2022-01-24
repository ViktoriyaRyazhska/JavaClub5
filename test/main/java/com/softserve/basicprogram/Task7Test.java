package main.java.com.softserve.basicprogram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task7Test {

    @Test
    void enterTime() {
        int expected = 61000;
        int time = Task7.enterTime(0, 1, 1);
        assertEquals(expected, time);
    }

    @Test
    void enterTime2() {
        int expected = 3661000;
        int time = Task7.enterTime(1, 1, 1);
        assertEquals(expected, time);
    }

}