package basicprogram.task10;

import javaclub5.basicprogram.task10.Task10;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task10test {
    @Test
    void Task10(){
        Assertions.assertAll(()-> assertEquals("9-11",Task10.datingRange(10)),
                ()->assertEquals("16-22", Task10.datingRange(18)),
                ()->assertEquals("27-66", Task10.datingRange(40)));
    }
}
