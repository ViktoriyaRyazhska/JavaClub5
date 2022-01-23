package javaclub5.classes.task15;

import java.util.ArrayList;
import java.util.List;

public class Canvas {
    private int width;
    private int height;
    private char[][] canvas;

    private enum FType {
        VL,                 //VerticalLine
        HL,                 //HorizontalLine
        RT                 //Rectangle
    }

    private class Figure {
        private int x1, y1, x2, y2;
        private FType fType;

        public Figure(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;

            if (x1 == x2) this.fType = FType.VL;
            else if (y1 == y2) this.fType = FType.HL;
            else this.fType = FType.RT;
        }

        public void draw() {
            if (this.fType == FType.VL) drawVerticalLine(y1, y2, x1);
            else if (this.fType == FType.HL) drawHorizontalLine(x1, x2, y1);
            else drawRectangle(x1, y1, x2, y2);
        }

        private void drawHorizontalLine(int x1, int x2, int y) {
            for (int i = x1 + 1; i <= x2 + 1; i++) {
                canvas[y + 1][i] = 'x';
            }
        }

        private void drawVerticalLine(int y1, int y2, int x) {
            for (int i = y1 + 1; i <= y2 + 1; i++) {
                canvas[i][x + 1] = 'x';
            }
        }

        private void drawRectangle(int x1, int y1, int x2, int y2) {
            drawHorizontalLine(x1, x2, y1);
            drawHorizontalLine(x1, x2, y2);
            drawVerticalLine(y1, y2, x1);
            drawVerticalLine(y1, y2, x2);
        }

        private void fill(char ch) {
            if (this.fType == FType.RT) {
                for (int j = this.x1 + 2; j <= this.x2; j++) {
                    for (int i = this.y1 + 2; i <= this.y2; i++) {
                        canvas[i][j] = ch;
                    }
                }
            }
        }

        private boolean isBelongs(int x, int y) {
            return (this.fType == FType.RT && x > x1 && x < x2 && y > y1 && y < y2);
        }

        private boolean isRT() {
            return this.fType == FType.RT;
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Canvas(int width, int height) {
        if (width < 1 || height < 1) throw new IllegalArgumentException();
        this.width = width;
        this.height = height;
        //canvas = new char[width][height];
        initCanvas(width + 2, height + 2);
    }

    private void initCanvas(int width, int height) {
        canvas = new char[height][width];
        initHorizontalLine(0);              //намалювали верхню, нижню стрічки
        initHorizontalLine(height - 1);
        initVerticaltalLine();                //намалювали середні ()
    }

    private void initHorizontalLine(int i) {
        for (int j = 0; j < canvas[0].length; j++) {
            canvas[i][j] = '-';
        }
    }

    private void initVerticaltalLine() {
        //заповнити всі елементи матриці крім першої і останньої строк (там --------
        for (int j = 1; j < canvas.length - 1; j++) {                     //|      |
            for (int i = 0; i < canvas[j].length; i++) {                  //--------
                if (i == 0 || i == (canvas[j].length - 1))
                    canvas[j][i] = '|'; //крайні колонки
                else
                    canvas[j][i] = ' ';  //всередині
            }
        }
    }


    public Canvas draw(int x1, int y1, int x2, int y2) throws IllegalArgumentException {
        if (x1 < 0 || x1 > getWidth()) throw new IllegalArgumentException();
        //if (x2 < x1|| y2 < y1) throw new IllegalArgumentException();
        if (x2 < 0 || x2 >= getWidth()) throw new IllegalArgumentException();
        if (y1 < 0 || y1 > getHeight() ) throw new IllegalArgumentException();
        if (y2 < 0 || y2 >= getHeight()) throw new IllegalArgumentException();

        if (x2 < x1|| y2 < y1){         //поміняти параметри місцями
            if (x2 < x1) { int x=x1;  x1=x2; x2=x; }
            if (y2 < y1) { int y=y1;  y1=y2; y2=y; }
        }

        Figure figure = new Figure(x1, y1, x2, y2);
        figure.draw();
        //figures.add(figure);
        return this;
    }


    public Canvas fill(int x, int y, char ch) {
        //якщо тачка заповнення попадає в рамку - заповнення не відбувається
        if (!checkFill(x, y)) return this;
        fillCanvas(x, y, ch);
        return this;
    }

    private void fillCanvas(int x, int y, char ch) {
        if (canvas[y][x] == ' ') canvas[y][x] = ch;
        if (x > 1               && canvas[y][x-1] == ' ') fillCanvas(x-1, y, ch);
        if (x < this.width   && canvas[y][x+1] == ' ') fillCanvas(x+1, y, ch);
        if (y > 1               && canvas[y-1][x] == ' ') fillCanvas(x, y-1, ch);
        if (y < this.height  && canvas[y+1][x] == ' ') fillCanvas(x, y+1, ch);
    }


    public boolean checkFill(int x, int y) {
        if ((x > getWidth() + 1) || (x < 0) || (y < 0) || (y > getHeight() + 1))
            throw new IllegalArgumentException();    //виходить за межі canvas
        if (canvas[y + 1][x + 1] != ' ') return false;
        else return true;
    }


    public String drawCanvas() {
        String strCanvas = "";
        for (int i = 0; i < canvas.length; i++) {
            strCanvas = strCanvas + String.valueOf(canvas[i]) + "\n";
        }
        return strCanvas = strCanvas.substring(0, strCanvas.length() - 1);    //видалити останній символ \n
    }

    @Override
    public String toString() {
        return drawCanvas();
    }
}
