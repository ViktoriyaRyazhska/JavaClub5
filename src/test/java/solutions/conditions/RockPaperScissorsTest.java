package solutions.conditions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import solutions.basicProgram.VolumeOfCuboid;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RockPaperScissorsTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void rps(String one, String two, String expected) {

        try {
            assertEquals(expected,  RockPaperScissors.rps(one, two));
        } catch (Exception e) {
            String msg = e.getMessage();
            assertEquals("Enter correct sentence", msg);
        }

    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("rock", "scissors", "Player 1 won!"),
                Arguments.of("rock", "paper", "Player 2 won!"),
                Arguments.of("ndknj", "paper", " "),
                Arguments.of("paper", "rock","Player 1 won!"),
                Arguments.of("scissors", "paper","Player 1 won!")
        );
    }
}