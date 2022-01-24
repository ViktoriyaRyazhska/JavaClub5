package javaclub5.string.task57;

import java.util.Scanner;

/**
 * Created by Sergiy Zapadenko on 24.01.2022 21:42
 */
public class Task57 {
    /*
    * Simple, remove the spaces from the string, then return the resultant string.
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        start(scanner);
        scanner.close();
    }

    public static void start(Scanner scanner) {
        System.out.println("Program removes the spaces from the string, then return the resultant string");

        while (true) {
            try {
                System.out.println("Please enter some string with spaces (or 'Exit' for finish):");
                String str = scanner.nextLine();
                if (str.equalsIgnoreCase("exit")) break;
                System.out.println(Kata.noSpace(str));
            }catch (NullPointerException e){
                System.out.println(e.toString());
            } catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}
