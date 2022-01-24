package two;

import java.io.BufferedReader;
import java.io.IOException;

public class Task62 {
    public static void task62(BufferedReader reader){
        System.out.println("Remove string spaces");
        System.out.println("Enter value");
        String inputString = null;
        try {
            inputString = reader.readLine();
            String reversedString = inputString.replaceAll("\\s+","");
            System.out.println(reversedString);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
