package javaclub5.loops.task32;

import javaclub5.conditions.task23.Kata;

import java.util.Scanner;

/**
 * Created by Sergiy Zapadenko on 24.01.2022 17:07
 */
public class Task32 {
    /*
    * Write a function called repeatStr which repeats the given string string exactly n times.
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        start(scanner);
        scanner.close();
    }

    public static void start(Scanner scanner) {
        System.out.println("Program repeat entered string.");

        while (true) {
            try {
                System.out.println("Please enter the string (or 'Exit' for finish):");
                String str = scanner.nextLine();
                if (str.equalsIgnoreCase("exit")) break;
                String string = str;
                System.out.println("Please enter count for repeat:");
                str = scanner.nextLine();
                int count = Integer.parseInt(str);
                System.out.println("Entered string: '" + string + "', x " + count + " times = " + Solution.repeatStr(count,string));
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e)  {
                System.out.println(e.getMessage());
            } catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}

