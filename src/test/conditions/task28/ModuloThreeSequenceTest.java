package test.conditions.task28;

import main.conditions.task28.ModuloThreeSequence;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ModuloThreeSequenceTest {
    @Test
    public void testSomething() {
        assertEquals(2, ModuloThreeSequence.sequence(20));
        assertEquals(2, ModuloThreeSequence.sequence(148));
        assertEquals(2, ModuloThreeSequence.sequence(111));
        assertEquals(2, ModuloThreeSequence.sequence(118));
        assertEquals(0, ModuloThreeSequence.sequence(41));
        assertEquals(0, ModuloThreeSequence.sequence(85));
        assertEquals(0, ModuloThreeSequence.sequence(117));
        assertEquals(1, ModuloThreeSequence.sequence(82));
        assertEquals(1, ModuloThreeSequence.sequence(72));
        assertEquals(1, ModuloThreeSequence.sequence(5101394));
        assertEquals(1, ModuloThreeSequence.sequence(163));
        assertEquals(1, ModuloThreeSequence.sequence(90));
    }
}
