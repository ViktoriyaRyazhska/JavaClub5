package javaclub5.loops.task34;
;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Task34 {
    public static int getAverage(int[] marks){

        return (int) IntStream.of(marks).average().orElse(0);
    }

    public static void main(Scanner sc) {
try {
    System.out.println("Enter your marks:");
    int[] marks = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::valueOf).toArray();
    for(int i=0; i<marks.length;i++){
        if (marks[i]<0||marks[i]>10){
            System.out.println("Wrong input");
            System.exit(1);
        }
    }
    System.out.println("Your average:"+getAverage(marks));
}catch (Exception e){
    System.out.println("Wrong input");
}
        }
    }

