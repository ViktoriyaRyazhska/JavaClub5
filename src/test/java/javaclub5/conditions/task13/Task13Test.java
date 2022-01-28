package javaclub5.conditions.task13;

import org.junit.Assert;
import org.junit.Test;

public class Task13Test {
    @Test
    public void trafficLightTest(){
        Assert.assertEquals("green", Runner.TrafficLights.updateLight("red"));
        Assert.assertEquals("yellow", Runner.TrafficLights.updateLight("green"));
        Assert.assertEquals("red", Runner.TrafficLights.updateLight("yellow"));
    }
}
