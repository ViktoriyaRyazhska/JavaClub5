package five;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task65Test {

    @Test
    public void testFixed() {
        assertEquals("b***i***t***c***o***i***n", Task65.twoSort(new String[] {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}));
        assertEquals("a***r***e", Task65.twoSort(new String[] {"turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones"}));
    }
}