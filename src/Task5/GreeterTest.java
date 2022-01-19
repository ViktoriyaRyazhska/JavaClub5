package Task5;

import org.junit.Test;
import static org.junit.Assert.*;

public class GreeterTest {
        @Test
        public void Test() {
            assertEquals("should greet some people normally", "Hello, Jim!", Greeter.greet("Jim"));
            assertEquals("should greet some people normally", "Hello, Jane!", Greeter.greet("Jane"));
            assertEquals("should greet some people normally", "Hello, Simon!", Greeter.greet("Simon"));
            assertEquals("should greet Johnny a little bit more special", "Hello, my love!", Greeter.greet("Johnny"));
        }
}