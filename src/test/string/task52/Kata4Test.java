package test.string.task52;


import main.string.task52.Kata4;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
public class Kata4Test {
    @Test
    public void sampleTests() {
        assertEquals("dlrow", Kata4.solution("world"));
    }
}