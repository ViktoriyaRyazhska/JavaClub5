package one;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task16Test {
    @Test
    public void basicTests() {
        assertEquals("Lew", Task16.declareWinner(new Task16.Fighter("Lew", 10, 2),
                new Task16.Fighter("Harry", 5, 4), "Lew"));
        assertEquals("Harry", Task16.declareWinner(new Task16.Fighter("Lew", 10, 2),
                new Task16.Fighter("Harry", 5, 4), "Harry"));
        assertEquals("Harald", Task16.declareWinner(new Task16.Fighter("Harald", 20, 5),
                new Task16.Fighter("Harry", 5, 4), "Harry"));
        assertEquals("Harald", Task16.declareWinner(new Task16.Fighter("Harald", 20, 5),
                new Task16.Fighter("Harry", 5, 4), "Harald"));
        assertEquals("Harald", Task16.declareWinner(new Task16.Fighter("Jerry", 30, 3),
                new Task16.Fighter("Harald", 20, 5), "Jerry"));
        assertEquals("Harald", Task16.declareWinner(new Task16.Fighter("Jerry", 30, 3),
                new Task16.Fighter("Harald", 20, 5), "Harald"));
    }

    @Test
    public void lionVsTiger() {
        assertEquals("Lion", Task16.declareWinner(new Task16.Fighter("Lion", 1000, 25),
                new Task16.Fighter("Tiger", 800, 31), "Tiger"));
    }
}
