package one;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Task11Test {
    @Test
    public void testA() {
        assertEquals("4.0 is above freezing temperature", Task11.weatherInfo(40));
        assertEquals("10.0 is above freezing temperature", Task11.weatherInfo(50));
        assertEquals("16.0 is above freezing temperature", Task11.weatherInfo(60));
        assertEquals("233.0 is above freezing temperature", Task11.weatherInfo(451));
    }

    @Test
    public void testB() {
        assertEquals("-5.0 is freezing temperature", Task11.weatherInfo(23));
        assertEquals("-3.0 is freezing temperature", Task11.weatherInfo(27));
        assertEquals("-2.0 is freezing temperature", Task11.weatherInfo(29));
        assertEquals("-1.0 is freezing temperature", Task11.weatherInfo(31));
    }
}
