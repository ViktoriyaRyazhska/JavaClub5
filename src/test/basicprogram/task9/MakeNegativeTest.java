package test.basicprogram.task9;

import static org.junit.Assert.*;

import main.basicprogram.task9.MakeNegative;
import org.junit.Test;
import static org.junit.Assert.assertEquals;



    public class MakeNegativeTest {

        @Test
        public void test1() {
            assertEquals(-42, MakeNegative.makeNegative(42));
        }
    }
