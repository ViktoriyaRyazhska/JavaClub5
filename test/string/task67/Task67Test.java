package string.task67;

import javaclub5.string.task67.Task67;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Task67Test {
    @Test
    public void fixedTests() {
        assertEquals("HELLO WORLD", Task67.changingLetterCase("hello world"));
        assertEquals("hello world", Task67.changingLetterCase("HELLO WORLD"));
        assertEquals("HELLO world", Task67.changingLetterCase("hello WORLD"));
        assertEquals("hEllO wOrld", Task67.changingLetterCase("HeLLo WoRLD"));
        assertEquals("Hello World", Task67.changingLetterCase(Task67.changingLetterCase("Hello World")));
        assertEquals("12345", Task67.changingLetterCase("12345"));
        assertEquals("1A2B3C4D5E", Task67.changingLetterCase("1a2b3c4d5e"));
        assertEquals("sTRINGuTILS.TOaLTERNATINGcASE", Task67.changingLetterCase("StringUtils.toAlternatingCase"));
    }

    @Test
    public void kataTitleTests() {
        assertEquals("ALTerNAtiNG CaSe", Task67.changingLetterCase("altERnaTIng cAsE"));
        assertEquals("altERnaTIng cAsE", Task67.changingLetterCase("ALTerNAtiNG CaSe"));
        assertEquals("ALTerNAtiNG CaSe <=> altERnaTIng cAsE", Task67.changingLetterCase("altERnaTIng cAsE <=> ALTerNAtiNG CaSe"));
        assertEquals("altERnaTIng cAsE <=> ALTerNAtiNG CaSe", Task67.changingLetterCase("ALTerNAtiNG CaSe <=> altERnaTIng cAsE"));
    }
}
