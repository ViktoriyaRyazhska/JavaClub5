package solutions.oop.Leetspeak;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
class LeetSpeakTest {

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("133tsp34k", new LeetSpeak(), "Leetspeak"),
                Arguments.of("/^^\\30W", new LeetSpeak(), "MEOW"),
                Arguments.of("4sdf;1kjqw3rp0i(_)zxcv/.,/^^\\", new LeetSpeak(), "asdf;lkjqwerpoiuzxcv/.,m"),
                Arguments.of("", new LeetSpeak(), "")

                );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void encode(String expected, LeetSpeak obj, String str) {
        assertEquals(expected, obj.encode(str));
    }
}