package main.java.com.softserve.string;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import main.java.com.softserve.MainClass;
import main.java.com.softserve.ReadConsole;

import static main.java.com.softserve.statics.StaticImports.backToMenuOrRetry;
import static main.java.com.softserve.statics.StaticImports.start3TaskStrings;

public class Task3 extends ReadConsole {

    static String[] name;
    static String nameString;
    static String city;
    static String state;

    public static void main(String[] args) {

        start3TaskStrings();
        System.out.print("name = ");
        name = wordsOfWelcome(nameString).split(" ");
        System.out.print("city = ");
        city = wordsOfWelcome(city);
        System.out.print("state/region = ");
        state = wordsOfWelcome(state);

        System.out.print("Say: " + sayHello(name, city, state));

        backToMenuOrRetry();
        try {
            switch (br.readLine()) {
                case "1":
                    MainClass.main(args);
                    break;

                case "2":
                    Task3.main(args);
                    break;

                default:
                    System.err.println("You need to do this: put 1 or 2");
                    System.err.println("Transfer to menu ");
                    Task3.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String wordsOfWelcome(String i) {
        try {
            i = String.valueOf(br.readLine());
            if (!isString(i)) {
                System.out.println("It's not a String");
                Task3.main(new String[0]);
            }
        } catch (IOException e) {
            System.out.println("==> It's not a String! Try again! <==");
            Task3.main(new String[0]);
        }
        return i;
    }

    static boolean isString(String str) {
        Pattern pattern = Pattern.compile(new String("^[a-zA-Z\\s]*$"));
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public static String sayHello(String[] name, String city, String state) {
        StringBuilder sb = new StringBuilder();

        for (String value : name) {
            sb.append(value).append(" ");
        }

        return String.format("Hello, %s! Welcome to %s, %s!", sb.toString().trim(), city, state);
    }

}
