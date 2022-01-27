package main.java.com.softserve.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void oppositeInt() {
        int expected = 864523;
        int numberInt = Task4.oppositeInt(-864523);
        assertEquals(expected, numberInt);
    }

    @Test
    void oppositeDouble() {
        double expected = 9864.36589;
        double numberDouble = Task4.oppositeDouble(-9864.36589);
        assertEquals(expected, numberDouble);
    }

}