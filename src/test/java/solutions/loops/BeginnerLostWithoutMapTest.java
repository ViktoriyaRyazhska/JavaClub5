package solutions.loops;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import solutions.conditions.FibonacciModulo;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BeginnerLostWithoutMapTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void map(int[] arr, int[] expected) {
        try{
            assertArrayEquals(expected, BeginnerLostWithoutMap.map(arr));
        }catch (Exception e){
            assertEquals("The array is null",e.getMessage());
        }
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{2, 3, 5}, new int[]{4, 6, 10}),
                Arguments.of(new int[]{0, 1, 2}, new int[]{0,2,4}),
                Arguments.of(new int[]{}, new int[]{}),
                Arguments.of(null, null),
                Arguments.of(new int[]{1, 5, 10}, new int[]{2,10,20})
        );
    }
}