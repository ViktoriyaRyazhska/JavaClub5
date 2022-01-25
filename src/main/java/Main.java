import program.Menu;
import program.MenuCommands;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Menu menu = new Menu(new MenuCommands());
        menu.run();
        
    }
}
