package solutions.conditions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SwitchItUpTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void intToWords(String expected, SwitchItUp obj, int num) {
        assertEquals(expected, obj.IntToWords(num));
    }

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("Zero", new SwitchItUp(), 0),
                Arguments.of("One", new SwitchItUp(), 1),
                Arguments.of("Two", new SwitchItUp(), 2),
                Arguments.of("Three", new SwitchItUp(), 3),
                Arguments.of("Four", new SwitchItUp(), 4),
                Arguments.of("Five", new SwitchItUp(), 5),
                Arguments.of("Six", new SwitchItUp(), 6),
                Arguments.of("Seven", new SwitchItUp(), 7),
                Arguments.of("Eight", new SwitchItUp(), 8),
                Arguments.of("Nine", new SwitchItUp(), 9)


                );
    }
}