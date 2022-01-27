package conditions.taks27;

import javaclub5.conditions.task27.Task27;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task27Test {
    @Test
    public void hiphop() {
        assertEquals("Should return 10.", 10, Task27.bus(100, 60, 50));
        assertEquals("Should return 0.", 0, Task27.bus(20, 5, 5));
        assertEquals("Should return 0.", 0, Task27.bus(10, 5, 5));
    }

}
