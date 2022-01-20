package javaclub5.basicprogram.task3;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 *
 * @author Popova Anna
 */

public class RunnerTest {

    @Test

    public void calculateVolumeOfCuboidTest() {
        double res = 0.01;
        Assert.assertEquals(20.0, Runner.calculateVolumeOfCuboid(2, 5, 2), res);
        Assert.assertEquals(30.0, Runner.calculateVolumeOfCuboid(2,7.5,2),res);
    }


}