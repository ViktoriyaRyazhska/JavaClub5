package two;

import java.io.BufferedReader;
import java.util.regex.Pattern;

public class Task32 {
    public static String repeatStr (int repeat,String string) {
        String repeatString = "";
        for (int i = 0; i < repeat; i++) {
            repeatString += string;
        }
        return repeatString;
    }

    public static void task32(BufferedReader reader){
    System.out.println("Repeated of text");
    System.out.println("Enter number");
     try{
         int repeat = Integer.parseInt(reader.readLine());
         System.out.println("Enter word");
         String string = reader.readLine();
         if(Pattern.matches("[a-zA-Z]+",string)){
             System.out.println( "Result is " + repeatStr(repeat, string));
         }
     }
     catch (Exception e){
     System.out.println("Error");
     }
    }
}
