package five;

import java.io.BufferedReader;
import java.io.IOException;

public class Task25 {

    public static void task25(BufferedReader reader) {
        System.out.println("Function that will take the number of petals of each flower and return true if they are in love and false if they aren't.");
        try {
            System.out.println("Input the number of flower 1 ");
            int flower1  = Integer.parseInt(reader.readLine());
            System.out.println("Input the number of flower 2 ");
            int flower2 = Integer.parseInt(reader.readLine());
            System.out.println("Your love is : " + Task25.isLove(flower1, flower2));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Something went wrong");
        }
    }

    public static boolean isLove(final int flower1, final int flower2) {
        int sum = flower1 + flower2;
        return sum % 2 != 0;
    }
}
