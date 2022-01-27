package loops.task34;

import javaclub5.loops.task34.Task34;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task34test {
    @Test
    void Task34(){
        Assertions.assertAll(()-> assertEquals(4, Task34.getAverage(new int[]{2,3,4,5,8})),
                ()-> assertEquals(3, Task34.getAverage(new int[]{1,2,3,4,5})),
                ()-> assertEquals(10, Task34.getAverage(new int[]{9,10,10,10,12})));
    }
}
