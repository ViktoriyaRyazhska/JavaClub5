package javaclub5.loops.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        start(br);
    }

    public static void start(BufferedReader br) {
        System.out.println("Enter number of times to repeat the string");
        try {
            int repeat = Integer.parseInt(br.readLine());
            System.out.println("Enter string to repeat");
            String string = br.readLine();
            System.out.println("Result " + repeatStr(repeat,string));
        } catch (IOException e) {
            System.out.println("Wrong input");
            System.out.println(e.getMessage());
        }

    }
    public static String repeatStr(final int repeat, final String string) {
        String str = "";
        for(int i = 0; i<repeat;i++){
            str += string;
        }
        return str;
    }
}
