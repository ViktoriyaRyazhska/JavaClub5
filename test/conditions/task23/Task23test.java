package conditions.task23;

import javaclub5.conditions.task23.Kata;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task23test {
    @Test
    void name() {
        Assertions.assertAll(() ->assertEquals("Player 1 won!", Kata.rps("scissors","paper")),
                () ->assertEquals("Player 2 won!", Kata.rps("paper","scissors")),
                () ->assertEquals("Draw!", Kata.rps("paper","paper")),
                () ->assertEquals("Player 1 won!", Kata.rps("paper","rock")));
    }
}
