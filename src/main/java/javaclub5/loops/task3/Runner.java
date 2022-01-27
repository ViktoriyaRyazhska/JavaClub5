package javaclub5.loops.task3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Get the mean of an array
 *
 * @author Mysakovych Maksym
 */

public class Runner {
        public static void main(String[] args) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            start(br);
        }
        public static void start(BufferedReader br) {
            try {
                System.out.println("Enter length of array: ");
                int a = Integer.parseInt(br.readLine());
                int[] array1 = new int[a];
                int sum = 0;
                int res = 0;
                for (int i = 0; i < a; i++){
                    System.out.println("Enter mark: ");
                    array1[i] = Integer.parseInt(br.readLine());;
                    sum += array1[i];
                    if (array1.length == a){
                        res = sum/a;
                    }
                }
                System.out.println("Mean of an marks: " + res);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
}

