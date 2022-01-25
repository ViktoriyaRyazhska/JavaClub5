package four;


import org.junit.Test;
import static org.junit.Assert.*;

// TODO: Replace examples and use TDD development by writing your own tests

    public class Task04Test {
        @Test
        public void fixedTests() {
            assertTrue(Task04.isDivisible(4050,27));
            assertTrue(Task04.isDivisible(10000,20));
            assertTrue(Task04.isDivisible(10005,1));
            assertFalse(Task04.isDivisible(4066,27));
            assertFalse(Task04.isDivisible(10005,2));
        }
    }

