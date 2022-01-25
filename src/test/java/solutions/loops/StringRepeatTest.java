package solutions.loops;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import solutions.basicProgram.CenturyToYear;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StringRepeatTest {


    @ParameterizedTest
    @MethodSource("testCases")
    void repeatStr(int count , String str, String expected) {
try{
    assertEquals(expected,StringRepeat.repeatStr(count,str));
}catch (Exception e){
    assertEquals("Repeat number must be higher",e.getMessage());
}
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(2,"Taras","TarasTaras"),
                Arguments.of(5, "A","AAAAA"),
                Arguments.of(20,"1","11111111111111111111"),
                Arguments.of(1," "," "),
                Arguments.of(-3,"","")
        );
    }
}