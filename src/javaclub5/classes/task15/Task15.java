package javaclub5.classes.task15;

public class Task15 {
    /*You are going to write a simple console-style drawing board program.
    *
    * Functions
    * The drawing board is very simple so only these functions are supported.
    *
    * Function: Create canvas
    * Description: Create new empty canvas (filled with ' ') with given width and height
    *
    * Function:Draw line / rectangle
    * Description:Draw the line with 'x' which connects the given points.
                  If the points are diagonal, a rectangle instead of diagonal line should be drawn
    *
    * Function:Fill color
    * Description:Fill the entire area connected to the given point with given character, also known as "bucket fill" in paint programs
    * */

    public static void main() {
        System.out.println("Program  write a simple console-style drawing board program");
        System.out.println("Example 1: canvas 7x7 and filled by 'o' rectangle[1,1,5,4,] ");
        Canvas c = new Canvas(7, 7);
        c.draw(1, 1, 5, 4).fill(3, 3, 'o');
        c.drawCanvas();
        System.out.println(c);


        System.out.println("\nExample 2: canvas 5x5 and two lines [0, 2, 4, 2] and [2, 0, 2, 4]");
        c = new Canvas(5, 5);
        c.draw(0, 2, 4, 2).draw(2, 0, 2, 4);
        System.out.println(c);

        System.out.println("\nExample 3: canvas 20x4, two lines [0, 1, 5, 1] and [5, 2, 5, 3]");
        System.out.println("not filed rectangle [13,0,17,2] and filling arr area by '.' in [9,2]");
        c = new Canvas(20, 4);
        c.draw(0, 1, 5, 1).draw(5, 2, 5, 3).draw(13,0,17,2).fill(9,2,'.');
        System.out.println(c);


//        c = new Canvas(36, 32);
//        c.draw(22, 13,29, 5);
//        c.draw(15, 26,32, 16);
//        c.draw(10, 31,13, 13);
//        c.draw(32, 20,28, 18);
//        c.draw(20, 0,2, 2);
//        c.draw(25, 3,31, 3);
//        c.draw(18, 10, 15, 29);
//        c.draw(25, 1, 32, 30);
//        c.draw(13, 28, 16, 6);
//        c.draw(33, 23, 0, 18);
//        c.draw(31, 23, 14, 23);
//        c.draw(0, 4, 34, 11);
//        c.draw(35, 28, 27, 22);
//        c.draw(28, 30, 31, 28);
//        c.draw(32, 25, 14, 4);
//        c.draw(29, 25, 8, 2);
//        c.fill(12, 8, 'a');
//        c.fill(23, 31,'b');
//        c.fill(26, 12,'c');
//        c.fill(1, 4,'d');
//        c.fill(0, 27,'e');
//        c.fill(23, 2,'f');
//        c.fill(3, 2,'g');
//        c.fill(3, 21, 'h');
//        c.fill(5, 13,'i');
//        c.fill(17, 29,'j');
//        c.fill(4, 14, 'k');
//        c.fill(9, 20, 'l');
//        c.fill(9, 22, 'm');
//        c.fill(34, 20, 'n');
//        c.fill(0, 8, 'o');
//        c.fill(6, 15, 'p');
//        c.fill(24, 24, 'q');
//        c.fill(24, 7, 'r');
//        c.fill(6, 19, 's');
//        c.fill(13, 4, 't');
//        c.fill(14, 10, 'u');
//        c.fill(8, 7, 'v');
//        c.fill(11, 26, 'w' );
//        c.fill(4, 17, 'y');
//        c.fill(10, 18, 'z');
//        System.out.println(c);
    }


}
