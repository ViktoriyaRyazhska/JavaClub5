package solutions.loops;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SheepCounterTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void counter(Boolean[] arr , int expected) {
        try {
            assertEquals(expected,SheepCounter.counter(arr));
        }catch (Exception e){
            assertEquals("The array is null",e.getMessage());
        }
    }
    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new Boolean[]{true,true,false,false,true}, 3),
                Arguments.of(new Boolean[]{true,true,false,false,false}, 2),
                Arguments.of(new Boolean[]{false,false,false,false,false}, 0),
                Arguments.of(new Boolean[]{false,false,false,false,true}, 1),
                Arguments.of(new Boolean[]{true,true,true,true,true}, 5),
                Arguments.of(null, 5),
                Arguments.of(new Boolean[]{}, 0)


        );
    }
}