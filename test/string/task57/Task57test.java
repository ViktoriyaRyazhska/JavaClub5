package string.task57;

import javaclub5.string.task57.Kata;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task57test {
    @Test
    void noSpaceTest() {
        Assertions.assertAll(() ->assertEquals("piiii", Kata.noSpace("p i i i i")),
                () ->assertEquals("redchilipepper", Kata.noSpace("red chili pepper")),
                () ->assertEquals("cuberectangle", Kata.noSpace("cube rectangle")),
                () ->assertEquals("permonth", Kata.noSpace("per month")));
    }
}
