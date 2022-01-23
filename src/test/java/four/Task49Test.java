package four;

import static org.junit.Assert.*;
import org.junit.Test;

public class Task49Test {

    Task49 myEncoder = new Task49();

    @Test
    public void simpleTest(){
       // assertTrue("empty string", myEncoder.encode("").equals(""));
       // assertTrue("abcdef string", myEncoder.encode("abcdef").equals("4bcd3f"));
        assertEquals("empty string", myEncoder.encode(""));
        assertEquals("4bcd3f", myEncoder.encode("abcdef"));
    }
}
