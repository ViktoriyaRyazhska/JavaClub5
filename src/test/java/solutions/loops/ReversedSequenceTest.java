package solutions.loops;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ReversedSequenceTest {

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{5,4,3,2,1}, new ReversedSequence(), 5),
                Arguments.of(new int[]{34, 33, 32, 31, 30, 29, 28, 27, 26, 25,
                        24, 23, 22, 21, 20, 19, 18, 17, 16, 15,
                        14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1}, new ReversedSequence(), 34),
                Arguments.of(new int[]{1}, new ReversedSequence(), 1)

                );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void createReversedSequence(int[] expected, ReversedSequence obj, int n) {
        assertArrayEquals(expected, obj.createReversedSequence(n));
    }
}