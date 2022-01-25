package five;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

public class Task35 {
    public static int[] map(int[] arr) {
        return Arrays.stream(arr).map(x -> x * 2).toArray();
    }

    public static void task35(BufferedReader reader) {
        System.out.println("Enter an array of integers, returns a new array with each doubled value.");
        try {
            System.out.println("Enter massive of integer for example : 3,4,5,6,7,1,2,3 ");
            String readLine = reader.readLine();
            int[] ints = Arrays.stream(readLine.split(",")).mapToInt(Integer::parseInt).toArray();
            System.out.println("Your input is " + Arrays.toString(ints));
            System.out.println("After doubled value : " + Arrays.toString(map(ints)));

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Something went wrong");
        }
    }
}
