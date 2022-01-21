package main;

import java.util.Scanner;

public class Programm {
    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi there. We've a great manu for you");
        System.out.println("Please choose the number from 1 to 72");

        int number = scanner.nextInt();
        while (number < 1 || number > 72 ){
            System.out.println("Please try again. You've made a input mistake");
            System.out.println("I'll remind you. You must choose THE NUMBER");
            number = scanner.nextInt();
        }
        System.out.println("Your number is " + number);
    }

}
