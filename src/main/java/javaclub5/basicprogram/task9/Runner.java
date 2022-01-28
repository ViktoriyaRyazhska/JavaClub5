package javaclub5.basicprogram.task9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Return to negative your integer
 *
 * @author Mysakovych Maksym
 */

public class Runner {

    public static int makeNegative(final int x) {
        if (x>0){
            return -x;
        }
        else {
            return x;
        }
    }

    public static void start(BufferedReader br) {
        try {
            System.out.println("Enter number to make negative: ");
            int x = Integer.parseInt(br.readLine());
            System.out.println(makeNegative(x));
        } catch (IOException e) {
            System.out.println("Wrong input");
        }
    }
}





