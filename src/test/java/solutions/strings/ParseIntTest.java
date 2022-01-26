package solutions.strings;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import solutions.loops.BeginnerLostWithoutMap;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ParseIntTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void howOld(String str, int expected) {
        try{
            assertEquals(expected, ParseInt.howOld(str));
        }catch (Exception e){
            assertEquals("Incorrect text",e.getMessage());
        }
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("5 years old", 5),
                Arguments.of("7 years old", 7),
                Arguments.of("12 years old", 0),
                Arguments.of("years old 5", 0)
        );
    }
}