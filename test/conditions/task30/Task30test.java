package conditions.task30;


import javaclub5.conditions.task30.Task30;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task30test {
    @Test
    void Task30(){
Assertions.assertAll(()-> assertEquals("green", Task30.nextLight("red")),
        ()-> assertEquals("yellow", Task30.nextLight("green")),
        ()-> assertEquals("red", Task30.nextLight("yellow")));
    }
}
