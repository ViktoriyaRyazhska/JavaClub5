package basicprogram.task9;

import javaclub5.basicprogram.task9.Task9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Task9test {
    @Test
    void Task9(){
        Assertions.assertAll(()->assertEquals(-55, Task9.makeNegative(55)),
                ()->assertEquals(-18, Task9.makeNegative(18)));
    }
}
