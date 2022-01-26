package main.java.com.softserve.conditions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void isDivisible() {
        boolean expected = true;
        boolean input = Task2.isDivisible(20,4,5);
      assertEquals(expected,input);

    }
    @Test
    void isNotDivisible() {
        boolean expected = false;
        boolean input = Task2.isDivisible(-20,4,5);
        assertEquals(expected,input);
    }
    @Test
    void isNotDivisible2() {
        boolean expected = false;
        boolean input = Task2.isDivisible(0,4,5);
        assertEquals(expected,input);
    }
}