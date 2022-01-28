package javaclub5.string.task68;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Sergiy Zapadenko on 27.01.2022 18:02
 */
class Task68Test {

    @Test
    void removeExclamation() {
        assertEquals("Hi", Task68.removeExclamation("Hi!", 1));
        assertEquals("Hi", Task68.removeExclamation("Hi!", 100));
        assertEquals("Hi!!", Task68.removeExclamation("Hi!!!", 1));
        assertEquals("Hi", Task68.removeExclamation("Hi!!!", 100));
        assertEquals("Hi", Task68.removeExclamation("!Hi", 1));
        assertEquals("Hi!", Task68.removeExclamation("!Hi!", 1));
        assertEquals("Hi", Task68.removeExclamation("!Hi!", 100));
        assertEquals("!!Hi !!hi!!! !hi", Task68.removeExclamation("!!!Hi !!hi!!! !hi", 1));
        assertEquals("Hi !!hi!!! !hi", Task68.removeExclamation("!!!Hi !!hi!!! !hi", 3));
        assertEquals("Hi hi!!! !hi", Task68.removeExclamation("!!!Hi !!hi!!! !hi", 5));
        assertEquals("Hi hi hi", Task68.removeExclamation("!!!Hi !!hi!!! !hi", 100));
    }

}