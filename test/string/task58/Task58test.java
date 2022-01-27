package string.task58;

import javaclub5.string.task58.Kata;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task58test {
    @Test
    void tripleTroubleTest() {
        Assertions.assertAll(() ->assertEquals("ipripr",Kata.tripleTrouble("ii","pp", "rr")),
                () ->assertEquals("rhmeoadtn",Kata.tripleTrouble("red", "hot", "man")),
                () ->assertEquals("ccchhrieelsaitm",Kata.tripleTrouble("chili", "chest", "cream")),
                () ->assertEquals("ttlheoiscstk", Kata.tripleTrouble("this", "test", "lock")));
    }

    @Test
    void tripleTroubleException1Test() {
        assertThrows(IllegalArgumentException.class,
                () ->Kata.tripleTrouble("pp", "ppp", "pp"));
    }
}
