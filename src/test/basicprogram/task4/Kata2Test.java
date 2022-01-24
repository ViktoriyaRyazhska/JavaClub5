package test.basicprogram.task4;

import static org.junit.Assert.*;

import main.basicprogram.task4.Kata2;
import org.junit.Test;


public class Kata2Test {


    @Test
    public void fixedTests() {
        assertTrue(Kata2.isDivisible(4050, 27));
        assertTrue(Kata2.isDivisible(10000, 20));
        assertTrue(Kata2.isDivisible(10005, 1));
        assertFalse(Kata2.isDivisible(4066, 27));
        assertFalse(Kata2.isDivisible(10005, 2));
    }
}
