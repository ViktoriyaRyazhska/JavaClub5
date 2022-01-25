package main.java.com.softserve.basicprogram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task8Test {

    @Test
    void testingCentury1() {
        int expected = 18;
        int year = Task8.century(1705);
        assertEquals(expected,year);
    }

    @Test
    void testingCentury2() {
        int expected = 1;
        int year = Task8.century(90);
        assertEquals(expected,year);
    }
    @Test
    void testingCentury3(){
        int exp = 17;
        int year = Task8.century(1601);
        assertEquals(exp, year);
    }
}