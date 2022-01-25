package javaclub5.classes.task16;

import java.util.Scanner;

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

        while (true) {
            fighter1.health -= fighter2.damagePerAttack;
            if (fighter1.health <= 0)
                return fighter2.name;
            fighter2.health -= fighter1.damagePerAttack;
            if (fighter2.health <= 0)
                return fighter1.name;
        }
    }

    public static void start(Scanner scanner) {

        try {
            System.out.println("Enter name of fighter1 : ");
            String nameFirst = scanner.nextLine();
            System.out.println("Enter health of fighter1 : ");
            int healthFirst = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter damage of fighter1 : ");
            int damagePerAttackFirst = Integer.parseInt(scanner.nextLine());
            Fighter first = new Fighter(nameFirst, healthFirst, damagePerAttackFirst);

            System.out.println("Enter name of fighter2 : ");
            String nameSecond = scanner.nextLine();
            System.out.println("Enter health of fighter2 : ");
            int healthSecond = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter damage of fighter2 : ");
            int damagePerAttackSecond = Integer.parseInt(scanner.nextLine());
            Fighter second = new Fighter(nameSecond, healthSecond, damagePerAttackSecond);

            System.out.println("The winner is " + declareWinner(first, second, first.name));
        } catch (Exception e) {
            System.out.println("Invalid parameters!");
        }
    }
}
