package javaclub5.conditions.task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {

    public static void start(BufferedReader br) {
        System.out.println("Game: rock, scissors, paper.");
        System.out.println("Enter player 1 choice");
        try {
            String p1 =br.readLine();
            System.out.println("Enter player 2 choice");
            String p2 = br.readLine();
            System.out.println("Result " + rps(p1,p2));
        } catch (IOException e) {
            System.out.println("Wrong input");
        }

    }
    public static String rps(String p1, String p2) {
        String rez = "";
        if(!(p1.equals("scissors")||(p2.equals("scissors"))||(p1.equals("paper"))||p2.equals("paper")||p1.equals("rock")||p2.equals("rock")))
            return "Wrong input";
        if(p1.equals(p2))
            rez = "Draw!";
        else{
            if(p1.equals("scissors")){
                if(p2.equals("paper"))
                    rez = "Player 1 won!";
                else if (p2.equals("rock"))
                    rez ="Player 2 won!";
            }
            else if(p1.equals("paper")){
                if(p2.equals("rock"))
                    rez ="Player 1 won!";
                else if (p2.equals("scissors"))
                    rez = "Player 2 won!";
            }
            else if(p1.equals("rock")){
                if(p2.equals("scissors"))
                    rez ="Player 1 won!";
                else if (p2.equals("paper"))
                    rez ="Player 2 won!";
            }
        }
        return rez;
    }
}
