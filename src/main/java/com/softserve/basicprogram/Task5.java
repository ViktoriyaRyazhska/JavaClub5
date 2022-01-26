package main.java.com.softserve.basicprogram;

import main.java.com.softserve.MainClass;
import main.java.com.softserve.ReadConsole;

import java.io.IOException;
import static main.java.com.softserve.statics.StaticImports.backToMenuOrRetry;
import static main.java.com.softserve.statics.StaticImports.start5TaskBasicProgram;

public class Task5 extends ReadConsole {

    static int wallLength;
    static int pixelSize;

    public static void main(String[] args) throws IOException {
        start5TaskBasicProgram();

        try {
            System.out.println("Enter size of the wall:");
            wallLength = Integer.parseInt(br.readLine());
            System.out.println("Enter size of pixel:");
            pixelSize = Integer.parseInt(br.readLine());
            if (isDivisible(wallLength, pixelSize)) {
                System.out.println("You can fit an exact number of pixels on the wall");
            }
            else {
                System.out.println("You can't fit an exact number of pixels on the wall");
            }
        } catch (IOException e) {
            System.out.println("==> Wrong input! Try again! <==");
            Task5.main(args);
        }

    backToMenuOrRetry();
        try {
        switch (br.readLine()) {
            case "1":
                MainClass.main(args);
                break;

            case "2":
                Task5.main(args);
                break;

            default:
                System.err.println("You need to do this: put 1 or 2");
                System.err.println("Transfer to menu ");
                Task5.main(args);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
    public static boolean isDivisible(int wallLength, int pixelSize) {
        return wallLength % pixelSize == 0 ? true : false;
    }
}
