package three;
import java.io.BufferedReader;

public class Task18 {
    public static int opposite(int number)
    {
        return number - 2 * number;
    }


    public static void task18(BufferedReader reader) {
        System.out.println("The task is to , given an integer or a floating-point number, find its opposite.");
        try {
            System.out.println("Set number:");
            int i = Integer.parseInt(reader.readLine());
            System.out.println("The opposite number is: " + opposite(i));
        } catch (Exception e) {
            System.out.println("Invalid parameter!");
        }
    }
}

/*      Opposite number
Very simple, given an integer or a floating-point number, find its opposite.
Examples:
1: -1
14: -14
-34: 34
*/
