package two;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class Task52 {
    public static String reg(String inputString){
        return ((Pattern.matches("[a-zA-Z]+",inputString)? new StringBuffer(inputString).reverse().toString():"Invalid value" ));

    }

    public static void task52(BufferedReader reader){
    System.out.println("Reversed strings");
    System.out.println("Enter value");
    //String inputString = null;
    try {
       String inputString = reader.readLine();
        System.out.println(reg(inputString));
       /*
        if((Pattern.matches("[a-zA-Z]+",inputString))){
            String reversedString = new StringBuffer(inputString).reverse().toString();
            System.out.println(reversedString);


        }
        else{
            System.out.println("Invalid value");
            }

        */
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}
