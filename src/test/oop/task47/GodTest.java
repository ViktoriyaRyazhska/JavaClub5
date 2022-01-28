package test.oop.task47;

import main.oop.task47.God;
import main.oop.task47.Man;
import main.oop.task47.Human;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GodTest {

    @Test
    public void makingAdam() {
        Human[] paradise = God.create();
        assertEquals("Adam are a man", true, paradise[0] instanceof Man);
    }
}