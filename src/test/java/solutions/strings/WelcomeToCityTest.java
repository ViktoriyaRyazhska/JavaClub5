package solutions.strings;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import solutions.conditions.WillBeEnoughSpace;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class WelcomeToCityTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void sayHello(String[] name, String city, String state,String expected) {
        try {
            assertEquals(expected, new WelcomeToCity().sayHello(name, city,state));
        } catch (Exception e) {

            assertEquals("The array is null", e.getMessage());
        }

    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new String[]{"John", "Smith"}, "Phoenix", "Arizona", "Hello, John Smith! Welcome to Phoenix, Arizona!"),
                Arguments.of(null, "LV", "Arizona", null),
                Arguments.of(new String[]{"Taras", "Matviiv"}, "Lviv", "Ukraine", "Hello, Taras Matviiv! Welcome to Lviv, Ukraine!")
        );
    }
}