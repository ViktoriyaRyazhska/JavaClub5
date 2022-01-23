import program.Menu;
import program.MenuCommands;
import solutions.oop.Leetspeak.Leetspeak;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Menu menu = new Menu(new MenuCommands());
        menu.run();
        
    }
}
