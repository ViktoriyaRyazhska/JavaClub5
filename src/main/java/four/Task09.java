package four;



import java.io.BufferedReader;

public class Task09 {
    public static int makeNegative(final int x) {

        return  -Math.abs(x);
    }
    public static void task09(BufferedReader reader) {
        System.out.println("In this simple assignment you are given a number and have to make it negative.");
        try {
            System.out.println("Set parameter numerator:");
            final int n = Integer.parseInt(reader.readLine());

            System.out.println("Answer:  is--> "+ makeNegative(n));
        } catch (Exception e) {
            System.out.println("Invalid parameter!");
        }
    }

}