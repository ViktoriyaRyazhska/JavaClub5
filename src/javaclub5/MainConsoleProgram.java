package javaclub5;

import javaclub5.basicprogram.Task8.Task8;
import javaclub5.basicprogram.task1.Task1;
import javaclub5.basicprogram.task11.Task11;
import javaclub5.basicprogram.task2.Task2;
import javaclub5.basicprogram.task3.Task3;
import javaclub5.basicprogram.task4.Task4;
import javaclub5.basicprogram.task9.Task9;
import javaclub5.basicprogram.task10.Task10;
import javaclub5.conditions.task27.Task27;
import javaclub5.conditions.task28.Task28;
import javaclub5.conditions.task29.Task29;
import javaclub5.string.task63.Task63;
import javaclub5.string.task64.Task64;


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
            case 1:
                Task1.start(scanner);
                break;
            case 2:
                Task2.start(scanner);
                break;
            case 3:
                Task3.main(scanner);
                break;
            case 4:
                Task4.main(scanner);
                break;
            case 8:
                Task8.start(scanner);
                break;
            case 9:
                Task9.main(scanner);
                break;
            case 10:
                Task10.main(scanner);
                break;
            case 11:
                Task11.start(scanner);
                break;
            case 27:
                Task27.main(scanner);
                break;
            case 28:
                Task28.main(scanner);
                break;
            case 29:
                Task29.main(scanner);
                break;
            case 63:
                Task63.main(scanner);
                break;
            case 64:
                Task64.main(scanner);
                break;
        }
    }
}

