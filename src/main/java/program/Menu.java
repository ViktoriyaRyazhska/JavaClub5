package program;

import program.helper.Helper;

public class Menu {
    private final MenuCommands MenuCommands;

    public Menu(MenuCommands options){
        this.MenuCommands = options;
    }

    public void run(){
        while (true){
            Helper.printBar( "Menu" );
            Helper.menuOptionPrint( MenuCommands.getPosition() );
            String option = Helper.getOptionStr(MenuCommands);
            MenuCommands.getOptions().get( option ).execute();
            Helper.promptEnterKey();
        }
    }
}
