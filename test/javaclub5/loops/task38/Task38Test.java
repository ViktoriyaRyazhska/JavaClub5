package javaclub5.loops.task38;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class Task38Test {
    @Test
    public void betterThanAverageTest() {
//        assertEquals(true, Task38.average(new int[]{2, 3}, 5));
//        assertEquals(true, Task38.average(new int[]{100, 40, 34, 57, 29, 72, 57, 88}, 75));
//        assertEquals(true, Task38.average(new int[]{12, 23, 34, 45, 56, 67, 78, 89, 90}, 69));
//        assertEquals(false, Task38.average(new int[]{100, 90}, 11));


        Assertions.assertAll(() -> assertEquals(true, Task38.average(7.9f, new float[]{4, 5, 6, 7, 8})),
                () -> assertEquals(false, Task38.average(5, new float[]{9, 10, 11})));

    }
}