package program.helper;

import program.MenuCommands;
import solutions.Executable;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Helper {
    static Scanner scanner = new Scanner(System.in);

    public static int getInt(int min, int max) {
        String line = scanner.nextLine();

        int i=0;
        try {
            i = Integer.parseInt(line);
            if (i<min || i>max){throw new NumberFormatException();}
        } catch (NumberFormatException e){
            System.out.println("Wrong input!");
            i = getInt(min, max);
        }
        return i;
    }

    public static void promptEnterKey(){
        System.out.println("Press \"ENTER\" to continue...");
        scanner.nextLine();
    }

    public static int getInt(int max){
        return getInt(1, max);
    }

    public static double getDouble(Double max) {
        String line = scanner.nextLine();

        double i = 0.0;
        try {
            i = Double.parseDouble(line);
        } catch (NumberFormatException e){
            System.out.println("Wrong input!");
            i = getDouble(max);
        }
        return i;
    }


    public static void menuOptionPrint (ArrayList<String> options ){
        int i = 1;
        for (String l : options){
            System.out.printf( "| %d %s\n", i, l );
            i++;
        }

        System.out.println( "|-----------------------------------------|" +
                "\nYou can choose menu option both by the number and by the name" +
                "\nChoose menu option-> " );
    }

    public static void printBar(String upBarMessage) {
        int l = 20 - upBarMessage.length( ) / 2;
        String str = '\n' + "-".repeat( l ) + ' ' + upBarMessage + ' ' + "-".repeat( l - 1 );
        if (upBarMessage.length( ) % 2 == 0) str += '-';
        System.out.println( str );
    }

    public static String getOptionStr(MenuCommands options) {
        while (true) {
            String str = scanner.nextLine( );
            if (options.getOptions().containsKey( str )) return str;

            int i;
            try {
                i = Integer.parseInt(str);
                if ( i > 0 && i <= options.getPosition().size()) {
                    return options.getPosition().get(i-1);
                }
            } catch (NumberFormatException ignored){

            }


            System.out.println("There is no such option");
        }
    }

    public static String getLine() {

        return scanner.nextLine();

    }

    public static Boolean getBool() {

        String line = scanner.nextLine();

        boolean i;
        try {
            i = Boolean.parseBoolean(line);
        } catch (NumberFormatException e){
            System.out.println("Wrong input!");
            i = getBool();
        }
        return i;
    }

    public static char getLetter() {
        String line = scanner.nextLine();
        if (line.length() == 1 && (line.charAt(0) > 96 && line.charAt(0) < 123) ||  (line.charAt(0) > 64 && line.charAt(0) < 91)){
            return line.charAt(0);
        }
        System.out.println("Wrong input!");
        return getLetter();
    }

    public static long getLong(long min, long max) {
        String line = scanner.nextLine();

        long i=0;
        try {
            i = Long.parseLong(line);
            if (i<min || i>max){throw new NumberFormatException();}
        } catch (NumberFormatException e){
            System.out.println("Wrong input!");
            i = getLong(min, max);
        }
        return i;
    }
}