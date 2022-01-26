package three;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task28Test {

    @Test
    void task28() {
        assertEquals(2, Task28.sequence(20));
        assertEquals(2, Task28.sequence(148));
        assertEquals(2, Task28.sequence(111));
        assertEquals(2, Task28.sequence(118));
        assertEquals(0, Task28.sequence(41));
        assertEquals(0, Task28.sequence(85));
        assertEquals(0, Task28.sequence(117));
        assertEquals(1, Task28.sequence(82));
        assertEquals(1, Task28.sequence(72));
        assertEquals(1, Task28.sequence(5101394));
        assertEquals(1, Task28.sequence(163));
        assertEquals(1, Task28.sequence(90));
    }
}