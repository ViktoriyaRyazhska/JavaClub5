package three;
import java.io.BufferedReader;

public class Task13 {

    private static final int ONE_HUNDRED = 100;

    public static final Task13 INST = new Task13();

    private static int value;

    private Task13() {
        value = ONE_HUNDRED;
    }

    public static int plus100(int n) {
        return value + n;
    }


    public static void task13(BufferedReader reader) {
        System.out.println("The task is to fix a method plus100 which is supposed to return the number of the parameter incremented by 100..");
        try {
            System.out.println("Set parameter:");
            int i = Integer.parseInt(reader.readLine());
            System.out.println("Answer: " + Task13.INST.plus100(i));
        } catch (Exception e) {
            System.out.println("Invalid parameter!");
        }
    }
}

/*      FIXME: Static electrickery
The code provided has a method plus100 which is supposed to return the number of the parameter incremented by 100.

But it's not working properly.
Task

Fix the code so we can all go home early.
Restrictions

    Do not modify the constructor
    Do not modify the plus100 method
    Do not modify the ONE_HUNDRED declaration
*/
