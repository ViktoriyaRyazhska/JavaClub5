package javaclub5.basicprogram.task6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests of Task 6 BasicProgram
 *
 * @author Dmytro Prudius
 */


public class Task6Test {
    @Test
    public void testToBinary() {
        assertEquals(1, Runner.toBinary(1));
        assertEquals(10, Runner.toBinary(2));
        assertEquals(11, Runner.toBinary(3));
        assertEquals(101, Runner.toBinary(5));
    }
}
