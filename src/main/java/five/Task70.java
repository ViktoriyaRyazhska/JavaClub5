package five;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task70 {
    public static List<Integer> CreateList(int number) {
        List<Integer> list = new ArrayList<>();
        for (int count = 1; count <= number; count++) {
            list.add(count);
        }
        return list;
    }

    public static void task70(BufferedReader reader) {
        System.out.println("This program should created an infinite loop");
        try {
            System.out.println("Enter your number in loop");
            int i = Integer.parseInt(reader.readLine());
            System.out.println("Loop is :" + CreateList(i));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Something went wrong");
        }
    }
}
