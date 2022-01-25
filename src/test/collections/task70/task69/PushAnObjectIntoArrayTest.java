package test.collections.task70.task69;

import static org.junit.Assert.*;

import main.collections.PushAnObjectIntoArray;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.List;
public class PushAnObjectIntoArrayTest {




        @Test
        public void testSomething() {
            List<String> items = PushAnObjectIntoArray.push();
            assertEquals(1,items.size());
            assertEquals("an object", items.get(0));
        }

}