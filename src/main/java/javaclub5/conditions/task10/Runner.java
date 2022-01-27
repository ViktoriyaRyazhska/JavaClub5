package javaclub5.conditions.task10;

import javaclub5.classes.task2.Dinglemouse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * The Story:
 * Bob is working as a bus driver. However, he has become extremely popular amongst the city's residents. With so many passengers wanting to get aboard his bus, he sometimes has to face the problem of not enough space left on the bus! He wants you to write a simple program telling him if he will be able to fit all the passengers.
 * Task Overview:
 * You have to write a function that accepts three parameters:
 *     cap is the amount of people the bus can hold excluding the driver.
 *     on is the number of people on the bus excluding the driver.
 *     wait is the number of people waiting to get on to the bus excluding the driver.
 * If there is enough space, return 0, and if there isn't, return the number of passengers he can't take.
 *
 * @author Rostyslav Ros
 */

public class Runner {
    /**
     * main method of Class
     *
     */
    public static void start(BufferedReader reader) {
        System.out.println(" Tell Bob if he will be able to fit all the passengers");
        try {
            System.out.println("Input the amount of people the bus can hold excluding the driver");
            int cap = Integer.parseInt(reader.readLine());
            System.out.println("Input the number of people on the bus excluding the driver");
            int on = Integer.parseInt(reader.readLine());
            System.out.println("Input the number of people waiting to get on to the bus excluding the driver");
            int wait = Integer.parseInt(reader.readLine());
            int result = Bob.enough(cap, on, wait);
            if (result == 0) {
                System.out.printf("He can fit all %d passengers", wait);
            }
            else {
                System.out.printf("He can't fit %d of the %d waiting", result, wait);
            }
        } catch (IOException e) {
            System.out.println("Wrong input");
        }

    }
}
