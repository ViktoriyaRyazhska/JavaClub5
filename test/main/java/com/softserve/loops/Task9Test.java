package main.java.com.softserve.loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task9Test {

    @Test
    void sum() {
        int expect = 15;
        assertEquals(expect,Task9.sum(new int[]{1,2,3,4,5}));
    }
    @Test
    void sum2Try(){
        int expected = 13;
        assertEquals(expected,Task9.sum(new int[]{1,-2,3,4,5}));
    }
    @Test
    void allNegatives(){
        int exp = 0;
        assertEquals(exp,Task9.sum(new int[]{-1,-2,-3,-4,-5}));
    }
    @Test
    void notEquals(){
        int exp = 9;
        assertNotEquals(1,Task9.sum(new int[]{-2,-3,-3}));
    }
}
