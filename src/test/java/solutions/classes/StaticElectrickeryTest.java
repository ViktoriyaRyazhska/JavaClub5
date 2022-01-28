package solutions.classes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StaticElectrickeryTest {

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(120, new StaticElectrickery(), 20),
                Arguments.of(0, new StaticElectrickery(), -100),
                Arguments.of(1099, new StaticElectrickery(), 999)

                );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void plus100(
            int expected,  StaticElectrickery obj, int num
    ) {
        assertEquals(expected, obj.plus100(num));
    }
}