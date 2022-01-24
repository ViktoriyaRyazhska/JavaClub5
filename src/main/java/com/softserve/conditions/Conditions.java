package main.java.com.softserve.conditions;

import main.java.com.softserve.ReadConsole;

import java.io.IOException;

public class Conditions extends ReadConsole {

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
		System.err.println("You need to put number with 1 to 13");
		Conditions.main(args);

	    }
	} catch (IOException e) {
	    e.printStackTrace();
	    Conditions.main(args);
	}

    }

    private static void text() {
	System.out.println("Please select TASK number: ");
	System.out.println("1" + "  =>opposite-number");
	System.out.println("2" + "  =>is-n-divisible-by-x-and-y");
	System.out.println("3" + "  =>convert-a-boolean-to-a-string");
	System.out.println("4" + "  =>do-i-get-a-bonus");
	System.out.println("5" + "  =>how-old-will-i-be-in-2099");
	System.out.println("6" + "  =>rock-paper-scissors");
	System.out.println("7" + "  =>basic-mathematical-operations");
	System.out.println("8" + "  =>convert-boolean-values-to-strings-yes-or-no");
	System.out.println("9" + "  =>will-there-be-enough-space");
	System.out.println("10" + "  =>the-modulo-3-sequence");
	System.out.println("11" + "  =>switch-it-up");
	System.out.println("12" + "  =>thinkful-logic-drills-traffic-light");	
	System.out.println("13" + "  =>transportation-on-vacation");	
	
    }

}
