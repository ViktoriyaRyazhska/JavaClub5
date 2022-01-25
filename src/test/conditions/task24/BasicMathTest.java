package test.conditions.task24;

import static org.junit.Assert.*;

import main.conditions.task24.BasicMath;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.runners.JUnit4;
public class BasicMathTest {





        @Test
        public void testBasics()
        {
            System.out.println("Basic Tests");
            assertThat(BasicMath.basicMath("+", 4, 7), is(11));
            assertThat(BasicMath.basicMath("-", 15, 18), is(-3));
            assertThat(BasicMath.basicMath("*", 5, 5), is(25));
            assertThat(BasicMath.basicMath("/", 49, 7), is(7));
        }
    }

