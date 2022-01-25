package solutions.basicProgram;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CenturyToYearTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void century(int century,int expected) {
    assertEquals(expected,CenturyToYear.century(century));
    }
    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(-100, -1),
                Arguments.of(100, 1),
                Arguments.of(1488, 15),
                Arguments.of(2022, 21),
                Arguments.of(1223, 13)
        );
    }
}