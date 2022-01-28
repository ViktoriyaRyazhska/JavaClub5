package five;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class Task40Test {

    @Test
    public void testSomething() {
        assertEquals(15, Task40.sum(new int[]{1,2,3,4,5}));
        assertEquals(13, Task40.sum(new int[]{1,-2,3,4,5}));
        assertEquals(0, Task40.sum(new int[]{}));
        assertEquals(0, Task40.sum(new int[]{-1,-2,-3,-4,-5}));
        assertEquals(9, Task40.sum(new int[]{-1,2,3,4,-5}));
    }
}
