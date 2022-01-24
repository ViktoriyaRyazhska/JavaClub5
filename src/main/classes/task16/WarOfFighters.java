package main.classes.task16;

import main.InterfaceTestClass;
import main.string.task61.CharProblem;

import java.util.Scanner;

public class WarOfFighters implements InterfaceTestClass {
    Scanner scanner = new Scanner(System.in);

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        String f1 = fighter1.name;
        String f2 = fighter2.name;
        int d1 = fighter1.damagePerAttack;
        int d2 = fighter2.damagePerAttack;
        int h1 = fighter1.health;
        int h2 = fighter2.health;
        String winner = "";

        if(f1.equalsIgnoreCase(firstAttacker)){
            do{
              h2 = h2-d1;
              if(h2<=0){
                  break;
              }
              h1 = h1-d2;
            }while (h1>=0 && h2>=0);
        }
        else{
            do{
                h1 = h1-d2;
                if(h1<=0){
                    break;
                }
                h2 = h2-d1;
            }while (h1>=0 && h2>=0);
        }
        if(h1<=0){
            winner = f2;
        }
        else
            winner = f1;

        return winner;
    }

    @Override
    public void execute() {
        System.out.println("Create a function that returns the name of the winner in a fight between two fighters.\n" +
                "Each fighter takes turns attacking the other and whoever kills the other first is victorious. Death is defined as having health <= 0.\n" +
                "Each fighter will be a Fighter object/instance. See the Fighter class below in your chosen language.\n" +
                "Both health and damagePerAttack  will be integers larger than 0. You can mutate the Fighter objects.");
        Fighter fighter1 = new Fighter();
        Fighter fighter2 = new Fighter();

        System.out.println("Enter name of fighter1 : ");
        fighter1.name = scanner.nextLine();

        System.out.println("Enter health of fighter1 : ");
        fighter1.health = scanner.nextInt();

        System.out.println("Enter damage of fighter1 : ");
        fighter1.damagePerAttack = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Enter name of fighter2 : ");
        fighter2.name = scanner.nextLine();

        System.out.println("Enter health of fighter2 : ");
        fighter2.health = scanner.nextInt();

        System.out.println("Enter damage of fighter2 : ");
        fighter2.damagePerAttack = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Enter name of the fighter who will start the war : ");
        String firstAttacker = scanner.nextLine();

        System.out.println("The winner is: " + WarOfFighters.declareWinner(fighter1, fighter2, firstAttacker));

    }
}
