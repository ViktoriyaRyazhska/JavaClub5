package test.conditions.task27;

import main.conditions.task27.Bob;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class BobTest {

    @Test
    public void testBob() {
        assertEquals("Should return 0.", 0, Bob.enough(10, 5, 5));
        assertEquals("Should return 10.", 10, Bob.enough(100, 60, 50));
        assertEquals("Should return 0.", 0, Bob.enough(20, 5, 5));
    }
}