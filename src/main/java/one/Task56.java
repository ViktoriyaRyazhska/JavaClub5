package one;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task56 {
    public static String areYouPlayingBanjo(String name) {
        return (name.charAt(0) == 'R' || name.charAt(0) == 'r') ? name + " plays banjo" : name + "does not play banjo";
    }

    public static void task56() {
        System.out.println("The task is to check if player will play the game.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Set parameter:");
            System.out.println("Answer: " + areYouPlayingBanjo(reader.readLine()));
        } catch (Exception e) {
            System.out.println("Invalid parameter!");
        }
    }

}
