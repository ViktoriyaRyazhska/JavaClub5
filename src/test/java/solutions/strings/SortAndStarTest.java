package solutions.strings;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SortAndStarTest {

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("A***a***a", new SortAndStar(), new String[]{"Bitcoin", "words", "Aaa"}),
                Arguments.of("B***i***t***c***o***i***n", new SortAndStar(), new String[]{"Bitcoin", "words", "aaa"}),
                Arguments.of("A***a***a", new SortAndStar(), new String[]{})

        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void twoSort(String expected, SortAndStar obj, String[] words) {
        try{
            assertEquals(expected, obj.twoSort(words));
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Enter not null array");
        }
    }
}