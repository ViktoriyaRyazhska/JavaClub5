package OOP.task47;

import javaclub5.OOP.task47.Human;
import javaclub5.OOP.task47.Man;
import javaclub5.OOP.task47.Task47;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class Task47test {
    @Test
    void Task47(){
        Human[] paradise = Task47.create();
        assertEquals("Adam are a man", true ,paradise[0] instanceof Man);
    }
}
