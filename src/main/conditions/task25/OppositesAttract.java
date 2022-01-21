package main.conditions.task25;

import main.InterfaceTestClass;

import java.util.Scanner;

public class OppositesAttract implements InterfaceTestClass {
    Scanner scanner = new Scanner(System.in);

    public static boolean isLove(final int flower1, final int flower2) {

        if (flower1 % 2 == 0 && flower2 % 2 != 0) return true;
        else return flower1 % 2 != 0 && flower2 % 2 == 0;
    }

    @Override
    public void execute() {
        System.out.println("Timmy & Sarah think they are in love. If one of the flowers has an even number of " +
                "petals and the other has an odd number of petals it means they are in love.\n");
        System.out.println("We'll find if it's a true love.");
        System.out.println("Specify amount of Timmy's petals");
        int flower1 = scanner.nextInt();
        System.out.println("Specify amount of Sarah's petals");
        int flower2 = scanner.nextInt();
        System.out.println(OppositesAttract.isLove(flower1, flower2));

    }
}
