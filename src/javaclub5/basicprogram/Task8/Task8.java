package javaclub5.basicprogram.Task8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8 {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        century(bufferedReader);
    }

    public static void century(BufferedReader bufferedReader) {

        try {
            System.out.println("Enter a year: ");
            int year = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Century of this year is ");
            defineCentury(year);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void defineCentury(int a) {
        if (a <= 100) {
            System.out.println(a + " --> " + 1);
        }
    }

}
