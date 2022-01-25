package solutions.basicProgram;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PixelArtTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void isDivisible(Integer a, Integer b, Boolean expected) {
        if (a <= 0 || b <= 0) {
            try {
               PixelArt.isDivisible(a, b);
            } catch (Exception e) {
                String msg = e.getMessage();
                assertEquals("Enter data greater than 0", msg);
            }
        } else {
            assertEquals(expected, PixelArt.isDivisible(a, b));
        }
    }


    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(2, 1, true),
                Arguments.of(1, 2, false),
                Arguments.of(-5, 5, true),
                Arguments.of(3, 1, true),
                Arguments.of(3, 7, false)
        );
    }
}