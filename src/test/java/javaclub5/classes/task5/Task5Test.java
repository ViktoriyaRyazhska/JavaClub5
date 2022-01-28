package javaclub5.classes.task5;

import org.junit.Test;

import static javaclub5.classes.task5.Runner.declareWinner;
import static org.junit.Assert.assertEquals;

public class Task5Test {
    @Test
    public void basicTests() {
        assertEquals("Lew", declareWinner(new Runner("Lew", 10, 2),new Runner("Harry", 5, 4), "Lew"));
        assertEquals("Harry", declareWinner(new Runner("Lew", 10, 2),new Runner("Harry", 5, 4), "Harry"));
        assertEquals("Harald", declareWinner(new Runner("Harald", 20, 5), new Runner("Harry", 5, 4), "Harry"));
        assertEquals("Harald", declareWinner(new Runner("Harald", 20, 5), new Runner("Harry", 5, 4), "Harald"));
        assertEquals("Harald", declareWinner(new Runner("Jerry", 30, 3), new Runner("Harald", 20, 5), "Jerry"));
        assertEquals("Harald", declareWinner(new Runner("Jerry", 30, 3), new Runner("Harald", 20, 5), "Harald"));
    }
}
