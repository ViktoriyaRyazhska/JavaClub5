package one;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task41 {
    public static String[] fixTheMeerkat(String[] arr) {
        String[] answer = new String[arr.length];
        for(int i = arr.length - 1; i >= 0; i--)
            answer[answer.length - 1 - i] = arr[i];
        return answer;
    }

    public static void task41(BufferedReader reader) {
        System.out.println("The task is to reverse string array.");
        System.out.println("Print some text (separate words with whitespaces):");
        String[] strArr;
        try {
            strArr = reader.readLine().split(" ");
            System.out.println("Answer: ");
            for (String str : fixTheMeerkat(strArr))
                System.out.print(str + " ");
        } catch (Exception e) {
            System.out.println("Invalid text!");
        }

    }
}
