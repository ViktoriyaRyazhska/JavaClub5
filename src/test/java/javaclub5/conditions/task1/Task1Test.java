package javaclub5.conditions.task1;

import javaclub5.conditions.task3.BooleanToString;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task1Test {
    @Test
    public void tests() {
        assertEquals(-1, Runner.opposite(1));
    }
}
