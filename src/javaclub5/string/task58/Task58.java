package javaclub5.string.task58;

import java.util.Scanner;

/**
 * Created by Sergiy Zapadenko on 24.01.2022 22:38
 */
public class Task58 {
    /*
    * Create a function that will return a string that combines all of the letters of the three inputed strings in groups.
    * Taking the first letter of all of the inputs and grouping them next to each other.
    * Do this for every letter, see example below!
    *
    * E.g. Input: "aa", "bb" , "cc" => Output: "abcabc"*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        start(scanner);
        scanner.close();
    }

    public static void start(Scanner scanner) {
        System.out.println("Program return a string that combines all of the letters of the three inputed strings in groups.");
        System.out.println("Ahtung! Ahtung! All of the inputs groups have to be the same length.");
        while (true) {
            try {
                System.out.println("Please enter three words the same length (or 'Exit' for finish):");
                System.out.print("1:");
                String str = scanner.nextLine();
                if (str.equalsIgnoreCase("exit")) break;
                String str1 = str.trim();
                System.out.print("2:");
                String str2 = scanner.nextLine().trim();
                System.out.print("3:");
                String str3 = scanner.nextLine().trim();
                System.out.println(Kata.tripleTrouble(str1,str2,str3));
            }catch (NullPointerException e) {
                System.out.println(e.toString());
            }catch (IllegalArgumentException e){
                System.out.println(e.toString());
            } catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}
