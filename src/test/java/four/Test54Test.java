package four;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

class Tast54Test {
    @Test
    public void tests() {
        assertEquals(-1, Task54.opposite(1));
        assertEquals(-14, Task54.opposite(14));
        assertEquals(14, Task54.opposite(-14));
    }
}
