package four;

import java.io.BufferedReader;
import java.util.Arrays;



    public class Task39 {
        public static int grow(int[] x){
            int multiplying =1;
            for (int i = 0; i <x.length ; i++) {
                multiplying  = multiplying  * x[i];
            }
            return multiplying ;


        }
        public static void task39(BufferedReader reader) {
            System.out.println("Given a non-empty array of integers, return the" +
                    " result of multiplying the values together in order.");


            try {
                System.out.println("Set array:");
                int[] numbersArray = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();
                System.out.println("Answer:   result of multiplying the values together  is --> " +grow(numbersArray));

            } catch (Exception e) {
                System.out.println("Invalid parameter!");
            }
        }
    }


