package basicprogram.task3;

import javaclub5.basicprogram.task3.Task3;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

class Task3Test {
    private static final double delta = 0.0001;


    @Test
    public void examples() {
        // assertEquals("expected", "actual");
        assertEquals(4, Task3.CubeVolume(1, 2, 2), delta);
        assertEquals(63, Task3.CubeVolume(6.3f, 2, 5), delta);
    }

}