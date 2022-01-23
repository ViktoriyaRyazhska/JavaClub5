package com.softserve.string;

import com.softserve.ReadConsole;
import java.io.IOException;

public class Strings extends ReadConsole {

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
		System.err.println("You need to put number with 1 to 18");
		Strings.main(args);

	    }
	} catch (IOException e) {
	    e.printStackTrace();
	    Strings.main(args);
	}

    }

    private static void text() {
	System.out.println("Please select TASK number: ");
	System.out.println("1" + "  =>convert-a-number-to-a-string");
	System.out.println("2" + "  =>reversed-strings");
	System.out.println("3" + "  =>welcome-to-the-city");
	System.out.println("4" + "  =>opposite-number");
	System.out.println("5" + "  =>fixme-replace-all-dots");
	System.out.println("6" + "  =>are-you-playing-banjo");
	System.out.println("7" + "  =>remove-string-spaces");
	System.out.println("8" + "  =>triple-trouble-2");
	System.out.println("9" + "  =>find-the-position");
	System.out.println("10" + "  =>fake-binary");
	System.out.println("11" + "  =>parse-nice-int-from-char-problem");
	System.out.println("12" + "  =>grasshopper-debug");
	System.out.println("13" + "  =>abbreviate-a-two-word-name");
	System.out.println("14" + "  =>all-star-code-challenge-number-18");
	System.out.println("15" + "  =>sort-and-star");
	System.out.println("16" + "  =>correct-the-mistakes-of-the-character-recognition-software");
	System.out.println("17" + "  =>alternating-case-<-equals->-alternating-case");
	System.out.println("18" + "  =>exclamation-marks-series-number-6-remove-n-exclamation-marks-in-the-sentence-from-left-to-right");
    }

}
