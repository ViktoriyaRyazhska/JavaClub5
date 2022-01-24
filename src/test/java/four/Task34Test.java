package four;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class Task34Test {
    @Test
    public void simpleTest() {
        assertEquals(2,Task34.getAverage(new int[] {2,2,2,2}));
        assertEquals(3,Task34.getAverage(new int[] {1,2,3,4,5}));
        assertEquals(1,Task34.getAverage(new int[] {1,1,1,1,1,1,1,2}));
    }
}
