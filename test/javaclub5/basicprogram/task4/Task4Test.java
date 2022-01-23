package javaclub5.basicprogram.task4;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    public class SolutionTest {
        @Test
        public void fixedTests() {
            assertTrue(Task4.isDivisible(4050,27));
            assertTrue(Task4.isDivisible(10000,20));
            assertTrue(Task4.isDivisible(10005,1));
            assertFalse(Task4.isDivisible(4066,27));
            assertFalse(Task4.isDivisible(10005,2));
        }
    }

}