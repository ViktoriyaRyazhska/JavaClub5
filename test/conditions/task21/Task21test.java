package conditions.task21;

import javaclub5.conditions.task21.Kata;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task21test {
    @Test
    void BonusTimeTest() {
        Assertions.assertAll(() ->assertEquals("\u00A3"+"1000", Kata.bonusTime(1000, false)),
        () ->assertEquals("\u00A3"+"5000", Kata.bonusTime(500, true)),
        () ->assertEquals("\u00A3"+"50", Kata.bonusTime(5, true)),
        () ->assertEquals("\u00A3"+"1", Kata.bonusTime(1, false)));
    }
}
