package solutions.loops;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SumOfPositiveTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void sum(int[] arr, int expected) {
        try {
            assertEquals(expected,SumOfPositive.sum(arr));
        }catch (Exception e){
            assertEquals("The array is null",e.getMessage());
        }
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{}, 0),
                Arguments.of(new int[]{1,2,3}, 6),
                Arguments.of(new int[]{2,4,-4,-3},6),
                Arguments.of(new int[]{-3,-4,-4},0),
                Arguments.of(null,0)
        );
    }
}