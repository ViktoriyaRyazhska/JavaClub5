package four;

import java.io.BufferedReader;
import java.util.Arrays;

public class Task34 {
    public static int getAverage(int[] marks){
     int sum=0;
        for (int i = 0; i <marks.length ; i++) {
            sum = sum + marks[i];
        }
        return sum/marks.length;
    }

    public static void task34(BufferedReader reader) {
        System.out.println("It's the academic year's end, fateful moment of your school report." +
                " The averages must be calculated. All the students come to you and entreat you to " +
                "calculate their average for them. Easy ! You just need to write a script.");


        try {
            System.out.println("Set array:");
            int[] numbersArray = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();
            System.out.println("Answer:  the average of the given array is --> " +getAverage(numbersArray));

        } catch (Exception e) {
            System.out.println("Invalid parameter!");
        }
    }
}
