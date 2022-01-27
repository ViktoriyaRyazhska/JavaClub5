package loops.task32;

import javaclub5.loops.task32.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task32test {
    @Test
    void SolutionTest() {
        Assertions.assertAll(() ->assertEquals("oooo", Solution.repeatStr(4,"o")),
                () ->assertEquals("pipipi", Solution.repeatStr(3,"pi")),
                () ->assertEquals("redredredredred", Solution.repeatStr(5,"red")));
    }
    @Test
    void SolutionExceptionTest() {
        assertThrows(IllegalArgumentException.class,
                ()-> Solution.repeatStr(-3,"red"),
                ()-> Solution.repeatStr(3,""));
    }
}
