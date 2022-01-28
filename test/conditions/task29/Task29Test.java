package conditions.task29;

import javaclub5.conditions.task29.Task29;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task29Test {
    @Test
    public void basicTests() {
        assertEquals("One", Task29.task29(1));
        assertEquals("Three", Task29.task29(3));
        assertEquals("Five", Task29.task29(5));
    }
}
