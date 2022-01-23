package javaclub5;

import javaclub5.basicprogram.task1.Task1;
import javaclub5.basicprogram.task11.Task11;
import javaclub5.basicprogram.task2.Task2;
import javaclub5.basicprogram.task3.Task3;
import javaclub5.basicprogram.task4.Task4;
import javaclub5.conditions.task27.Task27;
import javaclub5.conditions.task29.Task29;

import java.util.Scanner;

public class MainConsoleProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int taskNumber;
        while (true) {
            try {
                System.out.println("Select task (1-72):");
                taskNumber = Integer.parseInt(scanner.nextLine());
                if (taskNumber < 1 || taskNumber > 72) throw new Exception();
                break;
            } catch (Exception e) {
                System.out.println("Number incorrect!");
            }
        }

        switch (taskNumber) {
            case 1 :
                Task1.start(scanner);
                break;
            case 2 :
                Task2.start(scanner);
                break;
            case 3 :
                Task3.main(scanner);
                break;
            case 4:
                Task4.main(scanner);
                break;
            case 11 :
                Task11.start(scanner);
                break;
            case 27:
                Task27.main(scanner);
                break;
            case 29:
                Task29.main(scanner);
        }
    }
}

