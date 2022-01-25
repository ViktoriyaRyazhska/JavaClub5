package solutions.collections;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LoopBugFixingTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void createList(int size , List expected) {
try{
    assertIterableEquals(expected,LoopBugFixing.CreateList(size));
}catch (Exception e){
    assertEquals("Negative List size",e.getMessage());
}
    }
    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(-1,new ArrayList<>()),
                Arguments.of(0, new ArrayList<>()),
                Arguments.of(5, Arrays.asList(1,2,3,4,5)),
                Arguments.of(3, Arrays.asList(1,2,3)),
                Arguments.of(7, Arrays.asList(1,2,3,4,5,6,7))
        );
    }
}