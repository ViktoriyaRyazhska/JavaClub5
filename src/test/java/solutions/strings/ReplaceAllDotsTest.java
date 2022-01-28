package solutions.strings;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ReplaceAllDotsTest {
    @Test
    public void testSomeDots() {

        Assertions.assertEquals("one-two-three", ReplaceAllDots.replaceDots("one.two.three"));
        Assertions.assertEquals("", ReplaceAllDots.replaceDots(""));
        Assertions.assertEquals("It's OK", ReplaceAllDots.replaceDots("It's OK"));
        Assertions.assertEquals("---winter---is---COMING", ReplaceAllDots.replaceDots("...winter...is...COMING"));

    }
}