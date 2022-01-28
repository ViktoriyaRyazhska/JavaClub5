package solutions.conditions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DoIGetABonusTest {

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("£100" , new DoIGetABonus(), 100, false),
                Arguments.of("£10" , new DoIGetABonus(), 1, true),
                Arguments.of("£50000" , new DoIGetABonus(), 5000, true),
                Arguments.of("£5000" , new DoIGetABonus(), 5000, false)
                );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void bonusTime(String expected, DoIGetABonus obj, int salary, boolean bonus) {
        assertEquals(expected, obj.bonusTime(salary, bonus));
    }
}