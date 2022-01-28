package solutions.conditions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class OppositesAttractTest {

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(true, new OppositesAttract(), 1, 2),
                Arguments.of(true, new OppositesAttract(), 2, 3),
                Arguments.of(false, new OppositesAttract(), 2, 2),
                Arguments.of(false, new OppositesAttract(), 3, 3)
                );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void isLove(boolean expected, OppositesAttract obj, int flower1, int flower2) {
        assertEquals(expected, obj.isLove(flower1, flower2));
    }
}