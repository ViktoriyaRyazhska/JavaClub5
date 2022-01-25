package test.loops.task44;

import static org.junit.Assert.*;
import java.util.Random;
import static org.junit.Assert.assertEquals;

import main.loops.task44.Summation;
import org.junit.Test;
public class SummationTest {



        @Test
        public void test1() {
            assertEquals(1,
                    Summation.summation(1));
        }
        @Test
        public void test2() {
            assertEquals(36,
                    Summation.summation(8));
        }
    }
