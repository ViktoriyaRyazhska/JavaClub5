package one;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task71 {
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers) {
        List<Integer> answer = new ArrayList<>();
        for (Integer listOfNumber : listOfNumbers)
            if (listOfNumber % 2 != 0)
                answer.add(listOfNumber);
        return answer;
    }

    public static void task71(BufferedReader reader) {
        System.out.println("The task is to delete all even elements in list.");
        System.out.println("Set list items in a line with a white space:");
        try {
            List<Integer> list =  Arrays.stream((Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray())).boxed().toList();
            list = filterOddNumber(list);
            System.out.println("Answer:");
            for (int item : list)
                System.out.print(item + " ");
        } catch (Exception e) {
            System.out.println("Invalid parameters!");
        }
    }
}
