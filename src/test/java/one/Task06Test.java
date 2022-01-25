package one;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task06Test {
    @Test
    public void testToBinary() {
        assertEquals(1, Task06.toBinary(1));
        assertEquals(10, Task06.toBinary(2));
        assertEquals(11, Task06.toBinary(3));
        assertEquals(101, Task06.toBinary(5));
        assertEquals(100001010, Task06.toBinary(266));
    }
}
