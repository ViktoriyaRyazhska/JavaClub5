package four;
import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;


public class Task19Test {
    @Test
    public void test1() {
        assertEquals(true, Task19.isDivisible(12,4,3));
    }
    @Test
    public void test2() {
        assertEquals(false, Task19.isDivisible(3,3,4));
    }
    @Test
    public void test3() {
        assertEquals(false, Task19.isDivisible(3,4,3));
    }
    @Test
    public void test4() {
        assertEquals(false, Task19.isDivisible(3,4,4));
    }

}
