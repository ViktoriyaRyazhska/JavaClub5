package main.java.com.softserve.loops;
import main.java.com.softserve.loops.Task3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {


    @Test
    void getAverage(){
        int exp =3;
        assertEquals(exp, Task3.getAverage(new int[]{1,2,3,4,5}));
    }

}