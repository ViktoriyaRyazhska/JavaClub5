package main.java.com.softserve.conditions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void getNegative() {
        int expected = -1;
        int input = Task1.opposite(1);
        assertEquals(expected,input);
    }

    @Test
    void getPositive() {
        int expected = 1;
        int input = Task1.opposite(-1);
        assertEquals(expected,input);
    }
    @Test
    void getZero() {
        int expected = 0;
        int input = Task1.opposite(0);
        assertEquals(expected,input);
    }
}