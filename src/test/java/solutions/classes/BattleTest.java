package solutions.classes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BattleTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void declareWinner(Fighter f1,Fighter f2,String attacker,String expected) {
        assertEquals(expected,Battle.declareWinner(f1,f2,attacker));
    }
    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new Fighter("a",10,2), new Fighter("b",10,2),"a","The winner is fighter a"),
                Arguments.of(new Fighter("a",10,2), new Fighter("b",10,2),"b","The winner is fighter b"),
                Arguments.of(new Fighter("a",10,2), new Fighter("b",10,2),"c","First attacker name is nor correct"),
                Arguments.of(new Fighter("a",20,5), new Fighter("b",10,2),"b","The winner is fighter a"),
                Arguments.of(new Fighter("a",10,2), new Fighter("b",20,2),"b","The winner is fighter b")

        );
    }
}