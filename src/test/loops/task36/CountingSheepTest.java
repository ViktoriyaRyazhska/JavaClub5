package test.loops.task36;

import main.basicprogram.task1.CodeFast;
import main.loops.task36.CountingSheep;
import org.junit.Assert;
import org.junit.Test;


public class CountingSheepTest {
    @Test
    public void Test() {
        Boolean[] array1 = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true };

        Boolean[] array2 = {false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true };

        Boolean[] array3 = {false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true , false, false,
                true,  true };

        Assert.assertEquals( 17, CountingSheep.countSheeps(array1)); // Test 1!
        Assert.assertEquals( 14, CountingSheep.countSheeps(array2)); // Test 2!
        Assert.assertEquals( 12, CountingSheep.countSheeps(array3)); // Test 3!

    }
}