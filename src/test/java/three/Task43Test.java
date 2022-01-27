package three;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task43Test {

    @Test
    void task43() {
        assertEquals(0, Task43.nearestSq(0));
        assertEquals(1, Task43.nearestSq(1));
        assertEquals(1, Task43.nearestSq(2));
        assertEquals(9, Task43.nearestSq(10));
        assertEquals(121, Task43.nearestSq(111));
        assertEquals(10000, Task43.nearestSq(9999));
    }
}