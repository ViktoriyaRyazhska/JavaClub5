package main.java.com.softserve.loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void repeatStr1() {
        assertEquals("IgorIgorIgorIgorIgorIgor", Task1.repeatStr(6, "Igor"));
    }
    @Test
    void repeatStr2(){
        assertEquals("HelloHelloHello", Task1.repeatStr(3, "Hello"));
    }
    @Test
    public void testEmpty() {
        assertEquals("", Task1.repeatStr(5, ""));
    }
    @Test
    public void testZero() {
        assertEquals("", Task1.repeatStr(0, "kata"));
    }
}