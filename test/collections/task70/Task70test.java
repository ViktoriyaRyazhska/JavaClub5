package collections.task70;

import javaclub5.collections.task70.Kata;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task70test {
    @Test
    void CreateListTest() {
        Assertions.assertAll(() ->assertEquals(Arrays.asList(1,2,3), Kata.CreateList(3)),
                () ->assertEquals(Arrays.asList(1,2,3,4), Kata.CreateList(4)),
                () ->assertEquals(Arrays.asList(1,2,3,4,5), Kata.CreateList(5)),
                () ->assertEquals(Arrays.asList(1,2,3,4,5,6), Kata.CreateList(6)));
    }
}
