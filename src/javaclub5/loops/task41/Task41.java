package javaclub5.loops.task41;

import java.util.Scanner;
import java.util.Arrays;

//public class Task41 {

    /*You're at the zoo... all the meerkats look weird.
    Something has gone terribly wrong - someone has gone and switched their heads and tails around!
    Save the animals by switching them back.
    You will be given an array which will have three values (tail, body, head).
    It is your job to re-arrange the array so that the animal is the right way round (head, body, tail).
    Same goes for all the other arrays/lists that you will get in the tests: you have to change the element positions with the same exact logics
     */

    public class Task41 {
        public static String[] fixTheMeerkat(String[] array) {
            String[] result = new String[3];
            result[0] = array[2];
            result[1] = array[1];
            result[2] = array[0];
            return result;
            }

            public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            start(scanner);
            }

            public static void start(Scanner scanner) {
            System.out.println("Save the animals by switching them back. ");
            try {
                String[] array = new String[3];
                System.out.println("Enter first body part: ");
                array[0] = scanner.nextLine();
                System.out.println("Enter second body part: ");
                array[1] = scanner.nextLine();
                System.out.println("Enter third body part: ");
                array[2] = scanner.nextLine();
                System.out.println("Now is the right way of body parts: " + Arrays.toString(Task41.fixTheMeerkat(array)));
                } catch (Exception e) {
                System.out.println(e.getMessage());
                }
            }
    }
