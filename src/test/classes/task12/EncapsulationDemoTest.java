package test.classes.task12;

import main.classes.task12.EncapsulationDemo;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.runners.JUnit4;

import java.security.SecureRandom;
import java.math.BigInteger;

public class EncapsulationDemoTest {


    @Test
    public void testSample() {
        EncapsulationDemo ed = new EncapsulationDemo();
        assertEquals(
                0,
                ed.getNumber()
        );
    }


}