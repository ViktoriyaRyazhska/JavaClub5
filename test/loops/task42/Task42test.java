package loops.task42;

import javaclub5.loops.task42.Task42;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task42test {
    @Test
    void Task42(){
        Assertions.assertAll(()-> assertEquals(30,Task42.TwiceAsOld(30,0)),
                ()-> assertEquals(16, Task42.TwiceAsOld(30,7)),
                ()-> assertEquals(15, Task42.TwiceAsOld(45,30)));
    }
}
