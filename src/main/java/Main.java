import one.*;
import two.*;
import five.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int taskNumber;
        while (true) {
            try {
                System.out.println("Select task (1-72):");
                taskNumber = Integer.parseInt(reader.readLine());
                if (taskNumber < 1 || taskNumber > 72) throw new Exception();
                break;
            } catch (Exception exception) {
                System.out.println("Number incorrect!");
            }
        }
        switch (taskNumber) {
            case 1 -> Task01.task01(reader);
            case 2 -> Task02.task02();
            case 5 -> Task05.task05();
            case 7 -> Task07.task07();
            case 6 -> Task06.task06(reader);
            case 10 -> Task10.task10();
            case 11 -> Task11.task11(reader);
            case 16 -> Task16.task16(reader);
            case 21 -> Task21.task21(reader);
            case 26 -> Task26.task26(reader);
            case 31 -> Task31.task31(reader);
            case 36 -> Task36.task36(reader);
            case 41 -> Task41.task41(reader);
            case 46 -> Task46.task46(reader);
            case 51 -> Task51.task51(reader);
            case 56 -> Task56.task56(reader);
            case 61 -> Task61.task61(reader);
            case 66 -> Task66.task66(reader);
            case 71 -> Task71.task71(reader);
        }
    }

}
