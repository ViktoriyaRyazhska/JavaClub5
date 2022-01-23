package program.helper;

import solutions.Executable;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Helper {
    static Scanner scanner = new Scanner(System.in);

    public static int getInt(int max) {
        String line = scanner.nextLine();

        int i=0;
        try {
            i = Integer.parseInt(line);
        } catch (NumberFormatException e){
            System.out.println("Wrong input!");
            i = getInt(max);
        }
        return i;
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
}