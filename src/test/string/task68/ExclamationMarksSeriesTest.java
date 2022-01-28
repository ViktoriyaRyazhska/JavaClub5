package test.string.task68;

import main.string.task68.ExclamationMarksSeries;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExclamationMarksSeriesTest {
    @Test
    public void fixedTests() {
        assertEquals("Hi", ExclamationMarksSeries.remove("Hi!", 1));
        assertEquals("Hi", ExclamationMarksSeries.remove("Hi!", 100));
        assertEquals("Hi!!", ExclamationMarksSeries.remove("Hi!!!", 1));
        assertEquals("Hi", ExclamationMarksSeries.remove("Hi!!!", 100));
        assertEquals("Hi", ExclamationMarksSeries.remove("!Hi", 1));
        assertEquals("Hi!", ExclamationMarksSeries.remove("!Hi!", 1));
        assertEquals("Hi", ExclamationMarksSeries.remove("!Hi!", 100));
        assertEquals("!!Hi !!hi!!! !hi", ExclamationMarksSeries.remove("!!!Hi !!hi!!! !hi", 1));
        assertEquals("Hi !!hi!!! !hi", ExclamationMarksSeries.remove("!!!Hi !!hi!!! !hi", 3));
        assertEquals("Hi hi!!! !hi", ExclamationMarksSeries.remove("!!!Hi !!hi!!! !hi", 5));
        assertEquals("Hi hi hi", ExclamationMarksSeries.remove("!!!Hi !!hi!!! !hi", 100));
    }
}
