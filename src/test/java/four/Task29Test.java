package four;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class Task29Test {
    @Test
    public void basicTests() {
        assertEquals("One", Task29.switchItUp(1));
        assertEquals("Three", Task29.switchItUp(3));
        assertEquals("Five", Task29.switchItUp(5));
    }
}
