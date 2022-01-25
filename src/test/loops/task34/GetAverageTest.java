package test.loops.task34;
import main.loops.task34.GetAverage;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;

public class GetAverageTest {




        @Test
        public void simpleTest() {
            assertEquals(2, GetAverage.getAverage(new int[] {2,2,2,2},4));
            assertEquals(3,GetAverage.getAverage(new int[] {1,2,3,4,5},5));
            assertEquals(1,GetAverage.getAverage(new int[] {1,1,1,1,1,1,1,2},5));
        }



    }
