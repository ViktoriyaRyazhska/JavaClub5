package solutions.strings;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import solutions.loops.BeginnerLostWithoutMap;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RemoveSpacesTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void noSpace(final String str, String expected) {
        try{
            assertEquals(expected, RemoveSpaces.noSpace(str));
        }catch (Exception e){
            assertEquals("The array is null",e.getMessage());
        }
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("Hello world", "Helloworld"),
                Arguments.of("How are you?", "Howareyou?"),
                Arguments.of("My name is Taras", "MynameisTaras"),
                Arguments.of(null, null)
        );
    }


}