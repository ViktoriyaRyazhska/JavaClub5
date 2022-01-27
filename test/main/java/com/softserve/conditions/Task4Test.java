package main.java.com.softserve.conditions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void getBonus() {
        String expected = "£12340";
        assertEquals(expected,Task4.bonusTime(1234,Task4.isBool(1)));
    }
    @Test
    void noBonus() {
        String expected = "£1234";
        assertEquals(expected,Task4.bonusTime(1234,Task4.isBool(2)));
    }

}