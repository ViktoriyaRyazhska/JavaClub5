package javaclub5.basicprogram.task11;

import org.junit.Assert;
import org.junit.Test;

public class Task11Test {
    @Test
    public void grassHopperTestA(){
        Assert.assertEquals("10.0 is above freezing temperature", GrassHopper.weatherInfo(50));
    }

    @Test
    public void grassHopperTestB(){
        Assert.assertEquals("-5.0 is freezing temperature", GrassHopper.weatherInfo(23));
    }
}

