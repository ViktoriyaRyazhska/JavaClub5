package solutions.strings;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class NumberToStringTest {
    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("1", new NumberToString(), 1),
                Arguments.of("12", new NumberToString(), 12),
                Arguments.of("13", new NumberToString(), 13),
                Arguments.of("-232", new NumberToString(), -232),
                Arguments.of("0", new NumberToString(), 0)

        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void numToString(String expected, NumberToString obj, int i) {
        assertEquals(expected, obj.numToString(i));
    }
}