package main.java.com.softserve.BasicProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigInteger;

import main.java.com.softserve.MainClass;
import main.java.com.softserve.ReadConsole;
import test.java.BasicProgramTest.TestTask1;

public class Task1 extends ReadConsole {

    static int i;
    static BigInteger b;

    public static void main(String[] args) {

	message1();
	if (isInteger(i) != 0) {
	    System.out.println("Double Integer = " + isInteger(i));

	} else {
	    System.out.println("==> It's not an integer! Try again! <==");
	    Task1.main(args);
	}

	message2();
	try {
	    switch (br.readLine()) {
	    case "1":
		MainClass.main(args);
		break;

	    case "2":
		Task1.main(args);
		break;

	    case "3":
		TestTask1.test();
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

    public static void message1() {
	System.out.println("\nTask is starting!");
	System.out.println("You need to enter an integer and double it !!!");
	System.out.println("Please input integer number: ");
    }

    public static void message2() {
	System.out.println("\nBack to main menu => input 1 ");
	System.out.println("Try again  => input 2 ");
	System.out.println("To pass a test  => input 3 ");

    }

    public static boolean isBooleanInteger(BufferedReader br) {
	try {
	    i = Integer.parseInt(br.readLine());
	    return true;
	} catch (NumberFormatException | IOException e) {
	    return false;
	}
    }

    public static int isInteger(int i) {
	if (!isBooleanInteger(br)) {
	    return 0;
	}
	return i * 2;
    }

    public static BigInteger isBigInteger(BufferedReader br) {
	try {
	    b = new BigInteger(br.readLine());
	    return b.add(b);
	} catch (NumberFormatException | IOException e) {
	    return null;
	}
    }

}
