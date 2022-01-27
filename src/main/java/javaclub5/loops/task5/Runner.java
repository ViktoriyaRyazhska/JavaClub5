package javaclub5.loops.task5;

import java.io.BufferedReader;
import java.io.IOException;

public class Runner {

    public static void start(BufferedReader reader) {
        System.out.println("let's count your sheep");
        System.out.println("How many sheep do you have?");
        try {
            int sheepCount = Integer.parseInt(reader.readLine());
            Boolean [] sheep = new Boolean[sheepCount];
            for (int i = 0; i < sheepCount; i++) {
                System.out.printf("Is %d ship present? true/false", i);
                sheep[i] = Boolean.parseBoolean(reader.readLine());
            }
            System.out.printf("There are %d sheep in total\n", countSheeps(sheep));
        } catch (IOException e) {
            System.out.println("Wrong Input");;
        }

    }

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            try {
                if (arrayOfSheeps[i].equals(true))
                    count++;
            }
            catch (NullPointerException e) {
            }
        }
        return count;
    }
}
