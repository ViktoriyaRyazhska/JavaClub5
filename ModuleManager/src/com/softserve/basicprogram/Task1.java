package com.softserve.basicprogram;

import com.softserve.ReadConsole;
import com.softserve.MainClass;
import java.math.BigInteger;
import java.io.IOException;

public class Task1 extends ReadConsole {

    static BigInteger numBigInt;

    public static void main(String[] args) {

	System.out.println("");
	System.out.println("Task1 is starting!");
	System.out.println("You need to enter an integer and double it !!!");
	System.out.println("Please input integer number");

	if (isBigInteger()) {
	    BigInteger resultBigInt = numBigInt.add(numBigInt);
	    System.out.println("Double Integer is " + resultBigInt);

	} else {
	    System.out.println("==> It's not an integer! Try again! <==");
	    Task1.main(args);
	}

	System.out.println("\n Beak to main menu => input 1 ");
	System.out.println("Try again  => input 2 ");
	System.out.println("To pass a test  => input 3 ");
	try {
	    switch (br().readLine()) {
	    case "1":
		MainClass.main(args);
		break;

	    case "2":
		Task1.main(args);
		break;

	    default:
		System.err.println("You need to do this: put 1 or 2 or 3");
		System.err.println("Transfer to menu ");
		Task1.main(args);
	    }
	} catch (IOException e) {
	    e.printStackTrace();
	}

    }

    protected static boolean isBigInteger() {
	try {
	    numBigInt = new BigInteger(br().readLine());
	    return true;
	} catch (NumberFormatException | IOException e) {
	    return false;
	}
    }

}
