package solutions.basicProgram;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class VolumeOfCuboidTest {



    @MethodSource("testCases")
    @ParameterizedTest
    void getVolumeOfCuboid(int a, int b, int c, int expected) {
            try {
                assertEquals(expected,  new VolumeOfCuboid().getVolumeOfCuboid(a, b,c));
            } catch (Exception e) {
                String msg = e.getMessage();
                assertEquals("Enter variables higher than 0!", msg);
            }
        }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(2, 1,5, 10),
                Arguments.of(1, 2,8, 16),
                Arguments.of(-5, 5,10, 0),
                Arguments.of(3, 1,8, 24),
                Arguments.of(3, 7,2, 42)
        );
    }

}