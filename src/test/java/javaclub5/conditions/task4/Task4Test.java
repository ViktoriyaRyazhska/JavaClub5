package javaclub5.conditions.task4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * Tests of Task 4 Conditions
 *
 * @author Dmytro Prudius
 */


public class Task4Test {

    @Test
    public void basicTest() {
        boolean wellConfigured = unicodeTest();
        assertEquals(("£")+"100000",Runner.bonusTime(10000, true));
        assertEquals(("£")+"250000",Runner.bonusTime(25000, true));
        assertEquals(("£")+"10000",Runner.bonusTime(10000, false));
        assertEquals(("£")+"60000",Runner.bonusTime(60000, false));
        assertEquals(("£")+"20",Runner.bonusTime(2, true));
        assertEquals(("£")+"78",Runner.bonusTime(78, false));
        assertEquals(("£")+"678900",Runner.bonusTime(67890, true));
    }

    private boolean unicodeTest() {
        System.out.println("\u00A3 == £:" + "\u00A3".equalsIgnoreCase("£"));
        System.out.println("if previous result was false or had ? symbol then perhaps you need to escape unicode due to misconfiguration");
        return "\u00A3".equalsIgnoreCase("£");
    }
}
