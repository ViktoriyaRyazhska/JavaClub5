package five;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task05Test {

    @Test
    public void Test() {
        assertEquals( "Hello, Jim!", Task05.greet("Jim"), "should greet some people normally");
        assertEquals("Hello, Jane!", Task05.greet("Jane" ), "should greet some people normally");
        assertEquals("Hello, Simon!", Task05.greet("Simon"), "should greet some people normally");
        assertEquals( "Hello, my love!", Task05.greet("Johnny"), "should greet Johnny a little bit more special");
    }
}