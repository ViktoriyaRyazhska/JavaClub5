package solutions.conditions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class WillBeEnoughSpaceTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void enough(int cap, int on, int wait, int expected) {
        try {
            assertEquals(expected, WillBeEnoughSpace.enough(cap, on,wait));
        } catch (Exception e) {

            assertEquals("On cant be greater then cap", e.getMessage());
        }
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(10, 5,5, 0),
                Arguments.of(100, 60,50, 10),
                Arguments.of(50,30, 22, 2),
                Arguments.of(20, 30,9, -10),
                Arguments.of(10, 2,5, 0)
        );
    }
}