package solutions.basicProgram;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class YouCantCodeUnderPressure1Test {

    @Test
    void multiply() {
        YouCantCodeUnderPressure y = new YouCantCodeUnderPressure();

        Assert.assertEquals("Nope!" , 4, y.multiply(2));
        Assert.assertEquals("Nope!" , 0, y.multiply(0));
        Assert.assertEquals("Nope!" , -400, y.multiply(-200));
        Assert.assertEquals("Nope!" , 2147483646, y.multiply(2147483647/2));

    }
}