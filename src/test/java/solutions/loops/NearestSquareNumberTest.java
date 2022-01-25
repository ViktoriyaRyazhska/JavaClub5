package solutions.loops;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import solutions.conditions.WillBeEnoughSpace;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class NearestSquareNumberTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void nearestSq(final int num, int expected) {
        assertEquals(expected, NearestSquareNumber.nearestSq(num));
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(120,121),
                Arguments.of(5, 4),
                Arguments.of(44, 49),
                Arguments.of(13, 16),
                Arguments.of(822, 841)
        );
    }
}