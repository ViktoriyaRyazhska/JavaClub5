package main.java.com.softserve.Loops;

import java.io.IOException;

import main.java.com.softserve.ReadConsole;

public class Loops extends ReadConsole {

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
		System.err.println("You need to put number with 1 to 15");
		Loops.main(args);

	    }
	} catch (IOException e) {
	    e.printStackTrace();
	    Loops.main(args);
	}

    }

    private static void text() {
	System.out.println("Please select TASK number: ");
	System.out.println("1" + "  =>string-repeat");
	System.out.println("2" + "  =>cat-years-dog-years");
	System.out.println("3" + "  =>get-the-mean-of-an-array");
	System.out.println("4" + "  =>beginner-lost-without-a-map");
	System.out.println("5" + "  =>counting-sheep-dot-dot-dot");
	System.out.println("6" + "  =>reversed-sequence");
	System.out.println("7" + "  =>how-good-are-you-really");
	System.out.println("8" + "  =>beginner-reduce-but-grow");
	System.out.println("9" + "  =>sum-of-positive");
	System.out.println("10" + "  =>my-head-is-at-the-wrong-end");
	System.out.println("11" + "  =>twice-as-old");
	System.out.println("12" + "  =>find-nearest-square-number");
	System.out.println("13" + "  =>grasshopper-summation");
	System.out.println("14" + "  =>gap-in-primes");
	System.out.println("15" + "  =>21-sticks");
    }

}
