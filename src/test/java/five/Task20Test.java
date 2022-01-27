package five;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Task20Test {
    @Test public void testTrue(){
        assertEquals(Task20.BooleanToString.convert(true), "true");
    }

    @Test public void testFalse(){
        assertEquals(Task20.BooleanToString.convert(false), "false");
    }
}

