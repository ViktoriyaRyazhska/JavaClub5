package javaclub5.classes.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        start(reader);
    }
    public static void start(BufferedReader reader) {
        System.out.println("Simple Drawing Board, Draw the line with 'x' which connects the given points.");
        try {
            System.out.println("Enter the width and height of the canvas size");
            System.out.println("Enter width");
            int width = Integer.parseInt(reader.readLine());
            System.out.println("Enter height");
            int height = Integer.parseInt(reader.readLine());
            System.out.println("Enter your coordinates - x1,x2,y1,y2 ");
            String coordinates = reader.readLine();
            String[] splitCoordinates = coordinates.split(",");
            System.out.println("Enter coordinated to fill - x,y,char");
            String fill = reader.readLine();
            String[] splitFill = fill.split(",");
            System.out.println("Your picture is : ");
            Canvas canvas = new Canvas(width, height);
            System.out.println(canvas
                    .draw(Integer.parseInt(splitCoordinates[0]), Integer.parseInt(splitCoordinates[1]), Integer.parseInt(splitCoordinates[2]), Integer.parseInt(splitCoordinates[3]))
                    .fill(Integer.parseInt(splitFill[0]), Integer.parseInt(splitFill[1]), splitFill[2].charAt(0))
                    .drawCanvas());

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Something went wrong");
        }
    }
    public static class Canvas {
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
            if (x1 > width || y1 > height || x2 > width || y2 > height) {
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

            if (result[x][y] == ' ') {
                result[x][y] = ch;
                fill(x + 1, y, ch);
                fill(x - 1, y, ch);
                fill(x, y - 1, ch);
                fill(x, y + 1, ch);
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
            String result = sb.toString();
            result = result.replaceAll("\r", "");
            return result;
        }
    }


}





