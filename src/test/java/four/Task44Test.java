package four;
import java.util.Random;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Task44Test {
    @Test
    public void test1() {
        assertEquals(1, Task44.summation(1));
    }
    @Test
    public void test2() {
        assertEquals(36, Task44.summation(8));
    }
}
