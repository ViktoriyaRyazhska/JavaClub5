package javaclub5.string.task56;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task56Test {

    @Test
    public void PeopleThatPlayBanjo() {
        assertEquals("Nope!", "Den does not play banjo", Task56.banjo("Den"));
        assertEquals("Nope!", "Kate does not play banjo", Task56.banjo("Kate"));
        assertEquals("Nope!", "Ralf plays banjo", Task56.banjo("Ralf"));
        assertEquals("Nope! Remember lower case counts, too!", "rick plays banjo", Task56.banjo("rick"));
    }
}