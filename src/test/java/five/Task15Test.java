package five;

import org.junit.Test;
//import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task15Test {
    String s = System.lineSeparator();

    @Test
    public void drawLines() {
        Task15 c = new Task15(5, 5);
        c.canvas.draw(0, 2, 4, 2).draw(2, 0, 2, 4);

        assertEquals("-------" + s + "|  x  |" + s + "|  x  |" + s + "|xxxxx|" + s + "|  x  |" + s + "|  x  |" + s + "-------", c.canvas.drawCanvas());
    }

    @Test
    public void drawRectangle() {
        Task15 c = new Task15(7, 7);
        c.canvas.draw(1, 1, 5, 4);
        assertEquals("---------" + s + "|       |" + s + "| xxxxx |" + s + "| x   x |" + s + "| x   x |" + s + "| xxxxx |" + s + "|       |" + s + "|       |" + s + "---------", c.canvas.drawCanvas());
    }

    @Test
    public void fill() {
        Task15 c = new Task15(7, 7);
        c.canvas.draw(1, 1, 5, 4).fill(3, 3, 'o');
        assertEquals("---------" + s + "|       |" + s + "| xxxxx |" + s + "| xooox |" + s + "| xooox |" + s + "| xxxxx |" + s + "|       |" + s + "|       |" + s + "---------", c.canvas.drawCanvas());
    }
}