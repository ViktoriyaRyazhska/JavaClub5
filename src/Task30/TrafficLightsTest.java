package Task30;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrafficLightsTest {
    @Test
    public void update_light() {
        assertEquals("green", TrafficLights.updateLight("red"));
        assertEquals("yellow", TrafficLights.updateLight("green"));
        assertEquals("red", TrafficLights.updateLight("yellow"));
    }
}