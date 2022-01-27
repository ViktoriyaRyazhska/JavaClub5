package two;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Task47Test {
    @Test
    public void test01() {
        List<String> list = new ArrayList<>();
        list.add("Man`s name: Dan");
        list.add("Woman`s name: Nad");
        Assert.assertEquals(list, Task47.create("Dan", "Nad"));
    }
}
