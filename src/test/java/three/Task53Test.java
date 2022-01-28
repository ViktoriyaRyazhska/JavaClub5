package three;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task53Test {

    @Test
    void task53() {

            Assert.assertEquals("Hello, John Smith! Welcome to Phoenix, Arizona!", Task53.sayHello("John Smith", "Phoenix", "Arizona"));
    }
}