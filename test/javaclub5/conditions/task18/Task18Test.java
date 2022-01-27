package javaclub5.conditions.task18;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Sergiy Zapadenko on 26.01.2022 19:02
 */
class Task18Test {

    @Test
    void oppositNumber() {
        assertEquals(-1, Task18.oppositNumber(1));
        assertEquals(-200, Task18.oppositNumber(200));
        assertEquals(200, Task18.oppositNumber(-200));
        assertEquals(0, Task18.oppositNumber(0));
    }
}