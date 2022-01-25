package javaclub5.loops.task15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The game
 *
 * In this game, there are 21 sticks lying in a pile. Players take turns taking 1, 2, or 3 sticks.
 * The last person to take a stick wins. For example:
 *
 * 21 sticks in the pile
 *
 * Bob takes 2  -->  19 sticks left
 * Jim takes 3  -->  16 sticks
 * Bob takes 3  -->  13 sticks
 * Jim takes 1  -->  12 sticks
 * Bob takes 2  -->  10 sticks
 * Jim takes 2  -->   8 sticks
 * Bob takes 3  -->   5 sticks
 * Jim takes 3  -->   2 sticks
 * Bob takes 2  -->  Bob wins!
 *
 * @author Rostyslav Ros
 */
public class Runner {

    /**
     * main method of Class
     *
     */
    public static void start(BufferedReader reader) {
        System.out.println("21 sticks in the pile");
        int sticks = 21;
        int number = makeMove(sticks);
        System.out.printf("I'll take %d sticks\n", number);
        sticks -= number;
        System.out.printf("%d sticks left in game \n", sticks);
        System.out.println("You can take 1 or 2 or 3 sticks");
        while (sticks != 0) {
            try {
                System.out.println("You'll take?");
                number =  Integer.parseInt(reader.readLine());
                if (number > 3 || number < 1) {
                    System.out.println("Wrong input");
                    continue;
                }
                sticks -= number;
                System.out.printf("%d sticks left in game \n", sticks);
                number = makeMove(sticks);
                System.out.printf("I'll take %d sticks\n", number);
                sticks -= number;
                System.out.printf("%d sticks left in game \n", sticks);
            } catch (IOException e) {
                System.out.println("Wrong input");
            }
        }
        System.out.println("I won");
    }

    /**
     *
     * @param sticks number of sticks left in the game
     * @return number sticks bot should take
     */
    public static int makeMove(int sticks) {
        return sticks -  (sticks /4) * 4;
    }
}
