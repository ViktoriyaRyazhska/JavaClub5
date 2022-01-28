package main.java.com.softserve.collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static main.java.com.softserve.collections.Task1.push;
import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    public void push2() {
        List<String> items = Task1.push();
        assertEquals(1, items.size());
        assertEquals("an object", items.get(0));
    }

}