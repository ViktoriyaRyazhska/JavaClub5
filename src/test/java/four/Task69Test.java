package four;

import four.Task69;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.List;

public class Task69Test {

    @Test
    public void testSomething() {
        String str="an object";
        List<String> items = Task69.push(str);
        assertEquals(1,items.size());
        assertEquals("an object", items.get(0));
    }
}