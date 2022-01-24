package main.java.com.softserve.string;

import main.java.com.softserve.MainClass;
import main.java.com.softserve.ReadConsole;

import java.io.IOException;

import static main.java.com.softserve.statics.StaticImports.*;

//need to rework!!!!!!!
public class Task14 extends ReadConsole {
    static String str;

    static int counter = 0;
    public static void main(String[] args) throws IOException {

        start14TaskStrings();

        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }


        toDoIn14Strings();

        char letter = (char) br.read();

        System.out.println("Result: " + strCount(str, letter));


        backToMenuOrRetry();

        try {
            switch (br.readLine()) {
                case "1":
                    MainClass.main(args);
                    break;
                case "2":
                    Task16.main(args);
                    break;
                default:
                    System.err.println("You need to do this: put 1 or 2 ");
                    System.err.println("Transfer to menu ");
                    Task14.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int strCount(String str, char letter) {
        for(char character : str.toCharArray()) {
            if(letter == character) {
                counter++;
            }
        }
        return counter;
    }





}
