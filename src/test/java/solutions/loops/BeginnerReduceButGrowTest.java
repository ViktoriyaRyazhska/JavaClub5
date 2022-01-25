package solutions.loops;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import solutions.conditions.TransportationOnVacation;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BeginnerReduceButGrowTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void grow(int[] arr, int expected) {
try {
            assertEquals(expected, BeginnerReduceButGrow.grow(arr));
    }catch (Exception e){
        assertEquals("The array is null",e.getMessage());
    }
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3}, 6),
                Arguments.of(new int[]{3, 4, 5}, 60),
                Arguments.of(new int[]{}, 1),
                Arguments.of(null, 0)
        );
    }
}