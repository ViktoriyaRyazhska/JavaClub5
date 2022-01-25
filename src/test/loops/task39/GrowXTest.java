package test.loops.task39;

import static org.junit.Assert.*;

import main.loops.task39.GrowX;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import java.util.*;
public class GrowXTest {



        @Test
        public void testSomething() {
            assertEquals(6, GrowX.grow(new int[]{1,2,3},3));
            assertEquals(16, GrowX.grow(new int[]{4,1,1,1,4},5));
            assertEquals(64, GrowX.grow(new int[]{2,2,2,2,2,2},6));
        }
    }
