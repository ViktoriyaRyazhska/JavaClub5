package javaclub5.conditions.task14;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Transportation on vacation
 *
 * @author Mysakovych Maksym
 */

public class Runner {
    public static int rentalCarCost(int d) {
        int total = 40 * d;
        if (d >= 7) {
            return total - 50;
        } else if (d >= 3) {
            return total - 20;
        } else {
            return total;
        }
    }

    public static void start(BufferedReader br) {
        try {
            System.out.println("In this task we will count car rental cost.");
            System.out.println("How long your vacation: ");
            int d = Integer.parseInt(br.readLine());
            System.out.println("Cost = " + rentalCarCost(d));
        } catch (Exception e) {
            System.out.println("Wrong input.");
        }
    }
}