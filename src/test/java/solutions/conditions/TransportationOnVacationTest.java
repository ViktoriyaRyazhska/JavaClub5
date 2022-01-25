package solutions.conditions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TransportationOnVacationTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void rentalCarCost(int d, int expected) {
        try {
            assertEquals(expected, TransportationOnVacation.rentalCarCost(d));
        } catch (Exception e) {

            assertEquals("Number should be bigger than", e.getMessage());
        }
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(2, 80),
                Arguments.of(1, 40),
                Arguments.of(-5,0),
                Arguments.of(5, 180),
                Arguments.of(8, 270)
        );
    }
}