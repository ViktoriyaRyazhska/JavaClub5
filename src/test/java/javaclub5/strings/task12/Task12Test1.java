package javaclub5.strings.task12;

import org.junit.Assert;
import org.junit.Test;

public class Task12Test1 {
    @Test
    public void testA() {
        Assert.assertEquals("10.0 is above freezing temperature", GrassHopper.weatherInfo(50));
    }
    @Test
    public void testB() {
        Assert.assertEquals("-5.0 is freezing temperature", GrassHopper.weatherInfo(23));
    }
}
