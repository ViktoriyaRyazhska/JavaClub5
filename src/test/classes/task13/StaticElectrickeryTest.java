package test.classes.task13;

import main.classes.task13.StaticElectrickery;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StaticElectrickeryTest {
    @Test
    public void test() {
        assertEquals(805, StaticElectrickery.plus100(705));
        assertEquals(119, StaticElectrickery.plus100(19));
    }
}
