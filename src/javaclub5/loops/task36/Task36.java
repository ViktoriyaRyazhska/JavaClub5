package javaclub5.loops.task36;

import java.util.Scanner;

public class Task36 {

    public static void start(Scanner scanner) {
        System.out.println("Enter a true or a false some times: ");
        try {
            Boolean a = Boolean.parseBoolean(scanner.nextLine());
            Boolean b = Boolean.parseBoolean(scanner.nextLine());
            Boolean c = Boolean.parseBoolean(scanner.nextLine());
            Boolean d = Boolean.parseBoolean(scanner.nextLine());
            Boolean e = Boolean.parseBoolean(scanner.nextLine());

            Boolean[] sheeps = new Boolean[]{a, b, c, d, e};

            System.out.println("The count of sheeps is: " + countSheeps(sheeps));

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int countSheeps = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i] == true) {
                countSheeps++;
            }
        }
        return countSheeps;
    }

}
