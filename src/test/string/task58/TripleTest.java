package test.string.task58;

import main.string.task58.Triple;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TripleTest {
    @Test
    public void tests() {
        assertEquals("ttlheoiscstk", Triple.tripleTrouble("this", "test", "lock"));
        assertEquals("abcabc", Triple.tripleTrouble("aa","bb","cc"));
        assertEquals("Batman", Triple.tripleTrouble("Bm", "aa", "tn"));
        assertEquals("LexLuthor", Triple.tripleTrouble("LLh","euo","xtr"));
    }
}
