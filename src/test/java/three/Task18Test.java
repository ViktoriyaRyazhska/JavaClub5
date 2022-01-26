package three;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task18Test {

    @Test
    void task18() {
          assertEquals(7, Task18.opposite(-7));
          assertEquals(-6, Task18.opposite(6));
          assertEquals(0, Task18.opposite(0));
    }
}