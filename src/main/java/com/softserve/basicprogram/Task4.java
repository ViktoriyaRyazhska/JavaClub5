package main.java.com.softserve.basicprogram;

import main.java.com.softserve.MainClass;
import main.java.com.softserve.ReadConsole;

import java.io.IOException;

import static main.java.com.softserve.statics.StaticImports.backToMenuOrRetry;
import static main.java.com.softserve.statics.StaticImports.start4TaskBasicProgram;

public class Task4 extends ReadConsole {

       static int wallLength;
       static int pixelSize;

    public static void main(String[] args) throws IOException {
        start4TaskBasicProgram();

        try {
            wallLength = Integer.parseInt(br.readLine());
            System.out.println("Enter size of the wall:");
            pixelSize = Integer.parseInt(br.readLine());
            if (isDivisible(wallLength, pixelSize)) {
                System.out.println("You can find an exact number");
            }
            else {
                System.out.println("You can't find an exact number");
            }
        } catch (IOException e) {
            e.printStackTrace();
            Task4.main(args);
        }

        backToMenuOrRetry();
        try {
            switch (br.readLine()) {
                case "1":
                    MainClass.main(args);
                    break;

                case "2":
                    Task4.main(args);
                    break;

                default:
                    System.err.println("You need to do this: put 1 or 2");
                    System.err.println("Transfer to menu ");
                    Task4.main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static boolean isDivisible(int wallLength, int pixelSize){return wallLength%pixelSize==0;
    }
}
