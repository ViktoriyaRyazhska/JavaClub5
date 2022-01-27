package string.task66;

import javaclub5.string.task66.Correct;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task66test {
    @Test
    void correctTest() {
        Assertions.assertAll(() ->assertEquals("CORRECT", Correct.correct("C0RRECT")),
                () ->assertEquals("SIMPLE", Correct.correct("51MPLE")),
                () ->assertEquals("SOMETHING", Correct.correct("50METH1NG")),
                () ->assertEquals("OLEG", Correct.correct("0LEG")));
    }

    @Test
    void correctExceptionTest() {
        assertThrows(NullPointerException.class,
                () ->Correct.correct(null));
    }
}
