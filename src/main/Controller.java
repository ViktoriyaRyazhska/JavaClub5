package main;

import java.util.Scanner;

public class Controller {
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser(){
        Scanner sc = new Scanner(System.in);

    }

    public int inputIntValueWithScanner(Scanner sc) {
        view.printMessage(View.INPUT_INT);
        while( ! sc.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT + View.TRY_AGAIN);
            sc.next();
        }
        return sc.nextInt();
    }
}
