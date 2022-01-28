package javaclub5.basicprogram.task7;

import org.junit.Assert;
import org.junit.Test;

import static javaclub5.basicprogram.task7.Runner.past;


public class Task7Test {
        @Test
        public void enterTime2() {
            int expected = 3661000;
            int time = past(1, 1, 1);
            Assert.assertEquals(expected, time);
        }
}

