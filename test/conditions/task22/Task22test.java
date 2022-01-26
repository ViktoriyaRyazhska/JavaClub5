package conditions.task22;

import javaclub5.conditions.task22.AgeDiff;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task22test {
    @Test
    void AgeDiffTest() {
        Assertions.assertAll(() ->assertEquals("You are 96 years old.", AgeDiff.CalculateAge(2003, 2099)),
                () ->assertEquals("You are 100 years old.", AgeDiff.CalculateAge(2000, 2100)),
                () ->assertEquals( "You are 3 years old.", AgeDiff.CalculateAge(1970, 1973)),
                () ->assertEquals("You were born this very year!", AgeDiff.CalculateAge(1900, 1900)),
                () ->assertEquals("You will be born in 8 years.", AgeDiff.CalculateAge(2009, 2001)));

    }
}
