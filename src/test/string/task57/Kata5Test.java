package test.string.task57;

import static org.junit.Assert.*;

import main.string.task57.Kata5;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class Kata5Test {
    @Test public void testSomething() {
        assertEquals("8j8mBliB8gimjB8B8jlB", Kata5.noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
        assertEquals("88Bifk8hB8BB8BBBB888chl8BhBfd", Kata5.noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
        assertEquals("8aaaaaddddr", Kata5.noSpace("8aaaaa dddd r     "));
        assertEquals("jfBmgklf8hg88lbe8", Kata5.noSpace("jfBm  gk lf8hg  88lbe8 "));
        assertEquals("8jaam", Kata5.noSpace("8j aam"));
    }
}