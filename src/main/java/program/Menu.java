package program;

import program.helper.Helper;

public class Menu {
    private final MenuCommands options;

    public Menu(MenuCommands options){
        this.options = options;
    }

    public void run(){
        while (true){
            Helper.printBar( "Menu" );
            Helper.menuOptionPrint( options.getOptions() );
            String option = Helper.getOptionStr( options.getOptions());
            options.getOptions().get( option ).execute();
        }
    }
}
