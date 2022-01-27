package conditions.task31;

import javaclub5.conditions.task31.Task31;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task31test {
    @Test
    void Task31(){
    Assertions.assertAll(()-> assertEquals(40, Task31.rentCar(1)),
            ()-> assertEquals(80, Task31.rentCar(2)),
            ()-> assertEquals(140, Task31.rentCar(4)),
            ()-> assertEquals(350, Task31.rentCar(10)));

    }
}
