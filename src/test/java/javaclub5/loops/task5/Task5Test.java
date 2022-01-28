package javaclub5.loops.task5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task5Test {
    Boolean[] array1 = {true,  true,  true,  false,
            true,  true,  true,  true ,
            true,  false, true,  false,
            true,  false, false, true ,
            true,  true,  true,  true ,
            false, false, true,  true };

    @Test
    public void test() {
        assertEquals("There are 17 sheeps in total", 17, new Runner().countSheeps(array1));
    }
}
