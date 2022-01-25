package two;

import java.io.BufferedReader;
import java.io.IOException;

public class Task67 {
    public static String Reg(String string) {
        String result = "";
        for (char c : string.toCharArray()) {
            if(Character.isUpperCase(c)) {
                result += Character.toLowerCase(c);
            } else {
                result += Character.toUpperCase(c);
            }
        }
        return result;
    }
    public static void task67(BufferedReader reader) {
        System.out.println("Change register");
        try{
            System.out.println("Enter our text");
            String string = reader.readLine();
            System.out.println(Reg(string));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
