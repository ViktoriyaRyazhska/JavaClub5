package main.java.com.softserve.conditions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task9Test {

    @Test
    void boolToWordYes() {
        String expected = "Yes";
        String yes = Task9.isBool(true);
        assertEquals(expected,yes);
    }
    @Test
    void boolToWordNo(){
        String expected = "No";
        String no = Task9.isBool(false);
        assertEquals(expected,no);
    }
}