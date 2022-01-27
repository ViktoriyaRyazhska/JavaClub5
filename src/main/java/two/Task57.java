package two;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class Task57 {
    public static String reg(String inputString){
        return inputString.replaceAll("\\s+","");

    }

    public static void task57(BufferedReader reader){
        System.out.println("Remove string spaces");
        System.out.println("Enter value");

        try {
           String inputString = reader.readLine();
          //  String reversedString = inputString.replaceAll("\\s+","");
            System.out.println(reg(inputString));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
