package javaclub5.conditions.task2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task2Test {
    @Test
    public void test1() {
        assertEquals(true, DivisibleNb.isDivisible(12,4,3));
    }
    @Test
    public void test2() {
        assertEquals(false, DivisibleNb.isDivisible(3,3,4));
    }
}
