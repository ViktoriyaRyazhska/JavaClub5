package solutions.conditions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import solutions.basicProgram.CenturyToYear;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciModuloTest {


    @ParameterizedTest
    @MethodSource("testCases")
    void fib(int expected, int fib) {
        try{
            assertEquals(expected, FibonacciModulo.fib(fib));
        }catch (Exception e){
            assertEquals("Enter number greater than 3!",e.getMessage());
        }
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(2, 20),
                Arguments.of(2, 148),
                Arguments.of(2, 111),
                Arguments.of(2, 118),
                Arguments.of(0, 41),
                Arguments.of(0, 85),
                Arguments.of(0, 117),
                Arguments.of(1, 82),
                Arguments.of(1, 72),
                Arguments.of(1, 5101394),
                Arguments.of(1, 163),
                Arguments.of(1, 2),
                Arguments.of(1, 90)
        );
    }
}