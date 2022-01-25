package solutions.strings;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TripleTrouble2Test {

    @ParameterizedTest
    @MethodSource("testCases")
    void tripleTrouble(String a,String b, String c, String expected) {
    try{
        assertEquals(expected,TripleTrouble2.tripleTrouble(a,b,c));
    }catch (Exception e){
        assertEquals("All strings must be the same size",e.getMessage());
    }
    }
    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("abc", "abc","abc", "aaabbbccc"),
                Arguments.of("this", "test", "lock","ttlheoiscstk"),
                Arguments.of("aa","bb","cc","abcabc"),
                Arguments.of("Bm", "aa", "tn","Batman"),
                Arguments.of("LLh","euo","xtr","LexLuthor"),
                Arguments.of("LLh","eeuo","xtr","LexLuthor")

        );
    }
}