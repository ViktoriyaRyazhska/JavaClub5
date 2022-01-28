package loops.task45;

import javaclub5.loops.task45.Task45;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task45Test {
    @Test
    public void test() {
        System.out.println("Fixed Tests");
        assertEquals("[101, 103]", Arrays.toString(Task45.gettingPrimes(2,100,110)));
        assertEquals("[103, 107]", Arrays.toString(Task45.gettingPrimes(4,100,110)));
        assertEquals(null, Task45.gettingPrimes(6,100,110));
        assertEquals("[359, 367]", Arrays.toString(Task45.gettingPrimes(8,300,400)));
        assertEquals("[337, 347]", Arrays.toString(Task45.gettingPrimes(10,300,400)));
    }
}
