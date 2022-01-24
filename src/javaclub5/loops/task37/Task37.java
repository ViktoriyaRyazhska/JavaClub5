package javaclub5.loops.task37;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Task37 {
    /*
    Build a function that returns an array of integers from n to 1 where n>0.

    Example : n=5 --> [5,4,3,2,1]
     */
    public static int[] reverse(int n){
       int [] arr = new int[n];
        int i=0;

        for (int j = n; j > 0; j--) {
            System.out.print("["+(arr[i]=j)+ "]" + " ");
            i++;
        }
        return arr;
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the size of array: ");
            int n = scanner.nextInt();
            System.out.print("n=" + n + " --> ");
            reverse(n);
        }catch (Exception e) {

            System.out.println("Put correct number");

        }
    }
}


