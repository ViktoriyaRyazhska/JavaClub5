package solutions.strings;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import solutions.oop.Leetspeak.LeetSpeak;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
class AbbreviateATwoWordNameTest {

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("M.A", new AbbreviateATwoWordName(), "Mark Avrelij"),
                Arguments.of("O.O", new AbbreviateATwoWordName(), "Olexandra Osavalchuk"),
                Arguments.of("T.T", new AbbreviateATwoWordName(), "taras tarasovich"),
                Arguments.of("", new AbbreviateATwoWordName(), " taras tarasovich  ")


        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void abbrevName(String expected, AbbreviateATwoWordName obj, String str) {
        try{
            assertEquals(expected, obj.abbrevName(str));

        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Format should be 'name surname'");
        }
        ;
    }
}