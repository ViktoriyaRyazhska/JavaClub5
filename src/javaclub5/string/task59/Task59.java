package javaclub5.string.task59;

import java.util.Scanner;

/**
 * Created by Sergiy Zapadenko on 24.01.2022 23:19
 */
public class Task59 {
    /*
    * When provided with a letter, return its position in the alphabet.

      Input :: "a"

      Ouput :: "Position of alphabet: 1"
      * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        start(scanner);
        scanner.close();
    }

    public static void start(Scanner scanner) {
        System.out.println("Program return return letter position in the alphabet");
        while (true) {
            try {
                System.out.println("Please enter the char (or 'Exit' for finish):");
                String str = scanner.nextLine();
                if (str.equalsIgnoreCase("exit")) break;

                System.out.println(Kata.position(str.charAt(0)));
            }catch (NullPointerException e) {
                System.out.println(e.toString());
            }catch (IllegalArgumentException e){
                System.out.println(e.toString());
            } catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}
