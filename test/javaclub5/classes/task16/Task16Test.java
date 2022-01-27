package javaclub5.classes.task16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Sergiy Zapadenko on 25.01.2022 20:15
 */
class Task16Test {

    @Test
    void declareWinner() {
        assertEquals("Lew", Task16.declareWinner(new Task16.Fighter("Lew", 10, 2),new Task16.Fighter("Harry", 5, 4), "Lew"));
        assertEquals("Harry", Task16.declareWinner(new Task16.Fighter("Lew", 10, 2),new Task16.Fighter("Harry", 5, 4), "Harry"));
        assertEquals("Harald", Task16.declareWinner(new Task16.Fighter("Harald", 20, 5), new Task16.Fighter("Harry", 5, 4), "Harry"));
        assertEquals("Harald", Task16.declareWinner(new Task16.Fighter("Harald", 20, 5), new Task16.Fighter("Harry", 5, 4), "Harald"));
        assertEquals("Harald", Task16.declareWinner(new Task16.Fighter("Jerry", 30, 3), new Task16.Fighter("Harald", 20, 5), "Jerry"));
        assertEquals("Harald", Task16.declareWinner(new Task16.Fighter("Jerry", 30, 3), new Task16.Fighter("Harald", 20, 5), "Harald"));
    }
}