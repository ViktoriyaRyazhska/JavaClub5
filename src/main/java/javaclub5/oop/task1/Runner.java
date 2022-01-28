package javaclub5.oop.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Basic subclasses - Adam and Eve
 *
 * @author Mysakovych Maksym
 */

public class Runner {
    public static Human[] create() {
        return new Human[]{new Man("Adam"), new Woman("Eve")};
    }

    public static void start(BufferedReader br) {
        try {
            System.out.println("In this task we will do the God's creation.Humans.");
            System.out.println("Name of man: ");
            String nameMan = br.readLine();
            System.out.println("Name of women: ");
            String nameWomen = br.readLine();
            System.out.println("Here is the God's creation!" + "\n" +
                    Arrays.toString(create()));
        } catch (Exception e) {
            System.out.println("Wrong input.");
        }
    }
}
