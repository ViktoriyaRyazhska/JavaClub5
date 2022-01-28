package javaclub5.loops.task10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * My head is at the wrong end!
 *
 * @author Mysakovych Maksym
 */

public class Runner {
    public static String[] fixTheMeerkat(String[] array) {
        String[] result = new String[3];
        result[0] = array[2];
        result[1] = array[1];
        result[2] = array[0];
        return result;
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        start(br);
    }

    public static void start(BufferedReader br) {
        System.out.println("Save the animals by switching them back. You will be given an array which will " +
                "have three values (tail, body, head). It is your job to re-arrange the array so that the animal " +
                "is the right way round (head, body, tail).");
        try {
            String[] array = new String[3];
            System.out.println("Enter first body part: ");
            array[0] = br.readLine();
            System.out.println("Enter second body part: ");
            array[1] = br.readLine();
            System.out.println("Enter third body part: ");
            array[2] = br.readLine();
            System.out.println("Now is the right way of body parts: " + Arrays.toString(Runner.fixTheMeerkat(array)));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
