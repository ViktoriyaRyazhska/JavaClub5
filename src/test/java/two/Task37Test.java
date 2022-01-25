package two;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Task37Test {
    @Test
    public void test01() {
        List<Integer> testList = new ArrayList<>();
        testList.add(0);
        Assert.assertEquals(testList, Task37.mass(0));
    }
    @Test
    public void test02() {
        List<Integer> testList = new ArrayList<>();
        testList.add(3);
        testList.add(2);
        testList.add(1);
        testList.add(0);
        Assert.assertEquals(testList, Task37.mass(3));
    }
}
