package solutions.loops;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GapInPrimesTest {

    @Test
    void gapInPrimes() {
        GapInPrimes gapInPrimes = new GapInPrimes();
        assertEquals("[101, 103]", Arrays.toString(gapInPrimes.gapInPrimes(2,100,110)));
        assertEquals("null", Arrays.toString(gapInPrimes.gapInPrimes(6, 100, 110)));
        assertEquals("[1229, 1231]", Arrays.toString(gapInPrimes.gapInPrimes(2,1200,13000)));

    }
}