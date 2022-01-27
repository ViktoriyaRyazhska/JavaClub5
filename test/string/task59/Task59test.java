package string.task59;

import javaclub5.string.task59.Kata;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task59test {
    @Test
    void positionTest() {
        Assertions.assertAll(() -> assertEquals("Position of alphabet: 4", Kata.position('d')),
                () -> assertEquals("Position of alphabet: 25", Kata.position('y')),
                () -> assertEquals("Position of alphabet: 11", Kata.position('k')),
                () -> assertEquals("Position of alphabet: 8", Kata.position('h')));
    }

    @Test
    void positionExceptionTest() {
        assertThrows(IllegalArgumentException.class,
                () ->Kata.position('3'));
    }
}

