package main.java.com.softserve.loops;

import main.java.com.softserve.ReadConsole;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static main.java.com.softserve.statics.StaticImports.*;

public class Task1 extends ReadConsole {

    static String str;
    static int repeat;

    public static void main(String[] args) {

        start1TaskLoops();
        System.out.print("n = ");
        try {
            repeat = Integer.parseInt(br.readLine());
            if (repeat < 0) {
                System.out.println("It's not a positive number");
                Task1.main(args);
            }
        } catch (NumberFormatException | IOException e) {
            System.out.println("==> It's not a number! Try again! <==");
            Task1.main(args);
        }

        System.out.print("string = ");
        try {
            str = br.readLine();
            if (!isString(str)) {
                System.out.println("It's not a String");
                Task1.main(args);
            }
        } catch (NumberFormatException | IOException e) {
            System.out.println("==> It's not a String! Try again! <==");
            Task1.main(args);
        }

        System.out.print("Result: " + repeatStr(repeat, str));
    }

    static boolean isString(String str) {
        Pattern pattern = Pattern.compile(new String("^[a-zA-Z\\s]*$"));
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public static String repeatStr(int repeat, String str) {
        return (str.repeat(repeat));
    }

}

