package javaclub5.string.task62;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Sergiy Zapadenko on 27.01.2022 17:18
 */
class Task62Test {
    @Test
    void convertToCelsius() {
        assertEquals(10, Task62.convertToCelsius(50));
        assertEquals(-5, Task62.convertToCelsius(23));
    }

    @Test
    void weatherInfo() {
        assertEquals("10.0 is above freezing temperature", Task62.weatherInfo(50));
        assertEquals("-5.0 is freezing temperature", Task62.weatherInfo(23));
    }
}