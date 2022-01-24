package five;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Task45Test {

    @Test
    public void test() {
        System.out.println("Fixed Tests");
        assertEquals("[101, 103]", Arrays.toString(Task45.gap(2,100,110)));
        assertEquals("[103, 107]", Arrays.toString(Task45.gap(4,100,110)));
        assertNull(Task45.gap(6, 100, 110));
        assertEquals("[359, 367]", Arrays.toString(Task45.gap(8,359,400)));
        assertEquals("[337, 347]", Arrays.toString(Task45.gap(10,300,400)));
    }

}