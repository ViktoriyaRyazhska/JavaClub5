package javaclub5.conditions.task22;

import java.util.Scanner;

/**
 * Created by Sergiy Zapadenko on 24.01.2022 11:26
 */
public class Task22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        start(scanner);
        scanner.close();
    }

    public static void start(Scanner scanner) {
        System.out.println("Program can say how old you will be in various years in the future such as 2090 or 3044.");
        System.out.println("Please enter some data (or 'Exit' for finish):");
        int birth = 0;
        int yearTo = 0;
        while (true) {
            System.out.println("Please enter your birthday year:");
            String str = scanner.nextLine();
            if (str.equalsIgnoreCase("exit")) break;
            try {
                birth = Integer.parseInt(str);
                System.out.println("Please enter year for counting:");
                str = scanner.nextLine();
                if (str.equalsIgnoreCase("exit")) break;
                yearTo = Integer.parseInt(str);
                System.out.println(AgeDiff.CalculateAge(birth, yearTo));
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
