package five;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

public class Task40 {
    public static int sum(int[] arr){
        return Arrays.stream(arr).filter(x -> x > 0).sum();
    }

    public static void task40(BufferedReader reader) {
        System.out.println("Enter an array of numbers, returns the sum of all of the positives ones.");
        try {
            System.out.println("Enter massive of integer for example : 3,-4,5,6,-7,1,2,3 ");
            String readLine = reader.readLine();
            int[] ints = Arrays.stream(readLine.split(",")).mapToInt(Integer::parseInt).toArray();
            System.out.println("Your input is " + Arrays.toString(ints));
            System.out.println("Sum of value : " + sum(ints));

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Something went wrong");
        }
    }
}
