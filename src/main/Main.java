package main;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        Model model = new Model(database);
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.processUser();
    }
}
