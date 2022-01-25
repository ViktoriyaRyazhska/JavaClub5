package three;
import java.io.BufferedReader;

public class Task23 {
    public static String rps(String p1, String p2) {
        if (p1.equals(p2)) {
            return "Draw!";
        }
        if(p1.equals("rock") && p2.equals("scissors") ||
                p1.equals("scissors") && p2.equals("paper") ||
                p1.equals("paper") && p2.equals("rock")) {
            return "Player 1 won!";
        }
        return "Player 2 won!";
    }

    public static void task23(BufferedReader reader) {
        System.out.println("The task is to return which player won in \"Rock Paper Scissors\" game! In case of a " +
                "draw return Draw!.");
        try {
            System.out.println("Set parameters (rock, paper, scissors) separated by \"Enter\" key:");
            String s1 = reader.readLine();
            String s2 = reader.readLine();
            System.out.println(rps(s1, s2));
        } catch (Exception e) {
            System.out.println("Invalid parameter!");
        }
    }
}

/*      Rock Paper Scissors
Let's play! You have to return which player won! In case of a draw return Draw!.
Examples:
rps('scissors','paper') // Player 1 won!
rps('scissors','rock') // Player 2 won!
rps('paper','paper') // Draw!
*/
