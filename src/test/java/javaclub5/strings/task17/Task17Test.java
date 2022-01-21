package javaclub5.strings.task17;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * Tests of Task 17 Strings
 *
 * @author Rostyslav Ros
 */

public class Task17Test {

    /**
     * Test of changingLetterCase method
     */
    @Test
    public void changingLetterCaseTest1() {
        Assert.assertEquals("HELLO WORLD", Runner.changingLetterCase("hello world"));
        Assert.assertEquals("hello world", Runner.changingLetterCase("HELLO WORLD"));
        Assert.assertEquals("HELLO world", Runner.changingLetterCase("hello WORLD"));
        Assert.assertEquals("hEllO wOrld", Runner.changingLetterCase("HeLLo WoRLD"));
        Assert.assertEquals("Hello World",
                Runner.changingLetterCase(Runner.changingLetterCase("Hello World")));
        Assert.assertEquals("12345", Runner.changingLetterCase("12345"));
        Assert.assertEquals("1A2B3C4D5E", Runner.changingLetterCase("1a2b3c4d5e"));
        Assert.assertEquals("sTRINGuTILS.TOaLTERNATINGcASE",
                Runner.changingLetterCase("StringUtils.toAlternatingCase"));
    }

    @Test
    public void changingLetterCaseTest2() {
        Assert.assertEquals("ALTerNAtiNG CaSe", Runner.changingLetterCase("altERnaTIng cAsE"));
        Assert.assertEquals("altERnaTIng cAsE", Runner.changingLetterCase("ALTerNAtiNG CaSe"));
        Assert.assertEquals("ALTerNAtiNG CaSe <=> altERnaTIng cAsE",
                Runner.changingLetterCase("altERnaTIng cAsE <=> ALTerNAtiNG CaSe"));
        Assert.assertEquals("altERnaTIng cAsE <=> ALTerNAtiNG CaSe",
                Runner.changingLetterCase("ALTerNAtiNG CaSe <=> altERnaTIng cAsE"));
    }
}
