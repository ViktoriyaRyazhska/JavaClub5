package solutions.collections;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import solutions.loops.BeginnerLostWithoutMap;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FilteringBugFixingTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void filterOddNumber(List<Integer> listOfNumbers, List<Integer> expected) {
        try{
            assertEquals(expected, FilteringBugFixing.filterOddNumber(listOfNumbers));
        }catch (Exception e){
            assertEquals("The list is null",e.getMessage());
        }
    }

    static Stream<Arguments> testCases() {
        List<Integer> listOfNumbers = new LinkedList<>(Arrays.asList(1, 2, 2, 2, 4, 3, 4, 5, 6, 7));
        List<Integer> expectedResult = new LinkedList<>(Arrays.asList(1, 3, 5, 7));

        List<Integer> listOfNumbers2 = new LinkedList<>(Arrays.asList(4,6,3,8,9,11));
        List<Integer> expectedResult2 = new LinkedList<>(Arrays.asList(3, 9, 11));
        return Stream.of(
                Arguments.of(listOfNumbers, expectedResult),
                Arguments.of(listOfNumbers2, expectedResult2),
                Arguments.of(null,null)
        );
    }
}