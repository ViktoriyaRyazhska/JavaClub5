package solutions.strings;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


class ReplaceAllDotsTest {
    @Test
    public void testSomeDots() {
        Assert.assertEquals("one-two-three", ReplaceAllDots.replaceDots("one.two.three"));
    }
}