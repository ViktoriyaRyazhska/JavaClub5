package three;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Task68Test {

    @Test
    void one() {
        Assert.assertEquals( "Hi!", Task68.nearestSq("Hi" , 1));
        Assert.assertEquals( "Hi!", Task68.nearestSq("Hi" , 100));
    }
    @Test
    void two() {

        Assert.assertEquals( "Hi hi hi", Task68.nearestSq("!!!Hi !!hi!!! !hi",100));
        Assert.assertEquals( "!!Hi !!hi!!! !hi", Task68.nearestSq("!!!Hi !!hi!!! !hi",1));

    }
}