package one;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Objects;

public class Task16 {
    public static class Fighter {
        public String name;
        public int health, damagePerAttack;

        public Fighter(String name, int health, int damagePerAttack) {
            this.name = name;
            this.health = health;
            this.damagePerAttack = damagePerAttack;
        }
    }

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        if (Objects.equals(fighter1.name, firstAttacker)) {
            Fighter tmpFighter = fighter2;
            fighter2 = fighter1;
            fighter1 = tmpFighter;
        }
        while (true) {
            fighter1.health -= fighter2.damagePerAttack;
            if (fighter1.health <= 0)
                return fighter2.name;
            fighter2.health -= fighter1.damagePerAttack;
            if (fighter2.health <= 0)
                return fighter1.name;
            System.out.println("Health " + fighter1.name + " : " + fighter1.health);
            System.out.println("Health " + fighter2.name + " : " + fighter2.health);
        }
    }

    public static void task16(BufferedReader reader) {
        System.out.println("The task is to create a function that returns the name of the winner" +
                " in a fight between two fighters.");
        try {
            System.out.println("Set fighters fields, first fighter will beat first");
            System.out.println("Set first fighter fields (name, health, damage per attack):");
            String nameFirst = reader.readLine();
            int healthFirst = Integer.parseInt(reader.readLine());
            int damagePerAttackFirst = Integer.parseInt(reader.readLine());
            Fighter first = new Fighter(nameFirst, healthFirst, damagePerAttackFirst);
            System.out.println("Set second fighter fields (name, health, damage per attack):");
            String nameSecond = reader.readLine();
            int healthSecond = Integer.parseInt(reader.readLine());
            int damagePerAttackSecond = Integer.parseInt(reader.readLine());
            Fighter second = new Fighter(nameSecond, healthSecond, damagePerAttackSecond);
            System.out.println("Answer: ");
            System.out.println("The winner is " + declareWinner(first, second, first.name));
        } catch (Exception e) {
            System.out.println("Invalid parameters!");
        }
    }

}
