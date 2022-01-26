package basicprogram.task5;

import javaclub5.basicprogram.task5.Task5;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task5Test {
    @Test
    void name() {
        Assertions.assertAll(() ->assertEquals("Hello, my love!", Task5.greet("Johnny")),
                             ()-> assertEquals("Hello, Sam!", Task5.greet("Sam")),
                             ()-> assertEquals("Hello, Peter!", Task5.greet("Peter")),
                             ()-> assertEquals("Hello, George!", Task5.greet("George")));
    }
}