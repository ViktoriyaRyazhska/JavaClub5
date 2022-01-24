package javaclub5.loops.task44;

import java.util.Scanner;

/**
 * Created by Sergiy Zapadenko on 24.01.2022 19:12
 */
public class Task44 {
    /*
    * program that finds the summation of every number from 1 to num.
    * The number will always be a positive integer greater than 0.
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        start(scanner);
        scanner.close();
    }

    public static void start(Scanner scanner) {
        System.out.println("Program that finds the summation of every number from 1 to num");

        while (true) {
            try {
                System.out.println("Please enter a positive num (or 'Exit' for finish):");
                String str = scanner.nextLine();
                if (str.equalsIgnoreCase("exit")) break;
                int n = Integer.parseInt(str);
                System.out.println(GrassHopper.summation(n));
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
