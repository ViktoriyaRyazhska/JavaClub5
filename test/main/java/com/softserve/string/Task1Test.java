package main.java.com.softserve.string;

import main.java.com.softserve.basicprogram.Task8;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void numberToString1() {
        String expected = "123";
        String number = Task1.numberToString(123);
        assertEquals(expected, number);
    }

    @Test
    void numberToString2() {
        String expected = "-105050123";
        String number = Task1.numberToString(-105050123);
        assertEquals(expected, number);
    }

}



