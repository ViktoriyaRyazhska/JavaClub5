package main.java.com.softserve.basicprogram;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void doubleTheNumber1() {
        BigInteger expected = BigInteger.valueOf(16);
        BigInteger b = Task1.doubleTheNumber(BigInteger.valueOf(8));
        assertEquals(expected, b);
    }

    @Test
    void doubleTheNumber3() {
        BigInteger expected = BigInteger.valueOf(-2572);
        BigInteger b = Task1.doubleTheNumber(BigInteger.valueOf(-1286));
        assertEquals(expected, b);
    }

    @Test
    void doubleTheNumber2() {
        BigInteger expected = BigInteger.valueOf(Long.parseLong("-4202000400"));
        BigInteger b = Task1.doubleTheNumber(BigInteger.valueOf(-2101000200));
        assertEquals(expected, b);
    }

    @Test
    void doubleTheNumber4() {
        BigInteger expected = BigInteger.valueOf(Long.parseLong("8401777332"));
        BigInteger b = Task1.doubleTheNumber(BigInteger.valueOf(Long.parseLong("4200888666")));
        assertEquals(expected, b);
    }

}