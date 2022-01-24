package four;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class Task64Test {
    @Test
    public void testSomething() {
        assertEquals(1, Task64.strCount("Hello", 'o'));
        assertEquals(2, Task64.strCount("Hello", 'l'));
        assertEquals(0, Task64.strCount("",'z'));
    }
}
