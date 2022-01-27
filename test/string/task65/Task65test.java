package string.task65;

import javaclub5.string.task65.Task65;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Task65test {
    @Test
    void Task65(){
        Assertions.assertAll(()-> assertEquals("a***i***r", Task65.sortAndStar(new String[]{"breath", "fresh", "i", "like","air"})),
                ()-> assertEquals("N***e***s***t***o***r", Task65.sortAndStar(new String[]{"name","is","my", "Nestor"})));
    }
}
