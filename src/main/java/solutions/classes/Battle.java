package solutions.classes;

import program.helper.Helper;
import solutions.Executable;

import java.util.Scanner;


 class Fighter {
    public String name;
    public int health, damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }
}


public class Battle implements Executable {

    String firstName;
    int hp1;
    int dpa1;
    String secondName;
    int hp2;
    int dpa2;
    String firstAttacker;
    Fighter fighter1;
    Fighter fighter2;




    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstToFight) {
        // Your code goes here. Have fun!
        if (fighter1.damagePerAttack <= 0 || fighter1.health <= 0 || fighter2.damagePerAttack <= 0 || fighter2.health <= 0)
            return "All characteristics must be greater than 0 at beginning";

        Fighter firstAttacker, secondAttacker;
        if (firstToFight.equals(fighter1.name)) {
            firstAttacker = fighter1;
            secondAttacker = fighter2;
        } else if(firstToFight.equals(fighter2.name)) {
            firstAttacker = fighter2;
            secondAttacker = fighter1;
        }
        else
        {
            return "First attacker name is nor correct";
        }


        while (true) {

            secondAttacker.health -= firstAttacker.damagePerAttack;
            if (secondAttacker.health <= 0) {
                return "The winner is fighter " + firstAttacker.name;
            }

            firstAttacker.health -= secondAttacker.damagePerAttack;
            if (firstAttacker.health <= 0) {
                return "The winner is fighter " + secondAttacker.name;
            }


        }
    }

    public void getData()
    {
        System.out.print("Enter your first fighter name: ");
        this.firstName = Helper.getLine();
        System.out.print("Enter your first fighter health points: ");
        this.hp1 = Helper.getInt(1,100000);
        System.out.print("Enter your first fighter damage per attack: ");
        this.dpa1 = Helper.getInt(1,100000);
        System.out.print("Enter your second fighter name: ");
        this.secondName = Helper.getLine();
        System.out.print("Enter your first second health points: ");
        this.hp2= Helper.getInt(1,100000);
        System.out.print("Enter your second fighter damage per attack: ");
        this.dpa2 = Helper.getInt(1,100000);
        System.out.print("Enter name of fighter that attack first: ");
        this.firstAttacker = Helper.getLine();
        this.fighter1 = new Fighter(this.firstName,this.hp1,this.dpa1);
        this.fighter2 = new Fighter(this.secondName,this.hp2,this.dpa2);

    }




    @Override
    public void execute() {
        getData();
        System.out.println(declareWinner(this.fighter1,this.fighter2,this.firstAttacker));
    }
}


