package basicprogram.task7;

import javaclub5.basicprogram.task7.Task7;
import org.junit.jupiter.api.Test;

import java.time.Clock;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {

    @Test
    void clock() {
        assertEquals(61000, Task7.clock(0,1,1));
    }
}