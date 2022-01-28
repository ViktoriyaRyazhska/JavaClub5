package test.string.task59;

import static org.junit.Assert.*;

import main.string.task59.PositionAlphabet;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
public class PositionAlphabetTest {



        @Test
        public void basicTests() {
            assertEquals("Position of alphabet: 1", PositionAlphabet.position('a'));
            //assertEquals("Position of alphabet: 26", PositionAlphabet.position('z'));
            assertEquals("Position of alphabet: 5", PositionAlphabet.position('e'));
        }
    }
