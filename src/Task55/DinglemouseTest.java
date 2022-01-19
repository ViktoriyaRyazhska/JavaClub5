package Task55;

import org.junit.Test;

import static org.junit.Assert.*;

public class DinglemouseTest {

    @Test
    public void testSomeDots() {
        assertTrue("Sorry, try again :-(", "one-two-three".equals(Dinglemouse.replaceDots("one.two.three")));
    }

}