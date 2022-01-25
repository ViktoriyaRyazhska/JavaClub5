package test.string.task54;

import static org.junit.Assert.*;

import main.string.task54.OppositeNumb;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class OppositeNumbTest {



        @Test
        public void tests() {
            assertEquals(-1, OppositeNumb.opposite(1));
        }
    }
