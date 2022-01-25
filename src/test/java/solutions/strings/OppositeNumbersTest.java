package solutions.strings;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class OppositeNumbersTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void opposite(int a , int expected) {
        assertEquals(expected,OppositeNumbers.opposite(a));
    }
    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(2,-2 ),
                Arguments.of(1, -1),
                Arguments.of(-5, 5),
                Arguments.of(3, -3),
                Arguments.of(-4,4 )
        );
    }
}