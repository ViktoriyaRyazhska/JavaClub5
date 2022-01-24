package solutions.conditions;

import program.helper.Helper;
import solutions.Executable;

public class RockPaperScissors implements Executable {
    public static String rps(String p1, String p2) {
        // your code
        switch (p1) {
            case "rock":
                if (p2.equalsIgnoreCase("scissors")) {
                    return "Player 1 won!";
                } else if (p2.equalsIgnoreCase(p1)) {
                    return "Draw!";
                } else {
                    return "Player 2 won!";
                }
            case "scissors":
                if (p2.equalsIgnoreCase("paper")) {
                    return "Player 1 won!";
                } else if (p2.equalsIgnoreCase(p1)) {
                    return "Draw!";
                } else {
                    return "Player 2 won!";
                }
            case "paper":
                if (p2.equalsIgnoreCase("rock")) {
                    return "Player 1 won!";
                } else if (p2.equalsIgnoreCase(p1)) {
                    return "Draw!";
                } else {
                    return "Player 2 won!";
                }
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override
    public void execute() {
        try {
            String p1 = Helper.getLine();
            String p2 = Helper.getLine();
            System.out.println(rps(p1, p2));
        } catch (IllegalArgumentException e) {
            System.out.println("Enter rock or paper or scissors");
            execute();
        }

    }
}
