package javaclub5.string.task64;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task64 {
    public int strCount(String text, String pattern){
        int count=0;
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        while (m.find()) {
            count++;
        }
        return count;
    }
    public static void main(Scanner sc) {
        Task64 obj = new Task64();

        try {
            System.out.println("Enter your message:");
            String text = sc.nextLine();
            System.out.println("Enter symbol to find");
            String pattern = sc.nextLine();

            System.out.println("There are "+obj.strCount(text, pattern)+ " \""+pattern +"\"" +" in this message");
        } catch (Exception e) {
            System.out.println("Wrong input");
        }
    }
}
