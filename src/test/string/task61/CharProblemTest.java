package test.string.task61;

import main.string.task51.NumberToString;
import main.string.task61.CharProblem;
import org.junit.Assert;
import org.junit.Test;


public class CharProblemTest {

    @Test
    public void Test() {
        Assert.assertEquals(5, CharProblem.howOld("5 years old"));
        Assert.assertEquals(3, CharProblem.howOld("3 years old"));
        Assert.assertEquals(9, CharProblem.howOld("9 years old"));

    }

}