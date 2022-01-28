package basicprogram.task2;

import javaclub5.basicprogram.task2.Task2;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task2Test {
    @Test
    public void sampleTest() {
        assertEquals(4, Task2.multiply(2, 2));
        assertEquals(10, Task2.multiply(5, 2));
        assertEquals(100, Task2.multiply(100, 1));
        assertEquals(0, Task2.multiply(0, 1000));
    }
}
