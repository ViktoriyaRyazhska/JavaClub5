package javaclub5.collections.task3;


import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * Tests of Task 3 Collections
 *
 * @author Rostyslav Ros
 */

public class Task3Test {

    /**
     * Test of removeEvenNumbers method
     */
    @Test
    public void removeEvenNumbersTest1() {
        List<Integer> listOfNumbers = new LinkedList<>(Arrays.asList(1, 2, 2, 2, 4, 3, 4, 5, 6, 7));
        List<Integer> expectedResult = new LinkedList<>(Arrays.asList(1, 3, 5, 7));
        Assert.assertEquals(expectedResult,Runner.removeEvenNumbers(listOfNumbers));
    }

    @Test
    public void removeEvenNumbersTest2() {
        List<Integer> listOfNumbers = new LinkedList<>(Arrays.asList( 1, 2, 2, 2, 4, 3, 4 ));
        List<Integer> expectedResult = new LinkedList<>(Arrays.asList( 1, 3 ));
        Assert.assertEquals(Arrays.toString(expectedResult.toArray()),
                Arrays.toString(Runner.removeEvenNumbers(listOfNumbers).toArray()));
    }
}
