package loops.task37;

import javaclub5.loops.task37.Task37;
import org.junit.Test;

import javax.sound.midi.Sequence;

import static org.junit.Assert.*;

public class Task37Test {

    @Test
    public void simpleTest() {
        assertArrayEquals(new int[]{5,4,3,2,1}, Task37.reverse(5));
    }

}