package test.conditions.task18;

import main.conditions.task18.OppositeNumber;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OppositeNumberTest {
    @Test
    public void tests() {
        assertEquals(-1, OppositeNumber.opposite(1));
        assertEquals(17, OppositeNumber.opposite(-17));
    }
}
