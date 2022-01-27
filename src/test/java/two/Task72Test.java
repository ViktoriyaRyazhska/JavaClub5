package two;

import org.junit.Assert;
import org.junit.Test;

public class Task72Test {
    @Test
    public void test01() {
        Assert.assertEquals("A fruit that grows on trees", Task72.Dictionary("Orange"));
    }
    @Test
    public void test02() {
        Assert.assertEquals("A fruit that grows on palms", Task72.Dictionary("Coconut"));
    }
    @Test
    public void test03() {
        Assert.assertEquals("Can't find entry for ", Task72.Dictionary(""));
    }
    @Test
    public void test04() {
        Assert.assertEquals("Can't find entry for Meat", Task72.Dictionary("Meat"));
    }

}
