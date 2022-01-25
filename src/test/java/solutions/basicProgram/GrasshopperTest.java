package solutions.basicProgram;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class GrasshopperTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void weatherInfo(int temperature, String expected) {
        assertEquals(expected, new Grasshopper().weatherInfo(temperature));
    }


    @ParameterizedTest
    @MethodSource("testCases2")
    void convertToCelsius(int temperature,int expected) {
        assertEquals(expected, new Grasshopper().convertToCelsius(temperature));
    }



    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(-5, "-20 is freezing temperature"),
                Arguments.of(1, "-17 is freezing temperature"),
                Arguments.of(0, "-17 is freezing temperature"),
                Arguments.of(-12, "-24 is freezing temperature"),
                Arguments.of(50, "10 is above freezing temperature")
        );
    }

    static Stream<Arguments> testCases2() {
        return Stream.of(
                Arguments.of(50, 10),
                Arguments.of(40, 4),
                Arguments.of(10, -12),
                Arguments.of(-5, -20),
                Arguments.of(0, -17)
        );
    }
}