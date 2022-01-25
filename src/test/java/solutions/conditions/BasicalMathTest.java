package solutions.conditions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import solutions.basicProgram.CenturyToYear;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BasicalMathTest {


    @ParameterizedTest
    @MethodSource("testCases")
    void basicMath(String operation, int a, int b, int expected) {
        try {
            assertEquals(expected, BasicalMath.basicMath(operation, a, b));
        } catch (ArithmeticException e) {
            assertEquals("Can't be divided by 0", e.getMessage());
        } catch (IllegalArgumentException e) {
            assertEquals("Unknown symbol", e.getMessage());
        }
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("+", 1, 2, 3),
                Arguments.of("-", 3, 1, 2),
                Arguments.of("/", 19, 2, 9),
                Arguments.of("/", 10, 0, 0),
                Arguments.of("*", 1, 3, 3),
                Arguments.of(".", 1, 3, 3)
        );
    }
}