package program;

import java.util.Scanner;

public class Menu {
    private MenuCommands commands;

    public Menu(MenuCommands commands){
        this.commands = commands;
    }

    public void run(){
        while (true){
            System.out.println("Enter command:");
            System.out.println(commands.options.toString());
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            commands.options.get(str).execute();
            break;
        }
    }
}
