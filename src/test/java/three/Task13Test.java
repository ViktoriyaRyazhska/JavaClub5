package three;

import static org.junit.jupiter.api.Assertions.*;

class Task13Test {

    @org.junit.jupiter.api.Test
    void task13() {
        assertEquals(156, Task13.INST.plus100(56));
        assertEquals(95, Task13.INST.plus100(-5));
    }
}