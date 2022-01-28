package three;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task58Test {

    @Test
    void one() {
        Assert.assertEquals("abcabcabc", Task58.tripleTrouble("aaa", "bbb", "ccc"));
    }

    @Test
    void two() {
        Assert.assertEquals("abcabcabcabcabcabc", Task58.tripleTrouble("aaaaaa", "bbbbbb", "cccccc"));
    }
    @Test
    void three() {
        Assert.assertEquals("brrueordlnsl",Task58.tripleTrouble("burn", "reds", "roll"));
    }
}