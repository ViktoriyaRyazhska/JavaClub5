package javaclub5.string.task60;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Sergiy Zapadenko on 28.01.2022 13:15
 */
class Task60Test {

    @Test
    void fakeBin() {
        assertEquals("01011110001100111", Task60.fakeBin("45385593107843568"));
        assertEquals("101000111101101", Task60.fakeBin("509321967506747"));
        assertEquals("011011110000101010000011011", Task60.fakeBin("366058562030849490134388085"));
    }
}