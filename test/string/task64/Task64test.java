package string.task64;

import javaclub5.string.task64.Task64;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task64test {
    @Test
    void Task64(){
        Assertions.assertAll(()-> assertEquals(2, Task64.strCount("Hello", "l")),
                ()-> assertEquals(2, Task64.strCount("queue", "e")));
    }
}
