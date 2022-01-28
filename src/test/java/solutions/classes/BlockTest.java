package solutions.classes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BlockTest {


    @ParameterizedTest
    @MethodSource("testCasesForVolume")
    void getVolume(Block block, int expected){
        assertEquals(expected, block.getVolume());
    }

    @ParameterizedTest
    @MethodSource("testCasesForSurface")
    void getSurfaceArea(Block block, int expected){
        assertEquals(expected, block.getSurfaceArea());
    }

    static Stream<Arguments> testCasesForVolume() {
        return Stream.of(
                Arguments.of(new Block(new int[]{1, 2, 3}), 6),
                Arguments.of(new Block(new int[]{5, 2, 5}), 50),
                Arguments.of(new Block(new int[]{1, 1, 1}), 1)
        );
    }

    static Stream<Arguments> testCasesForSurface() {
        return Stream.of(
                Arguments.of(new Block(new int[]{1, 2, 3}), 22),
                Arguments.of(new Block(new int[]{5, 2, 5}), 90),
                Arguments.of(new Block(new int[]{1, 1, 1}), 6)
        );
    }
}