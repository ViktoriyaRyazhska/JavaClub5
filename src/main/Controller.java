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
        view.printMessage(View.GREETINGS);
        model.setValue(inputIntValueWithScanner(sc));
        while (model.getValue()<1 || model.getValue()>72){
            view.printMessage(View.OUT);
            model.setValue(inputIntValueWithScanner(sc));
        }
        view.printMessageAndSomething(View.CHOICE, model.getValue());

        try {
            view.printMessage(View.JUST_MESSAGE);
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int inputIntValueWithScanner(Scanner sc) {
        view.printMessage(View.TRY_AGAIN);
        while( ! sc.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT + View.TRY_AGAIN);
            sc.next();
        }
        return sc.nextInt();
    }
}
