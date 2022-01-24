package javaclub5.conditions.task23;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Sergiy Zapadenko on 24.01.2022 12:43
 */
public class Task23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        start(scanner);
        scanner.close();
    }

    public static void start(Scanner scanner) {
        System.out.println("You have to return which player won! In case of rock/scissors/paper");
        System.out.println("Please enter number of player data 1 or 2 (or 'Exit' for finish):");
        int player = 1;
        int countWin = 0;
        int countLoss = 0;
        while (true) {
            System.out.println("Please enter a player number[1 or 2]:");
            String str = scanner.nextLine();
            if (str.equalsIgnoreCase("exit")) break;
            if (str.equalsIgnoreCase("1")) player = 1;
            else if (str.equalsIgnoreCase("2")) player = 2;
            else player = 0;
            if (player == 0)
                System.out.println("Your choice is unbelievable!");
            else
                System.out.println("Your choice is player :" + player);
            //Start play
            String pl1 = getRNDParam();
            String pl2 = getRNDParam();
            String result = Kata.rps(pl1, pl2);
            System.out.print(pl1 + " : " + pl2 + ". ");
            if (result.contains("Draw")) {
            } else if (result.contains("" + player)) {
                System.out.print("You are right! ");
                countWin++;
            } else {
                System.out.print("You are wrong! ");
                countLoss++;
            }
            System.out.print(result);
            System.out.println(" Score is " + countWin + ":" + countLoss +
                    ". " + (countWin > countLoss ? " You are win" : countWin == countLoss ? "It's draw." : " You are loss"));
        }
    }

    private static String getRNDParam() {
        Random rand = new Random(); //instance of random class
        int upperbound = 3;
        //generate random values from 0-3
        int int_random = rand.nextInt(upperbound);
        switch (int_random) {
            case 0:
                return "scissors";
            case 1:
                return "paper";
            default:
                return "rock";
        }
    }

}
