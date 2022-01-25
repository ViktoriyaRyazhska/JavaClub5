package main.java.com.softserve.conditions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task10Test {

    @Test
    void enough() {
        int expected = 0;
        int EnoughOrNo = Task10.enough(120,80,10);
        assertEquals(expected,EnoughOrNo);
    }
    @Test
    void notEnough(){
        int expected = 10;
        int alot = Task10.enough(30,20,20);
        assertEquals(expected,alot);
    }
}

//    @Test
//    public void testBob() {
//        assertEquals("Should return 0.", 0, Bob.enough(10, 5, 5));
//        assertEquals("Should return 10.", 10, Bob.enough(100, 60, 50));
//        assertEquals("Should return 0.", 0, Bob.enough(20, 5, 5));
//    }