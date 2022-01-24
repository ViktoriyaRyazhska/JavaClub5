package main.java.com.softserve;

import java.io.IOException;

import main.java.com.softserve.BasicProgram.BasicProgram;
import main.java.com.softserve.Classes.Classes;
import main.java.com.softserve.Collections.Collections;
import main.java.com.softserve.Conditions.Conditions;
import main.java.com.softserve.Loops.Loops;
import main.java.com.softserve.OOP.OOP;
import main.java.com.softserve.String.Strings;

public class MainClass extends ReadConsole {

    public static void main(String[] args) {

	text();
	try {
	    switch (br.readLine()) {
	    case "1":
		BasicProgram.main(args);
		break;
		
	    case "2":
		Classes.main(args);
		break;
	    case "3":
		Conditions.main(args);
		break;
		
	    case "4":
		Loops.main(args);
		break;
		
	    case "5":
		OOP.main(args);
		break;
		
	    case "6":
		Strings.main(args);
		break;
		
	    case "7":
		Collections.main(args);
		break;

	    default:
		System.err.println("You need to put number with 1 to 7 ");
		MainClass.main(args);
	    }

	} catch (IOException ioe) {
	    System.err.format("IOException: %s%n", ioe);
	}
    }

    private static void text() {
	System.out.println("Please enter the number of the tasks group: ");
	System.out.println("1" + "  ==>Basic program");
	System.out.println("2" + "  ==>Classes");
	System.out.println("3" + "  ==>Conditions");
	System.out.println("4" + "  ==>Loops");
	System.out.println("5" + "  ==>OOP");
	System.out.println("6" + "  ==>String");
	System.out.println("7" + "  ==>Collections");
    }

}
