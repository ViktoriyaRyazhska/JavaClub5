package solutions.strings;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FindThePositionTest {

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("Position of alphabet: 1", new FindThePosition(), "a"),
                Arguments.of("Position of alphabet: 2", new FindThePosition(), "b"),
                Arguments.of("Position of alphabet: 26", new FindThePosition(), "z"),
                Arguments.of("Wrong Input", new FindThePosition(), "6")



                );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void position(String expected, FindThePosition obj, char c) {
            assertEquals(expected, obj.position(c));
    }
}