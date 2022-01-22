package five;

import java.io.BufferedReader;
import java.io.IOException;

public class Task30 {

    public static void task30(BufferedReader reader) {
        System.out.println("You're writing code to control your town's traffic lights.");
        try {
            System.out.println("Input the color of light ");
            String light = reader.readLine();
            System.out.println("Traffic light is " + updateLight(light));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Something went wrong");
        }
    }

    public static String updateLight(String current) {
        return switch (current) {
            case "green" -> "yellow";
            case "yellow" -> "red";
            case "red" -> "green";
            default -> "You must to input valid color";
        };
    }
}

