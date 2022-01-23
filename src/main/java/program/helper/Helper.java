package program.helper;

import solutions.Executable;

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


    public static void menuOptionPrint ( Map<String, Executable> options ){
        for (String l : options.keySet())
            System.out.printf( "| %s\n", l );
        System.out.println( "|-----------------------------------------|\nChoose menu option-> " );
    }

    public static void printBar(String upBarMessage) {
        int l = 20 - upBarMessage.length( ) / 2;
        String str = '\n' + "-".repeat( l ) + ' ' + upBarMessage + ' ' + "-".repeat( l - 1 );
        if (upBarMessage.length( ) % 2 == 0) str += '-';
        System.out.println( str );
    }

    public static String getOptionStr(Map<String, Executable> options) {
        while (true) {
            String str = scanner.nextLine( );
            if (options.containsKey( str )) return str;
            System.out.println("There is no such option");
        }
    }

    public static String getLine() {

        return scanner.nextLine();

    }

    public static char getLetter() {
        String line = scanner.nextLine();
        if (line.length() == 1 && (line.charAt(0) > 96 && line.charAt(0) < 123) ||  (line.charAt(0) > 64 && line.charAt(0) < 91)){
            return line.charAt(0);
        }
        System.out.println("Wrong input!");
        return getLetter();
    }
}