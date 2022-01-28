package javaclub5.collections.task1;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class Task1Test {

    @Test
    public void collectionsTask1Test(){
        List<String> items = Runner.push();
        Assert.assertEquals(1, items.size());
        Assert.assertEquals("an object", items.get(0));
    }
}
