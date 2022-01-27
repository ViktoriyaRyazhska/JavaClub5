package two;

import org.junit.Assert;
import org.junit.Test;

public class Task17Test {
    @Test
    public void test01() {
        Task17 test = new Task17(new int[]{2,2,2});
        Assert.assertEquals(2, test.getHeight());
        Assert.assertEquals(2, test.getWidth());
        Assert.assertEquals(2, test.getLength());
    }
    @Test
    public void test02() {
        Task17 test = new Task17(new int[]{2,2,2});
        Assert.assertEquals(24, test.getSurfaceArea());
        Assert.assertEquals(8, test.getVolume());
    }
}
