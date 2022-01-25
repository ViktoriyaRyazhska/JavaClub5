package solutions.loops;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class GrassshoperSummationTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void summation(int n , int expected) {
        try{
            assertEquals(expected,GrassshoperSummation.summation(n));
        }catch (Exception e){
            assertEquals("The number must be greater than 0",e.getMessage());
        }
    }
    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(2, 3),
                Arguments.of(1, 1),
                Arguments.of(-5, 0),
                Arguments.of(3, 6),
                Arguments.of(5, 15)
        );
    }
}