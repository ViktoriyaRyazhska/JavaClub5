package two;

import org.junit.Assert;
import org.junit.Test;

public class Task12Test {
    @Test
    public void test01() {
        Task12 test = new Task12(12, "str", "Str obj");
        Assert.assertEquals(12, test.getNumber());
        Assert.assertEquals("str", test.getName());
        Assert.assertTrue(test.getAnObject() instanceof String);
        Assert.assertEquals("Str obj", test.getAnObject());
    }
    @Test
    public void test02() {
        Task12 test = new Task12(1, "str", 11);
        Assert.assertEquals(1, test.getNumber());
        test.setNumber(2);
        test.setStringValue("tested");
        Assert.assertEquals(2, test.getNumber());
        Assert.assertTrue(test.getAnObject() instanceof Number);
        Assert.assertEquals(11, test.getAnObject());
        Assert.assertEquals("tested", test.getName());
    }
}
