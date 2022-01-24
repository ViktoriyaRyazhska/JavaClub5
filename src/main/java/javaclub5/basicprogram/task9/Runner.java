package javaclub5.basicprogram.task9;

public class Runner {
            public static int rentalCarCost(int d) {
                int total = 40 * d;
                if (d >= 7){
                    return total - 50;
                } else if (d >= 3){
                    return total - 20;
                } else {
                    return total;
                }
            }
}



