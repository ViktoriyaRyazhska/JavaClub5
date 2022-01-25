package main.java.com.softserve.basicprogram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task9Test {

    @Test
    void positiveToNegative() {
        int expected = -42;
        int number = Task9.makeNegative(42);
        assertEquals(expected,number);
    }
    @Test
    void negativeToNegative(){
        int expected = -5;
        int number = Task9.makeNegative(-5);
        assertEquals(expected,number);
    }
    @Test
    void zeroToNegative(){
        int expected = 0;
        int number = Task9.makeNegative(0);
        assertEquals(expected,number);
    }
}