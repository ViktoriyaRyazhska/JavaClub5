package string.task51;

import javaclub5.string.task51.Task51;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Task51test {
    @Test
    public void tests() {
        assertEquals("67", Task51.convertedNum(67));
        assertEquals("123", Task51.convertedNum(123));
        assertEquals("999", Task51.convertedNum(999));
    }
}
