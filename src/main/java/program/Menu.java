package program;

import program.helper.Helper;

public class Menu {
    private final MenuCommands menuCommands;

    public Menu(MenuCommands options){
        this.menuCommands = options;
    }

    public void run(){
        while (true){
            Helper.printBar( menuCommands.getState() );
            Helper.menuOptionPrint( menuCommands.getCommandsList() );
            String option = Helper.getOptionStr(menuCommands.getCommandsList());
            menuCommands.executeCommand(option);
        }
    }
}
