package OOP.task49;

import javaclub5.OOP.task49.Leetspeak;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task49test {
    Leetspeak myEncoder = new Leetspeak();
    @Test
    void Leetspeak() {

        Assertions.assertAll(() ->assertEquals("/^^\\"+"0"+"4", myEncoder.encode("moa")),
                () ->assertEquals("1"+"0"+"(_)", myEncoder.encode("lou")),
                () ->assertEquals("3"+"1"+"0", myEncoder.encode("elo")),
                () ->assertEquals("/^^\\"+"1"+"(_)", myEncoder.encode("mlu")));

    }

    @Test
    void LeetspeakExceptionTest() {
        assertThrows(NullPointerException.class,
                () -> myEncoder.encode(null),
                () -> myEncoder.encode(""));
    }
}
