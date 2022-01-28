package javaclub5.collections.task69;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task69Test {

    @Test
    void push() {
        List<String> items = Task69.push();
        assertEquals(1,items.size());
        assertEquals("apple", items.get(0));
    }
}