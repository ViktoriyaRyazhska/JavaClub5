package five;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Task70Test {
    @Test
    public void SampleTests() {
        assertEquals(Arrays.asList(1), Task70.CreateList(1));
        assertEquals(Arrays.asList(1, 2), Task70.CreateList(2));
        assertEquals(Arrays.asList(1, 2, 3), Task70.CreateList(3));
        assertEquals(Arrays.asList(1, 2, 3, 4), Task70.CreateList(4));
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), Task70.CreateList(5));
    }
}