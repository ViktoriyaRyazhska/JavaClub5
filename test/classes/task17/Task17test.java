package classes.task17;

import  javaclub5.classes.task17.Task17;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task17test {
    @Test
    void Task17() throws  Exception{
        Task17.Block a = new Task17.Block(new int[]{3,4,6});
        Assertions.assertAll(()-> assertEquals(6,a.getHeight()),
                ()->assertEquals(4,a.getLength()),
                ()->assertEquals(3,a.getWidth()),
                ()-> assertEquals(72,a.getVolume()),
                ()-> assertEquals(108,a.getSurfaceArea()));

    }


}
