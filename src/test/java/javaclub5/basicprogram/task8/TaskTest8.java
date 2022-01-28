package javaclub5.basicprogram.task8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TaskTest8 {

        @Test
        public void FixedTests() {
            assertEquals(18, Runner.century(1705));
            assertEquals(19, Runner.century(1900));
            assertEquals(17, Runner.century(1601));
            assertEquals(20, Runner.century(2000));
            assertEquals(1,  Runner.century(89));
        }
}

