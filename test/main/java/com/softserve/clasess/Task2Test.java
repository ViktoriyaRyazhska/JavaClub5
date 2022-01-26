package main.java.com.softserve.clasess;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void plus100() {
        int expected = 120;
        int input = Task2.INST.plus100(20);
        assertEquals(expected,input);
    }
    @Test
    void minus100() {
        int expected = 80;
        int input = Task2.INST.plus100(-20);
        assertEquals(expected,input);
    }
}