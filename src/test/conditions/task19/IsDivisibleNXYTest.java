package test.conditions.task19;

import static org.junit.Assert.*;
import static org.junit.Assert.*;

import java.util.Random;

import main.conditions.task19.IsDivisibleNXY;
import org.junit.Test;



    public class IsDivisibleNXYTest {

        @Test
        public void test1() {
            assertEquals(true, IsDivisibleNXY.isDivisible(12,4,3));
        }
        @Test
        public void test2() {
            assertEquals(false, IsDivisibleNXY.isDivisible(3,3,4));
        }

    }

