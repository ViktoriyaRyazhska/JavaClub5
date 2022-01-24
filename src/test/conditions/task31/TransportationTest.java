package test.conditions.task31;


import main.conditions.task31.Transportation;
import org.junit.Assert;
import org.junit.Test;


public class TransportationTest {
    @Test
    public void Test() {
        Assert.assertEquals(100, Transportation.rentalCarCost(3));
        Assert.assertEquals(140, Transportation.rentalCarCost(4));
        Assert.assertEquals(180, Transportation.rentalCarCost(5));
        Assert.assertEquals(220, Transportation.rentalCarCost(6));
        Assert.assertEquals(40, Transportation.rentalCarCost(1));
        Assert.assertEquals(80, Transportation.rentalCarCost(2));
        Assert.assertEquals(230, Transportation.rentalCarCost(7));
        Assert.assertEquals(270, Transportation.rentalCarCost(8));
        Assert.assertEquals(310, Transportation.rentalCarCost(9));
        Assert.assertEquals(350, Transportation.rentalCarCost(10));
    }
}