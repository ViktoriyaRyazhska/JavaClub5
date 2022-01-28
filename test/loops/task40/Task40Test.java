package loops.task40;

import javaclub5.loops.task40.Task40;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task40Test {
    @Test
    public void testSomething() {
        assertEquals(15, Task40.reverse(new int[]{1,2,3,4,5}));
        assertEquals(13, Task40.reverse(new int[]{1,-2,3,4,5}));
        assertEquals(0, Task40.reverse(new int[]{}));
        assertEquals(0, Task40.reverse(new int[]{-1,-2,-3,-4,-5}));
        assertEquals(9, Task40.reverse(new int[]{-1,2,3,4,-5}));
    }
}
