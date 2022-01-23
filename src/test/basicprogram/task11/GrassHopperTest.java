package test.basicprogram.task11;

import main.basicprogram.task11.GrassHopper;
import org.junit.Assert;
import org.junit.Test;

public class GrassHopperTest {

    @Test
    public void Test() {
        Assert. assertEquals("10.0 is above freezing temperature", GrassHopper.weatherInfo(50));
        Assert. assertEquals("-5.0 is freezing temperature", GrassHopper.weatherInfo(23));
        Assert. assertEquals("-5.6 is freezing temperature", GrassHopper.weatherInfo(22));
        Assert. assertEquals("-17.8 is freezing temperature", GrassHopper.weatherInfo(0));

    }
}
