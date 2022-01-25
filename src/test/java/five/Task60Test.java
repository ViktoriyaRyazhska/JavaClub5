package five;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task60Test {

    @Test
    public void testSomething() {
        assertEquals("01011110001100111", Task60.fakeBin("45385593107843568"));
        assertEquals("101000111101101", Task60.fakeBin("509321967506747"));
        assertEquals("011011110000101010000011011", Task60.fakeBin("366058562030849490134388085"));
    }
}