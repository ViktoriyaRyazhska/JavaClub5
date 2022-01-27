package five;

import org.junit.Test;
//import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 public class Task10Test {
    @Test
    public void exampleTests(){
        assertEquals("15-20", Task10.datingRange(17));
        assertEquals("27-66", Task10.datingRange(40));
        assertEquals("14-16", Task10.datingRange(15));
        assertEquals("24-56", Task10.datingRange(35));
        assertEquals("9-11", Task10.datingRange(10));
    }
}