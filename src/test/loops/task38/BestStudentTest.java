package test.loops.task38;

import main.loops.task38.BestStudent;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BestStudentTest {
    @Test
    public void tests() {
        assertTrue(BestStudent.betterThanAverage(new int[]{2, 3}, 5));
        assertTrue(BestStudent.betterThanAverage(new int[]{100, 40, 34, 57, 29, 72, 57, 88}, 75));
        assertTrue(BestStudent.betterThanAverage(new int[]{12, 23, 34, 45, 56, 67, 78, 89, 90}, 69));
        assertFalse(BestStudent.betterThanAverage(new int[]{100, 90}, 11));
    }
}
