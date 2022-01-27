package string.task63;

import javaclub5.string.task63.Task63;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Task63test {
    @Test
    void Task63(){
        Assertions.assertAll(()-> assertEquals("N.T",Task63.getInitials("Nestor Trush")),
                ()-> assertEquals("M.J",Task63.getInitials("Michael Jordan")));
    }
}
