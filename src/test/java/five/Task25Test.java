package five;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Task25Test {
    @Test
    public void testOddAndEven() {
        assertEquals(true, Task25.isLove(1, 4));
    }

    @Test
    public void testEvenAndEven() {
        assertEquals(false, Task25.isLove(2, 2));
    }

    @Test
    public void testOddAndOdd() {
        assertEquals(false, Task25.isLove(1, 1));
    }

    @Test
    public void testEvenAndOdd() {
        assertEquals(true, Task25.isLove(0, 1));
    }

}
