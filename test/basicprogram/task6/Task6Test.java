package basicprogram.task6;

import javaclub5.basicprogram.task6.Task6;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task6Test{
    @Test
    void testToBinary() {
        Assertions.assertAll(() ->assertEquals(0, Task6.toBinary(0)),
                () ->assertEquals(1, Task6.toBinary(1)),
                () ->assertEquals(10, Task6.toBinary(2)),
                () ->assertEquals(11, Task6.toBinary(3)),
                () ->assertEquals(111001000, Task6.toBinary(456)));


    }
    @Test
    void testToBinary1() {
        Assertions.assertAll(() ->assertEquals(11, Task6.toBinary(3)),
                () ->assertEquals(1, Task6.toBinary1(1)),
                () ->assertEquals(10, Task6.toBinary1(2)),
                () ->assertEquals(11, Task6.toBinary1(3)),
                () ->assertEquals(111001000, Task6.toBinary1(456)));
    }


}
