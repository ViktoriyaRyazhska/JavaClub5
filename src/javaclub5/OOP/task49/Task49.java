package javaclub5.OOP.task49;

import javaclub5.loops.task44.GrassHopper;

import java.util.Scanner;

/**
 * Created by Sergiy Zapadenko on 24.01.2022 19:50
 */
public class Task49 {
    /*
    * The objective of this Kata is to provide some way to encode a string into its leetspeak version.
    *
    * The encode method should return an empty String if a null parameter is passed.
    *
    * If any uppercase character is given, it should be compared also with the dictionary, 'a' gives '4' but 'A' gives also '4'.
    *
    * If any character outside the dictionary is given, it should be output as is.
    *
    *   The following dictionary has to be used :
    *   a -> 4
        e -> 3
        l -> 1
        m -> /^^\
        o -> 0
        u -> (_)
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        start(scanner);
        scanner.close();
    }

    public static void start(Scanner scanner) {
        System.out.println("Program that provide some way to encode a string into its leetspeak version");

        while (true) {
            try {
                System.out.println("Please enter some word for encoding (or 'Exit' for finish):");
                String str = scanner.nextLine();
                if (str.equalsIgnoreCase("exit")) break;
                Leetspeak myEncoder = new Leetspeak();
                System.out.println(myEncoder.encode(str));
            }catch (NullPointerException e){
                System.out.println(e.toString());
            } catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}
