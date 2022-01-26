package three;

import java.io.BufferedReader;

public class Task68 {

    public static int nearestSq(final int n) {
        int sqUp = n;
        int sqDown = n;

        while (true) {
            if (Math.sqrt(sqUp) - Math.floor(Math.sqrt(sqUp)) == 0) {
                return sqUp;
            } else {
                sqUp++;
            }

            if (Math.sqrt(sqDown) - Math.floor(Math.sqrt(sqDown)) == 0) {
                return sqDown;
            } else {
                sqDown--;
            }
        }
    }

    public static void task68(BufferedReader reader) {
        System.out.println("The task is to find the nearest square number, nearest_sq(n), of a positive integer n.");
        try {
            System.out.println("Enter number:");
            int n = Integer.parseInt(reader.readLine());

            System.out.println("The nearest square, of given number is: " + nearestSq(n));
        } catch (Exception e) {
            System.out.println("Wrong input, please ensure you enter positive integer number!..");
        }
    }
}
