package main.java.com.softserve.clasess;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task1Test {

    @Test
    void test1() {
        int expected = 2;
        Task1.EncapsulationDemo encapsulationDemo = new Task1.EncapsulationDemo(2, "car", "TOYOTA");
        int result = encapsulationDemo.getNumber();
        assertEquals(expected, result);
    }

    @Test
    void test2() {
        String expected = "car";
        Task1.EncapsulationDemo encapsulationDemo = new Task1.EncapsulationDemo(2, "car", "TOYOTA");
        String result = encapsulationDemo.getStringValue();
        assertEquals(expected, result);
    }

}
