package javaclub5.strings.task9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    public static void start(BufferedReader br)
    {
        try {
            System.out.println("Enter symbol to find his position in alphabet");
            String str2 = br.readLine();
            if(str2.length()>1){
                System.out.println("Too long input, selected position of a first symbol");
            }
            char ch = str2.charAt(0);
            System.out.println("Result: " + position(ch));
        } catch (IOException e) {
            System.out.println("Wrong input");
        }
    }
    public static String position(char alphabet)
    {
        int pos = ((int) alphabet - 96);
        String str = "Position of alphabet: " + pos;
        if(pos>0 && pos < 27)
            return str;
        else
            return "Not an english alphabet letter";
    }
}
