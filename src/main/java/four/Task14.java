package four;

import java.io.BufferedReader;

public class Task14 implements Comparable<Task14>{
    private final long top;
    private final long bottom;

    public Task14(long numerator, long denominator) {
        top = numerator;
        bottom = denominator;
    }

    @Override
    public int hashCode() {
        return 17 * Long.hashCode(top) + Long.hashCode(bottom);
    }

    @Override
    public boolean equals(Object o) {
        return compareTo((Task14) o) == 0;
    }

    @Override
    public int compareTo(Task14 f2) {
        return Long.compare(top * f2.bottom, f2.top * bottom);
    }

    public Task14 add(Task14 f2) {
        if (bottom == f2.bottom) {
            long general = generalDenominator(this.top + f2.top, bottom);
            return new Task14((this.top + f2.top) / general, bottom / general);
        } else {
            long top = this.top * f2.bottom + f2.top * this.bottom;
            long bottom = this.bottom * f2.bottom;
            long general = generalDenominator(top, bottom);
            return new Task14(top / general, bottom / general);
        }
    }

    private long generalDenominator(long top, long bottom) {
        for (long i = (long)Math.sqrt(Math.max(top, bottom)); i > 1; i--) {
            if (top % i == 0 && bottom % i == 0) {
                return  i;
            }
        }
        return 1;
    }

    @Override
    public String toString() {
        return top + "/" + bottom;
    }

    public static void task14(BufferedReader reader) {
        System.out.println("You are provided with a skeleton of the class 'Fraction', " +
                "which accepts two arguments (numerator, denominator).");
        try {
            System.out.println("Set parameter numerator:");
            long n = Long.parseLong(reader.readLine());
            System.out.println("Set parameter denominator:");
            long x = Long.parseLong(reader.readLine());
            System.out.println("Set parameter numerator:");
            long y = Long.parseLong(reader.readLine());
            System.out.println("Set parameter denominator:");
            long z = Long.parseLong(reader.readLine());
            Task14 fraction1 = new Task14(n, x);
            fraction1.add(new Task14(y, z));
            System.out.println("Answer:  is--> "+ fraction1.toString());
        } catch (Exception e) {
            System.out.println("Invalid parameter!");
        }
    }
}
