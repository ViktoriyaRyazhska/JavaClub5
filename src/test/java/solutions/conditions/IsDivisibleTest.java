package solutions.conditions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import solutions.basicProgram.PixelArt;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class IsDivisibleTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void isDivisible(int a, int b, int c, Boolean expected) {
        try {
            assertEquals(expected, IsDivisible.isDivisible(a, b,c));
        } catch (Exception e) {

            assertEquals("Can't be devided by 0", e.getMessage());
        }
    }


    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(4, 1,2, true),
                Arguments.of(8, 2,4, true),
                Arguments.of(3,0, 5, false),
                Arguments.of(15, 1,9, false),
                Arguments.of(10, 2,5, true)
        );
    }
}