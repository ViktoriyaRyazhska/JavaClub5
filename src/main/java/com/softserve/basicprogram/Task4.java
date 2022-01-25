package main.java.com.softserve.basicprogram;

import main.java.com.softserve.ReadConsole;

import java.io.IOException;

import static main.java.com.softserve.statics.StaticImports.start4TaskBasicProgram;

public class Task4 extends ReadConsole {

       static String name;

    public static void main(String[] args) throws IOException {
            start4TaskBasicProgram();

            try {
                name = br.readLine();
                System.out.println("Hello," + greet(name));
            } catch (IOException e) {
                e.printStackTrace();
                Task4.main(args);
            }
    }
    public static String greet(String name){return String.format("Hello, %s!", name);
    }
}
