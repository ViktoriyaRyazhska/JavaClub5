package javaclub5.classes.task5;

import java.io.BufferedReader;
import java.util.Objects;

/**
 * Create a function that returns the name of the winner in a fight between two fighters.
 *
 * Each fighter takes turns attacking the other and whoever kills the other first is victorious. Death is defined as having health <= 0.
 *
 * Each fighter will be a Fighter object/instance. See the Fighter class below in your chosen language.
 *
 * Both health and damagePerAttack (damage_per_attack for python) will be integers larger than 0. You can mutate the Fighter objects.
 * @author Dmytro Prudius
 */

public class Runner {
    public String name;
    public int health, damagePerAttack;
    

    public Runner(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public static void start(BufferedReader br) {
        System.out.println("The task is to create a function that returns the name of the winner" +
                " in a fight between two fighters.");
        try {
            System.out.println("Set fighters fields, first fighter will beat first");
            System.out.println("Set first fighter fields (name, health, damage per attack):");
            String nameFirst = br.readLine();
            int healthFirst = Integer.parseInt(br.readLine());
            int damagePerAttackFirst = Integer.parseInt(br.readLine());
            Runner first = new Runner(nameFirst, healthFirst, damagePerAttackFirst);
            System.out.println("Set second fighter fields (name, health, damage per attack):");
            String nameSecond = br.readLine();
            int healthSecond = Integer.parseInt(br.readLine());
            int damagePerAttackSecond = Integer.parseInt(br.readLine());
            Runner second = new Runner(nameSecond, healthSecond, damagePerAttackSecond);
            System.out.println("Answer: ");
            System.out.println("The winner is " + declareWinner(first, second, first.name));
        } catch (Exception e) {
            System.out.println("Invalid parameters!");
        }
    }

    public static String declareWinner(Runner fighter1, Runner fighter2, String firstAttacker) {
        if (Objects.equals(fighter1.name, firstAttacker)) {
            Runner fighter = fighter2;
            fighter2 = fighter1;
            fighter1 = fighter;
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

}
