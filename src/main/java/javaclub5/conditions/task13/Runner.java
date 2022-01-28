package javaclub5.conditions.task13;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Age Range Compatibility Equation
 *
 * @author Mysakovych Maksym
 */

public class Runner {
    public static class TrafficLights {
        public static String updateLight(String current) {
            if (current.equals("green")) {
                return "yellow";
            }
            if (current.equals("yellow")) {
                return "red";
            }
            if (current.equals("red")) {
                return "green";
            } else {
                return "error";
            }
        }

        public static void start(BufferedReader br) {
            System.out.println("Traffic Lights update.");
            try {
                System.out.println("Please specify color: ");
                String color = br.readLine();
                System.out.println(TrafficLights.updateLight(color));
            } catch (Exception e) {
                System.out.println("Wrong input.");
            }
        }
    }
}