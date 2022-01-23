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
    }/*
    public static void main(String[] args) {
        Task64 obj = new Task64();
        Scanner sc = new Scanner(System.in);

        try {
            String text = sc.nextLine();
            String pattern = sc.nextLine();


            System.out.println(obj.strCount(text, pattern));
        } catch (Exception e) {
            System.out.println("Wrong input");
        }
    }*/
}
