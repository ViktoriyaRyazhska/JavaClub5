package solutions.conditions;

import solutions.Executable;

import java.util.Scanner;

public class RockPaperScissors implements Executable {
    public static String rps(String p1, String p2) {
        // your code
        switch (p1) {
            case "rock":
                if (p2.equals("scissors")) {
                    return "Player 1 won!";
                } else if (p2.equals(p1)) {
                    return "Draw!";
                } else {
                    return "Player 2 won!";
                }
            case "scissors":
                if (p2.equals("paper")) {
                    return "Player 1 won!";
                } else if (p2.equals(p1)) {
                    return "Draw!";
                } else {
                    return "Player 2 won!";
                }
            case "paper":
                if (p2.equals("rock")) {
                    return "Player 1 won!";
                } else if (p2.equals(p1)) {
                    return "Draw!";
                } else {
                    return "Player 2 won!";
                }
            default:throw new IllegalArgumentException();
        }
    }
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        String p1 = scanner.nextLine();
        String p2 = scanner.nextLine();
        System.out.println(rps(p1,p2));
    }
}
