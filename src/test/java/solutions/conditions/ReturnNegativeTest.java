package solutions.conditions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ReturnNegativeTest {

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(-42, new ReturnNegative(),42),
                Arguments.of(-42, new ReturnNegative(),-42),
                Arguments.of(0, new ReturnNegative(),0),
                Arguments.of(-12345, new ReturnNegative(),12345)

                );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void makeNegative(int expected, ReturnNegative obj, int n) {
        assertEquals(expected, obj.makeNegative(n));
    }
}