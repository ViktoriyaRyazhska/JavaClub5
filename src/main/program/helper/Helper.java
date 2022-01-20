package program.helper;

import java.util.Scanner;

public class Helper {
    static Scanner scanner = new Scanner(System.in);

    public static int getInt(int max) {
        String line = scanner.nextLine();

        int i=0;
        try {
            i = Integer.parseInt(line);
        } catch (NumberFormatException e){
            System.out.println("Wrong input!");
            getInt(max);
        }
        return i;
    }
}