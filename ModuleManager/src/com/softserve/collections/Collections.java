package com.softserve.collections;

import com.softserve.ReadConsole;
import java.io.IOException;

public class Collections extends ReadConsole {

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
		Collections.main(args);

	    }
	} catch (IOException e) {
	    e.printStackTrace();
	    Collections.main(args);
	}

    }

    private static void text() {
	System.out.println("Please select TASK number: ");
	System.out.println("1" + "  =>push-a-hash-slash-an-object-into-array");
	System.out.println("2" + "  =>unfinished-loop-bug-fixing-number-1");
	System.out.println("3" + "  =>filtering-even-numbers-bug-fixes");
	System.out.println("4" + "  =>interactive-dictionary");
    }

}

