package main;

import java.util.Scanner;

public class Controller {
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {


        Topics topics = new Topics();
        view.printMessage(View.GREETINGS);

        topics.runMenu();
        model.setValue(topics.decision);
        try {
            model.selectorMenu(model.getValue());
        } catch (NullPointerException exception) {
            view.printMessage(View.SAY_GOOBYE);
        }

        proceeds();
    }

    public void proceeds() {
        view.printMessage(View.CONTINUE);
        view.printMessage(View.YORN);
        model.setProceed(inputValueWithScanner(new Scanner(System.in)));

        switch (model.getProceed()) {
            case "Y" -> {
                processUser();
            }
            case "N" -> view.printMessage(View.SAY_GOOBYE);

            default -> {
                view.printMessage(View.WRONG_INPUT);
                proceeds();
            }
        }
    }

    public String inputValueWithScanner(Scanner sc) {
        while (!sc.hasNextLine()) {
            view.printMessage(View.WRONG_INPUT);
            sc.next();
        }
        return sc.nextLine();
    }


}