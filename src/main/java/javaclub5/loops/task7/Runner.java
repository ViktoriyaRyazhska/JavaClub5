package javaclub5.loops.task7;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * There was a test in your class and you passed it. Congratulations!
 * But you're an ambitious person. You want to know if you're better than the average student in your class.
 * You receive an array with your peers' test scores. Now calculate the average and compare your score!
 * Return True if you're better, else False!
 * Note:
 * Your points are not included in the array of your class's points. For calculating the average
 * point you may add your point to the given array!
 *
 * @author Rostyslav Ros
 */

public class Runner {

    /**
     * main method of Class
     *
     */
    public static void start(BufferedReader reader) {
        System.out.println(" Input number of students in you class");
        try {
            int number = Integer.parseInt(reader.readLine());
            int [] results = new int [number];
            for (int i = 0; i < number; i++) {
                System.out.printf("Input the result of %d student %n", i + 1);
                results[i] = Integer.parseInt(reader.readLine());
            }
            System.out.println("Input your result");
            int yourResult = Integer.parseInt(reader.readLine());
            if (betterThanAverage(results, yourResult)) {
                System.out.println("You're better");
            }
            else {
                System.out.println("You're not better");
            }

        } catch (IOException e) {
            System.out.println("Wrong input");
        }
    }

    /**
     * Calculate the average and compare your score
     * @param classPoints - an array with your peers' test scores,
     * @param yourPoints - your score,
     * @return True if you're better, else False!
     */
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = yourPoints;
        for (int i = 0; i < classPoints.length; i++) {
            sum += classPoints[i];
        }
        float average = (float) sum / (classPoints.length + 1);
        if (yourPoints > average) {
            return true;
        }
        else {return false;
        }
    }
}
