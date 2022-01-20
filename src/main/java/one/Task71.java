package one;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Task71 {
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers)
    {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < listOfNumbers.size(); i++)
            if (listOfNumbers.get(i)%2 != 0)
                answer.add(listOfNumbers.get(i));
        return answer;
    }

    public static void task71() {
        System.out.println("The task is to delete all even elements in list.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Set list items in a line with a white space:");
        try {
            List<Integer> list = new ArrayList<>();
            list =  Arrays.stream((Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray())).boxed().toList();
            list = filterOddNumber(list);
            System.out.println("Answer:");
            for (int item : list)
                System.out.print(item + " ");
        } catch (Exception e) {
            System.out.println("Invalid parameters!");
        }
    }

}
