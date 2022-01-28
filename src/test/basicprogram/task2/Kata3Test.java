package test.basicprogram.task2;

import main.basicprogram.task2.Kata3;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Kata3Test {


    @Test
    public void sampleTest() {
        assertEquals(4, Kata3.multiply(2, 2));
        assertEquals(10, Kata3.multiply(5, 2));
        assertEquals(100, Kata3.multiply(100, 1));
        assertEquals(0, Kata3.multiply(0, 1000));
    }


}