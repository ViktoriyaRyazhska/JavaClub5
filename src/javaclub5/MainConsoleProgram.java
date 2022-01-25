package javaclub5;


import javaclub5.OOP.task49.Task49;
import javaclub5.basicprogram.task1.Task1;
import javaclub5.basicprogram.task2.Task2;
import javaclub5.basicprogram.task3.Task3;
import javaclub5.basicprogram.task4.Task4;
import javaclub5.basicprogram.task5.Task5;
import javaclub5.basicprogram.task6.Task6;
import javaclub5.basicprogram.Task8.Task8;
import javaclub5.basicprogram.task9.Task9;
import javaclub5.basicprogram.task10.Task10;
import javaclub5.basicprogram.task11.Task11;
import javaclub5.classes.task12.Task12;
import javaclub5.classes.task15.Task15;
import javaclub5.classes.task16.Task16;
import javaclub5.classes.task17.Task17;
import javaclub5.collections.task70.Task70;
import javaclub5.conditions.task21.Task21;
import javaclub5.conditions.task22.Task22;
import javaclub5.conditions.task23.Task23;
import javaclub5.conditions.task24.Task24;
import javaclub5.conditions.task26.Task26;
import javaclub5.conditions.task27.Task27;
import javaclub5.conditions.task28.Task28;
import javaclub5.conditions.task29.Task29;
import javaclub5.loops.task32.Task32;
import javaclub5.loops.task34.Task34;
import javaclub5.OOP.task47.Task47;
import javaclub5.loops.task40.Task40;
import javaclub5.loops.task43.Task43;
import javaclub5.loops.task44.Task44;
import javaclub5.string.task54.Task54;
import javaclub5.string.task55.Task55;
import javaclub5.string.task56.Task56;
import javaclub5.string.task57.Task57;
import javaclub5.string.task58.Task58;
import javaclub5.string.task59.Task59;
import javaclub5.string.task63.Task63;
import javaclub5.string.task64.Task64;
import javaclub5.string.task65.Task65;
import javaclub5.string.task66.Task66;


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
            case 5:
                Task5.start();
                break;
            case 6:
                Task6.start(scanner);
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
            case 12:
                Task12.start();
                break;
            case 16:
                Task16.start(scanner);
                break;
            case 17:
                Task17.main(scanner);
                break;
            case 15:
                Task15.main();
                break;
            case 21:
                Task21.main();
                break;
            case 22:
                Task22.start(scanner);
                break;
            case 23:
                Task23.start(scanner);
                break;
            case 24:
                Task24.start(scanner);
                break;
            case 26:
                Task26.start(scanner);
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
            case 32:
                Task32.start(scanner);
                break;
            case 34:
                Task34.main(scanner);
                break;
            case 40:
                Task40.start(scanner);
                break;
            case 43:
                Task43.start(scanner);
                break;
            case 44:
                Task44.start(scanner);
                break;
            case 47:
                Task47.main(scanner);
                break;
            case 49:
                Task49.start(scanner);
                break;
            case 54:
                Task54.main(scanner);
                break;
            case 55:
                Task55.main(scanner);
                break;
            case 56:
                Task56.main(scanner);
                break;
            case 57:
                Task57.start(scanner);
                break;
            case 58:
                Task58.start(scanner);
                break;
            case 59:
                Task59.start(scanner);
                break;
            case 63:
                Task63.main(scanner);
                break;
            case 64:
                Task64.main(scanner);
                break;
            case 65:
                Task65.main(scanner);
                break;
            case 66:
                Task66.start();
                break;
            case 70:
                Task70.start();
                break;
            default:
                System.out.println("Ups. Task is not ready yet (.");

        }
    }
}

