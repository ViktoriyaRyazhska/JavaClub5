package solutions.basicProgram;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BeginnerSeriesNumberClockTest {
    @MethodSource("testCases")
    @ParameterizedTest
    void past(int a, int b, int c, int expected) {

            assertEquals(expected,  new BeginnerSeriesNumberClock().past(a, b,c));

    }


    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(10, 15, 55, 36955000),
                Arguments.of(0, 1,50, 110000),
                Arguments.of(1, 0,0, 3600000)

        );
    }
}