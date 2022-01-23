import four.*;
import one.*;
import two.*;
import five.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){
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
            case 2 -> Task02.task02(reader);
            case 5 -> Task05.task05(reader);
            case 6 -> Task06.task06(reader);
            case 7 -> Task07.task07(reader);
            case 10 -> Task10.task10(reader);
            case 11 -> Task11.task11(reader);
            case 12 -> Task12.task12(reader);
            case 15 -> Task15.task15(reader);
            case 16 -> Task16.task16(reader);
            case 17 -> Task17.task17(reader);
            case 20 -> Task20.task20(reader);
            case 21 -> Task21.task21(reader);
            case 24 -> Task24.task24(reader);
            case 25 -> Task25.task25(reader);
            case 26 -> Task26.task26(reader);
            case 27 -> Task27.task27(reader);
            case 29 -> Task29.task29(reader);
            case 30 -> Task30.task30(reader);
            case 31 -> Task31.task31(reader);
            case 32 -> Task32.task32(reader);
            case 34 -> Task34.task34(reader);
            case 36 -> Task36.task36(reader);
            case 37 -> Task37.task37(reader);
            case 39 -> Task39.task39(reader);
            case 41 -> Task41.task41(reader);
            case 42 -> Task42.task42(reader);
            case 44 -> Task44.task44(reader);
            case 46 -> Task46.task46(reader);
            case 47 -> Task52.task52(reader);
            case 49 -> Task49.task49(reader);
            case 51 -> Task51.task51(reader);
            case 54 -> Task54.task54(reader);
            case 56 -> Task56.task56(reader);
            case 57 -> Task57.task57(reader);
            case 61 -> Task61.task61(reader);
            case 62 -> Task62.task62(reader);
            case 66 -> Task66.task66(reader);
            case 71 -> Task71.task71(reader);
            case 72 -> Task72.task72(reader);
        }
    }
}
