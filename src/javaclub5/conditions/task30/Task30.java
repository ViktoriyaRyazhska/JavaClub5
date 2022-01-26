package javaclub5.conditions.task30;

import java.util.Scanner;

public class Task30 {
    public static String nextLight(String light) {
        light = light.toLowerCase();
        switch (light) {
            case "green":
                return "yellow";
            case "yellow":
                return "red";
            case "red":
                return "green";
            default:
                return "Wrong light";

        }

    }

    public static void main(Scanner sc) {
        try {
            System.out.println("Enter light color");
            String light = sc.nextLine();
            System.out.println("Next light:" + nextLight(light));
        }catch (Exception e){
            System.out.println("Wrong input");
        }
    }
}
