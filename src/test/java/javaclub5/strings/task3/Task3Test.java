package javaclub5.strings.task3;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * Tests of Task 3 Strings
 *
 * @author Rostyslav Ros
 */

public class Task3Test {

    /**
     * Test of sayHello method
     */
    @Test
    public void sayHelloTest() {
        String[] name = {"John", "Smith"};
        Assert.assertEquals("Hello, John Smith! Welcome to Phoenix, Arizona!",
                Runner.sayHello(name, "Phoenix", "Arizona"));
    }
}
