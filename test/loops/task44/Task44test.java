package loops.task44;

import javaclub5.loops.task44.GrassHopper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task44test {
    @Test
    void summationExceptionTest() {
        assertThrows(IllegalArgumentException.class,
                () ->GrassHopper.summation(-7));
    }

    @Test
    void summationTest() {
        Assertions.assertAll(() ->assertEquals(6, GrassHopper.summation(3)),
                () ->assertEquals(28, GrassHopper.summation(7)),
                () ->assertEquals(55, GrassHopper.summation(10)),
                () ->assertEquals(10, GrassHopper.summation(4)));
    }
}
