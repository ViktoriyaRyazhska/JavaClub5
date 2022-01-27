package javaclub5.loops.task36;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Sergiy Zapadenko on 27.01.2022 16:29
 */
class Task36Test {

    @Test
    void countSheeps() {
        Boolean[] array1 = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true };
        assertEquals( 17, Task36.countSheeps(array1));
    }
}