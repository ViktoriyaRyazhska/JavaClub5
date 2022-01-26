package three;

import static org.junit.jupiter.api.Assertions.*;

class Task03Test {
    private static final double delta = 0.0001;

    @org.junit.jupiter.api.Test
    void task03() {
        assertEquals(6, Task03.getVolumeOfCuboid(1, 2, 3), delta);

        assertEquals(-4, Task03.getVolumeOfCuboid(-1, 2, 2), delta);

        assertEquals(1640, Task03.getVolumeOfCuboid(8.2, 10, 20), delta);
    }
}