package five;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task55Test {

    @Test
    public void testSomeDots() {
        assertEquals("one-two-three", Task55.replaceDots("one.two.three"), "Sorry, try again :-(");
    }

}