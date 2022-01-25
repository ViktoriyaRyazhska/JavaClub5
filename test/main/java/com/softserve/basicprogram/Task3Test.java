package main.java.com.softserve.basicprogram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void getVolumeOfCuboidZero() {
        double expected = 0;
        double enter = Task3.getVolumeOfCuboid(12,0,4);
        assertEquals(expected,enter);
    }
    @Test
    void getVolumeOfCuboid(){
        double expected = 1;
        double enter = Task3.getVolumeOfCuboid(1,1,1);
        assertEquals(expected,enter);
    }
    @Test
    void getVolumeOfCuboidSecond(){
        double expected = 130;
        double enter = Task3.getVolumeOfCuboid(13,10,1);
        assertEquals(expected,enter);
    }

}