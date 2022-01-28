package collections.task71;

import javaclub5.collections.Task71.Task71;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class Task71Test {
    @Test
    public void firstTest() throws Exception {
        List<Integer> listOfNumbers = new LinkedList<>(Arrays.asList(1, 2, 2, 2, 4, 3, 4, 5, 6, 7));
        List<Integer> expectedResult = new LinkedList<>(Arrays.asList(1, 3, 5, 7));
        assertEquals(expectedResult, Task71.sortedList(listOfNumbers));
    }

    @Test
    public void secondTest()
    {
        List<Integer> listOfNumbers = new LinkedList<>(Arrays.asList( 1, 2, 2, 2, 4, 3, 4 ));
        List<Integer> expectedResult = new LinkedList<>(Arrays.asList( 1, 3 ));
        assertEquals(Arrays.toString(expectedResult.toArray()), Arrays.toString(Task71.sortedList(listOfNumbers).toArray()));
    }

}
