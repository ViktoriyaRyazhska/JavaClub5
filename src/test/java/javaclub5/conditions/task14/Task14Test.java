package javaclub5.conditions.task14;

import org.junit.Assert;
import org.junit.Test;

public class Task14Test {

    @Test
    public void rentalCarCostTest(){
        Assert.assertEquals(40, Runner.rentalCarCost(1));
        Assert.assertEquals(80, Runner.rentalCarCost(2));
    }
}
