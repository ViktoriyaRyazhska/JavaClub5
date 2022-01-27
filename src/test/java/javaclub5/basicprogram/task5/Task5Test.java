package javaclub5.basicprogram.task5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests of Task 5 BasicProgram
 *
 * @author Dmytro Prudius
 */

public class Task5Test {
    @Test
    public void greetTest() {
        assertEquals("should greet some people normally", "Hello, Jim!", Runner.greet("Jim"));
        assertEquals("should greet some people normally", "Hello, Jane!", Runner.greet("Jane"));
        assertEquals("should greet some people normally", "Hello, Simon!", Runner.greet("Simon"));
        assertEquals("should greet Johnny a little bit more special", "Hello, my love!", Runner.greet("Johnny"));

    }
}
