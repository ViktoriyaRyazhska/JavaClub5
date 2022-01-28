package conditions.task26;

import javaclub5.conditions.task26.Task26;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task26test {
    @Test
    public void testBoolToWord() {
        assertEquals(Task26.boolWorld(true),"Yes");
        assertEquals(Task26.boolWorld(false),"No");
    }
}
