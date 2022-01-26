package main.java.com.softserve.basicprogram;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void multiplyTwoNums1() {
        BigInteger expected = BigInteger.valueOf(0);
        BigInteger numB1 = BigInteger.valueOf(0);
        BigInteger numB2 = BigInteger.valueOf(100000000);
        BigInteger result = Task2.multiplyTwoNums(numB1,numB2);
        assertEquals(expected, result);
    }

    @Test
    void multiplyTwoNums2() {
        BigInteger expected = BigInteger.valueOf(442286325);
        BigInteger numB1 = BigInteger.valueOf(-6201);
        BigInteger numB2 = BigInteger.valueOf(-71325);
        BigInteger result = Task2.multiplyTwoNums(numB1,numB2);
        assertEquals(expected, result);
    }

    @Test
    void multiplyTwoNums3() {
        BigInteger expected = BigInteger.valueOf(-478947);
        BigInteger numB1 = BigInteger.valueOf(-7);
        BigInteger numB2 = BigInteger.valueOf(68421);
        BigInteger result = Task2.multiplyTwoNums(numB1,numB2);
        assertEquals(expected, result);
    }

    @Test
    void multiplyTwoNums4() {
        BigInteger expected = BigInteger.valueOf(1369426884);
        BigInteger numB1 = BigInteger.valueOf(342356721);
        BigInteger numB2 = BigInteger.valueOf(4);
        BigInteger result = Task2.multiplyTwoNums(numB1,numB2);
        assertEquals(expected, result);
    }

}