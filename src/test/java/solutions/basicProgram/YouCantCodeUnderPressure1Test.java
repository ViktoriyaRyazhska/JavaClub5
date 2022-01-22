package solutions.basicProgram;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YouCantCodeUnderPressure1Test {

    @Test
    void multiply() {
        YouCantCodeUnderPressure1 y = new YouCantCodeUnderPressure1();

        Assert.assertEquals("Nope!" , 4, y.multiply(2));
        Assert.assertEquals("Nope!" , 0, y.multiply(0));
        Assert.assertEquals("Nope!" , -400, y.multiply(-200));
        Assert.assertEquals("Nope!" , 2147483646, y.multiply(2147483647/2));

    }
}