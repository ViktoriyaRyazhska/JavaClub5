package solutions.strings;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import solutions.loops.BeginnerLostWithoutMap;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class AlternatingCaseTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void toAlternativeString(String str, String expected) {
        try{
            assertEquals(expected, AlternatingCase.toAlternativeString(str));
        }catch (Exception e){
            assertEquals("The str is null",e.getMessage());
        }
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("Hello", "hELLO"),
                Arguments.of("who are YOU", "WHO ARE you"),
                Arguments.of("ABcdK", "abCDk"),
                Arguments.of(null, null)
        );
    }
}