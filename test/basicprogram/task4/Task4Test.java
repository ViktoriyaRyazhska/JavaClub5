package basicprogram.task4;

import javaclub5.basicprogram.task4.Task4;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task4Test {
    @Test
    public void fixedTests() {
        assertTrue(Task4.isDivisible(4050, 27));
        assertTrue(Task4.isDivisible(10000, 20));
        assertTrue(Task4.isDivisible(10005, 1));
        assertFalse(Task4.isDivisible(4066, 27));
        assertFalse(Task4.isDivisible(10005, 2));
    }

}