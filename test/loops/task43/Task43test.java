package loops.task43;

import javaclub5.loops.task43.CodeWarsMath;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task43test {
    @Test
    void nearestSqTest() {
        Assertions.assertAll(() ->assertEquals(4, CodeWarsMath.nearestSq(5)),
                () ->assertEquals(81, CodeWarsMath.nearestSq(78)),
                () ->assertEquals(9, CodeWarsMath.nearestSq(8)),
                () ->assertEquals(100, CodeWarsMath.nearestSq(99)));
    }

    @Test
    void nearestSqExceptionTest() {
        assertThrows(IllegalArgumentException.class,
                ()->CodeWarsMath.nearestSq(-4));
    }
}
