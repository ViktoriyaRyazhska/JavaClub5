package main.java.com.softserve.conditions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void convertToTrue() {
        String exp = "true";
        String input = Task3.convert(Task3.convertToBool(1));
        assertEquals(exp,input);
    }
    @Test
    void convertToFalse(){
        String exp = "false";
        String input = Task3.convert(Task3.convertToBool(2));
    }
}