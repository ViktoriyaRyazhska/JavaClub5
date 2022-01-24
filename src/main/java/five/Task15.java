package five;

import java.util.Arrays;

public class Task15 {
    Canvas canvas;

    public Task15(int width, int height) {
        canvas = new Canvas(width, height);
    }

    public static void main(String[] args) {

//        Task15 task15 = new Task15(5, 5);
//        System.out.println(task15.canvas.draw(0, 2, 4, 2)
//                .draw(2,0,2,4)
//                .drawCanvas());
                Task15 task15 = new Task15(20, 4);
        System.out.println(task15.canvas.draw(0, 1, 5, 1)
                .draw(5, 2, 5, 3)
                .draw(13, 0, 17, 2)
                .fill(9, 2, 'o').drawCanvas());
    }

    public class Canvas {
        int width;
        int height;
        char[][] result;

        public Canvas(int width, int height) {
            if (width < 1 || height < 1) {
                throw new IllegalArgumentException("Input correct canvas");
            }
            this.width = width;
            this.height = height;
            result = new char[height + 2][width + 2];
        }

        // 0      2        4       2
        public Canvas draw(int x1, int y1, int x2, int y2) {
            if (x1 > width || y1 > height || x2 > width || y2 > width) {
                throw new IllegalArgumentException("Input correct canvas");
            }

            for (int i = 0; i < width + 2; i++) {
                result[0][i] = '-';
                result[height + 1][i] = '-';
            }
            for (int i = 1; i < height + 1; i++) {
                result[i][0] = '|';
                result[i][width + 1] = '|';
            }
            if (x1 == x2 || y1 == y2) {
                for (int i = y1 + 1; i <= y2 + 1; i++) {
                    for (int j = x1 + 1; j <= x2 + 1; j++) {
                        result[i][j] = 'x';
                    }
                }
            } else {
                for (int i = y1 + 1; i <= y2 + 1; i++) {
                    for (int j = x1 + 1; j <= x2 + 1; j++) {
                        if (i == y1 + 1 || i == y2 + 1) {
                            result[i][j] = 'x';
                        }
                    }
                    result[i][x1 + 1] = 'x';
                    result[i][x2 + 1] = 'x';
                }
            }
            for (int i = 0; i < height + 1; i++) {
                for (int j = 0; j < width + 1; j++) {
                    if (result[i][j] == 0) {
                        result[i][j] = ' ';
                    }
                }
            }
            return this;
        }

        public Canvas fill(int x, int y, char ch) {
            if (x > width || y > height) {
                throw new IllegalArgumentException("Input correct canvas");
            }
            for (int i = 3; i < y + 2; i++) {
                for (int j = 3; j < x + 3; j++) {
                    result[i][j] = ch;
                }
            }
            return this;
        }

        public String drawCanvas() {
            String separator = "";
            StringBuilder sb = new StringBuilder();
            for (char[] str : result) {
                sb.append(separator);
                for (char s : str) {
                    separator = System.lineSeparator();
                    sb.append(s);
                }
            }
            return sb.toString();
        }
    }
}
