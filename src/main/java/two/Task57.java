package two;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class Task57 {
    public static void task57(BufferedReader reader){
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
