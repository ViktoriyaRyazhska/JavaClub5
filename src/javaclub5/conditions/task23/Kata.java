package javaclub5.conditions.task23;

/**
 * Created by Sergiy Zapadenko on 24.01.2022 12:45
 */
public class Kata {
    public static String rps(String p1, String p2) {
        if (!p1.equals("scissors") && !p1.equals("paper") && !p1.equals("rock")) throw new IllegalArgumentException();
        if (!p2.equals("scissors") && !p2.equals("paper") && !p2.equals("rock")) throw new IllegalArgumentException();
        switch (p1){
            case "scissors":
                if (p2.equals("paper")) return "Player 1 won!";
                else if (p2.equals("rock")) return "Player 2 won!";
                else return "Draw!";
            case "paper":
                if (p2.equals("rock")) return "Player 1 won!";
                else if (p2.equals("scissors")) return "Player 2 won!";
                else return "Draw!";
            case "rock":
                if (p2.equals("scissors")) return "Player 1 won!";
                else if (p2.equals("paper")) return "Player 2 won!";
                else return "Draw!";
        }
        return "";
    }
}
