package javaclub5.conditions.task19;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Sergiy Zapadenko on 26.01.2022 19:30
 */
class Task19Test {

    @Test
    void isDivisible() {
        assertEquals(true, Task19.isDivisible(12,4,3));
        assertEquals(false, Task19.isDivisible(12,0,3));
        assertEquals(false, Task19.isDivisible(3,3,4));
        assertEquals(false, Task19.isDivisible(3,0,4));
    }
}