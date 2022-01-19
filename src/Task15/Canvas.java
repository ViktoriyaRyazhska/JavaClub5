package Task15;

public class Canvas {
    int width;
    int height;

    public Canvas(int width, int height) {
        this.width=width;
        this.height=height;
    }

    public Canvas draw(int x1, int y1, int x2, int y2) {
        return this;
    }

    public Canvas fill(int x, int y, char ch) {
        return this;
    }

    public String drawCanvas(int width, int height) {
       return null;
    }

    public static void main(String[] args) {

    }

}

//    public void drawLines() {
//        Canvas c = new Canvas(5, 5);
//        c.draw(0, 2, 4, 2).draw(2, 0, 2, 4);
//        assertEquals("-------\n|  x  |\n|  x  |\n|xxxxx|\n|  x  |\n|  x  |\n-------", c.drawCanvas());
//    }
//
//    public void drawRectangle() {
//        Canvas c = new Canvas(7, 7);
//        c.draw(1, 1, 5, 4);
//        assertEquals("---------\n|       |\n| xxxxx |\n| x   x |\n| x   x |\n| xxxxx |\n|       |\n|       |\n---------", c.drawCanvas());
//    }
//
//    public void fill() {
//        Canvas c = new Canvas(7, 7);
//        c.draw(1, 1, 5, 4).fill(3, 3, 'o');
//        assertEquals("---------\n|       |\n| xxxxx |\n| xooox |\n| xooox |\n| xxxxx |\n|       |\n|       |\n---------", c.drawCanvas());
//    }
//}
