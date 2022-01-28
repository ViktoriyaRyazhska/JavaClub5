package solutions.basicProgram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JennysSecretMessageTest {

    @Test
    void greet() {
        JennysSecretMessage greeter = new JennysSecretMessage();
        assertEquals("Hello, Jim!", greeter.greet("Jim"));
        assertEquals("Hello, Jane!", greeter.greet("Jane"));
        assertEquals("Hello, Simon!", greeter.greet("Simon"));
        assertEquals("Hello, my love!", greeter.greet("Johnny"));
    }
}