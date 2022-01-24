package javaclub5.loops.task43;

import java.util.Scanner;

/**
 * Created by Sergiy Zapadenko on 24.01.2022 17:52
 */
public class Task43 {
    /*task is to find the nearest square number, nearest_sq(n), of a positive integer n.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        start(scanner);
        scanner.close();
    }

    public static void start(Scanner scanner) {
        System.out.println("Program finds the nearest square number, nearest_sq(n), of a positive integer n..");

        while (true) {
            try {
                System.out.println("Please enter a positive integer (or 'Exit' for finish):");
                String str = scanner.nextLine();
                if (str.equalsIgnoreCase("exit")) break;
                int n = Integer.parseInt(str);
                System.out.println(CodeWarsMath.nearestSq(n));
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
