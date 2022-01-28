package solutions.collections;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PushAnObjectIntoArrayTest {

    @Test
    public void push() {
        PushAnObjectIntoArray obj = new PushAnObjectIntoArray();
        List<String> items = obj.push();
        assertEquals(1,items.size());
        assertEquals("an object", items.get(0));
    }
}