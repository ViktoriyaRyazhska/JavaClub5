package com.softserve.oop;

import com.softserve.ReadConsole;
import java.io.IOException;

public class OOP extends ReadConsole {

    public static void main(String[] args) {

	text();
	try {
	    switch (br().readLine()) {
	    case "1":
		Task1.main(args);
		break;

	    case "2":
		Task2.main(args);
		break;

	    default:
		System.err.println("You need to put number with 1 to 4");
		OOP.main(args);

	    }
	} catch (IOException e) {
	    e.printStackTrace();
	    OOP.main(args);
	}

    }

    private static void text() {
	System.out.println("Please select TASK number: ");
	System.out.println("1" + "  =>basic-subclasses-adam-and-eve");
	System.out.println("2" + "  =>rotations-and-reflections-i");
	System.out.println("3" + "  =>l3375p34k");
	System.out.println("4" + "  =>tdd-area-calculations");
    }

}
