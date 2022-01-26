package three;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task08Test {

    @Test
    void task08() {
        assertEquals(21, Task08.century(2100));
        assertEquals(19, Task08.century(1900));
        assertEquals(18, Task08.century(1701));
        assertEquals(20, Task08.century(2000));
        assertEquals(2,  Task08.century(165));
    }
}