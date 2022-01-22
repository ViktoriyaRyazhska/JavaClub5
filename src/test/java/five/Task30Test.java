package five;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task30Test {
    @Test
    public void update_light() {
        assertEquals("green", Task30.updateLight("red"));
        assertEquals("yellow", Task30.updateLight("green"));
        assertEquals("red", Task30.updateLight("yellow"));
    }
}