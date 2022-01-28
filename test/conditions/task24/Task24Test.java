package conditions.task24;

import javaclub5.conditions.task24.Task24;
import org.testng.annotations.Test;

import static sun.nio.cs.Surrogate.is;

public class Task24Test {
    @Test
    public void testBasics()
    {
        System.out.println("Basic Tests");
        assertThat(Task24.result("+", 4, 7), is(11));
        assertThat(Task24.result("-", 15, 18), is(-3));
        assertThat(Task24.result("*", 5, 5), is(25));
        assertThat(Task24.result("/", 49, 7), is(7));
    }

    private void assertThat(int result, boolean b) {
    }
}
