package main;

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
        }catch (NullPointerException exception){
            view.printMessage(View.SAY_GOOBYE);
        }
    }
}