package main.java.com.softserve.string;

import main.java.com.softserve.MainClass;
import main.java.com.softserve.ReadConsole;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static main.java.com.softserve.statics.StaticImports.backToMenuOrRetry;
import static main.java.com.softserve.statics.StaticImports.start2TaskStrings;

public class Task2 extends ReadConsole {

    static String str;

    public static void main(String[] args) {

        start2TaskStrings();
        System.out.print("string = ");
        try {
            str = br.readLine();
            if (!isString(str)) {
                System.out.println("It's not a String");
                Task2.main(args);
            }
        } catch (NumberFormatException | IOException e) {
            System.out.println("==> It's not a String! Try again! <==");
            Task2.main(args);
        }

        System.out.print("Result: " + reverseWords(str));

        backToMenuOrRetry();
        try {
            switch (br.readLine()) {
                case "1":
                    MainClass.main(args);
                    break;

                case "2":
                    Task2.main(args);
                    break;

                default:
                    System.err.println("You need to do this: put 1 or 2");
                    System.err.println("Transfer to menu ");
                    Task2.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static boolean isString(String str) {
        Pattern pattern = Pattern.compile(new String("^[a-zA-Z\\s]*$"));
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public static String reverseWords(String str) {
        return Stream.of(str)
                .map(word->new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));
    }

}
