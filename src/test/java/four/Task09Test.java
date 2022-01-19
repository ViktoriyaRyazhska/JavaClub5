package four;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Task09Test {
    @Test
    public void test1() {
        assertEquals(-42, Task09.makeNegative(42));
    }
}
