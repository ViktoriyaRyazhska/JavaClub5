package main.java.com.softserve.Classes;

import java.io.IOException;

import main.java.com.softserve.ReadConsole;

public class Classes extends ReadConsole {

    public static void main(String[] args) {

	text();
	try {
	    switch (br.readLine()) {
	    case "1":
		Task1.main(args);
		break;

	    case "2":
		Task2.main(args);
		break;

	    default:
		System.err.println("You need to put number with 1 to 6");
		Classes.main(args);

	    }
	} catch (IOException e) {
	    e.printStackTrace();
	    Classes.main(args);
	}

    }

    private static void text() {
	System.out.println("Please select TASK number: ");
	System.out.println("1" + "  =>lombok-encapsulation");
	System.out.println("2" + "  =>fixme-static-electrickery");
	System.out.println("3" + "  =>fractions-class");
	System.out.println("4" + "  =>simple-drawing-board");
	System.out.println("5" + "  =>two-fighters-one-winner");
	System.out.println("6" + "  =>building-blocks");
    }

}