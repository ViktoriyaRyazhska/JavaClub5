package main.conditions.task23;

import main.InterfaceTestClass;

import java.util.Scanner;

public class RockPaperScissors implements InterfaceTestClass {
    Scanner scanner = new Scanner(System.in);

    public static String rps(String p1, String p2) {
        String result;
        if (p1.equals("scissors") && p2.equals("paper"))
            result = "Player 1 won!";
        else if (p1.equals("scissors") && p2.equals("rock"))
            result = "Player 2 won!";
        else if (p1.equals("paper") && p2.equals("paper"))
            result = "Draw!";
        else if (p1.equals("scissors") && p2.equals("scissors"))
            result = "Draw!";
        else if (p1.equals("rock") && p2.equals("rock"))
            result = "Draw!";
        else if (p1.equals("rock") && p2.equals("scissors"))
            result = "Player 1 won!";
        else if (p1.equals("paper") && p2.equals("scissors"))
            result = "Player 2 won!";
        else if (p1.equals("rock") && p2.equals("paper"))
            result = "Player 2 won!";
        else result = "Player 1 won!";
        return result;
    }

    @Override
    public void execute() {
        String p1, p2;
        System.out.println("Let's play Rock Paper Scissors!");
        System.out.println("Please write your role: rock, paper or scissors.");
        System.out.println("Player 1: ");
        p1 = scanner.nextLine();
        if (!p1.equals("rock") && !p1.equals("scissors") && !p1.equals("paper")){
            System.out.println("Incorrect role! Please enter your role again: rock, paper or scissors!");
            p1 = scanner.nextLine();
        }
        System.out.println("Player 2: ");
        p2 = scanner.nextLine();
        if (!p2.equals("rock") && !p2.equals("scissors") && !p2.equals("paper")){
            System.out.println("Incorrect role! Please enter your role again: rock, paper or scissors!");
            p2 = scanner.nextLine();
        }
        System.out.println("The result of the game: " + RockPaperScissors.rps(p1, p2));
    }
}
