package javaclub5.conditions.task5;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * Tests of Task 5 Conditions
 *
 * @author Dmytro Prudius
 */


public class Task5Test {
     Runner run = new Runner();

    @Test
    public void testAge() {

        assertEquals("You are 10 years old.", Runner.CalculateAge(2012,2022));
        assertEquals("You will be born in 10 years.",Runner.CalculateAge(1990, 1980));
        assertEquals("You were born this very year!", Runner.CalculateAge(2222, 2222));

    }
}
