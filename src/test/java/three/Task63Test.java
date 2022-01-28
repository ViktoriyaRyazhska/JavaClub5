package three;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task63Test {

    @Test
    void one() {
        Assert.assertEquals("S.H", Task63.abbrevName("Shon Haris"));
    }
    @Test
    void two() {
        Assert.assertEquals("L.N", Task63.abbrevName("Lou Newmoda"));
    }
}