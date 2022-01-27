package two;

import org.junit.Assert;
import org.junit.Test;

public class Task22Test {
    @Test
    public void test01() {
        Assert.assertEquals("You are 18 years old.", Task22.calculateAge(2004, 2022));
    }
    @Test
    public void test02() {
        Assert.assertEquals("You were born this very year!", Task22.calculateAge(2022, 2022));
    }
    @Test
    public void test03() {
        Assert.assertEquals("You will be born in 10 years.", Task22.calculateAge(2032, 2022));
    }
    @Test
    public void test04() {
        Assert.assertEquals("You will be born in 1 year.", Task22.calculateAge(2023, 2022));
    }
    @Test
    public void test05() {
        Assert.assertEquals("You were born 1 year ago.", Task22.calculateAge(2021, 2022));
    }
}
