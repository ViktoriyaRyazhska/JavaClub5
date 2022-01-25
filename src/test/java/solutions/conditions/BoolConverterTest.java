package solutions.conditions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BoolConverterTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void convert(Boolean bool, String expected) {
        assertEquals(expected, BoolConverter.convert(bool));
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(true, "true"),
                Arguments.of(false, "false")

        );
    }
}