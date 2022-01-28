package solutions.loops;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CatDogYearsTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void humanYearsCatYearsDogYears(int[] expected, CatDogYears obj, int humanYear) {
        assertArrayEquals(expected, obj.humanYearsCatYearsDogYears(humanYear));
    }

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{1, 15, 15}, new CatDogYears(), 1),
                Arguments.of(new int[]{2, 24, 24}, new CatDogYears(), 2),
                Arguments.of(new int[]{10, 56, 64}, new CatDogYears(), 10)

                );
    }
}