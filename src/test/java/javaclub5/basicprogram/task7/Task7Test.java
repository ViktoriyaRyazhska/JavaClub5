package javaclub5.basicprogram.task7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task7Test {

        @Test
        void enterTime2() {
            int expected = 3661000;
            int time = Runner.past(1, 1, 1);
            assertEquals(expected, time);
        }
}

