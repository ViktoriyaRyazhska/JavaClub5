package test.string.task64;

import static org.junit.Assert.*;

import main.string.task64.STRcount;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
public class STRcountTest {



        @Test
        public void testSomething() {
            assertEquals(1, STRcount.strCount("Hello", "o"));
            assertEquals(2, STRcount.strCount("Hello", "l"));
            assertEquals(0, STRcount.strCount("","z"));
        }
    }
